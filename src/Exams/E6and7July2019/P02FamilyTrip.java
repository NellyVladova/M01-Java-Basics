package Exams.E6and7July2019;

import java.util.Scanner;

public class P02FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int sleepNight = Integer.parseInt(scanner.nextLine());
        double sleepNightPrice = Double.parseDouble(scanner.nextLine());
        double percentForOtherThings = Double.parseDouble(scanner.nextLine());
        percentForOtherThings/=100;
        if(sleepNight>7){
            sleepNightPrice*=0.95;
        }
        double finalMoney = sleepNight*sleepNightPrice +percentForOtherThings*budget;
        if(finalMoney<=budget){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget-finalMoney);
        }else {
            System.out.printf("%.2f leva needed.", finalMoney-budget);
        }
    }
}
