package Exercises.E3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());

        int examTime = examHour * 60 + examMinutes;
        int arriveTime = arriveHour * 60 + arriveMinutes;

        if (arriveTime < examTime - 30) {//early
            System.out.println("Early");
            int difference = examTime - arriveTime;
            if (difference < 60) {
                System.out.printf("%d minutes before the start", difference);
            } else {
                int hours = difference / 60;
                int minutes = difference % 60;
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            }
        } else if (arriveTime <= examTime) {//on time
            int difference = examTime - arriveTime;
            System.out.println("On time");
            if (difference > 0) {
                System.out.printf("%d minutes before the start", difference);
            }
        } else {//late
            int difference = arriveTime - examTime;
            System.out.println("Late");
            if (difference < 60) {
                System.out.printf("%d minutes after the start", difference);
            } else {
                int hours = difference / 60;
                int minutes = difference % 60;
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            }
        }
    }
}
