package Exams.FinalExam;

import java.util.Scanner;

public class P06GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int locationNumbers = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= locationNumbers; i++) {
            double averageGoldPerDay = Double.parseDouble(scanner.nextLine());
            int daysForWorking = Integer.parseInt(scanner.nextLine());
            double averageGold = 0;

            for (int j = 1; j <= daysForWorking; j++) {
                double gainGoldForThisDay = Double.parseDouble(scanner.nextLine());
                averageGold+=gainGoldForThisDay;
            }
            averageGold/=daysForWorking;
            if(averageGold>=averageGoldPerDay){
                System.out.printf("Good job! Average gold per day: %.2f.\n", averageGold);
            }else {
                System.out.printf("You need %.2f gold.\n", averageGoldPerDay-averageGold);
            }
        }
    }
}
