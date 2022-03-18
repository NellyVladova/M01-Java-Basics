package Exams.E15and16June2019;

import java.util.Scanner;

public class P02MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeForActing = Integer.parseInt(scanner.nextLine());
        int scenesNumber = Integer.parseInt(scanner.nextLine());
        int timeForScene = Integer.parseInt(scanner.nextLine());

        double timeForPreparation = timeForActing*0.15;
        double totalTime = timeForScene*scenesNumber+timeForPreparation;
        if(totalTime<=timeForActing){
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", timeForActing-totalTime);
        }else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", totalTime-timeForActing);
        }
    }
}
