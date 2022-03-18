package Exams.E15and16June2019;

import java.util.Scanner;

public class P02LunchBreak {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String movieName = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        double breakTime = Double.parseDouble(scanner.nextLine());
        double timeForLunch = breakTime/8;
        double timeForRest = breakTime*0.25;
        breakTime-=(timeForLunch+timeForRest);
        if(breakTime>=episodeTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", movieName, Math.ceil(breakTime-episodeTime));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", movieName, Math.ceil(episodeTime-breakTime));
        }
    }
}
