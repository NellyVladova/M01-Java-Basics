package Exams.E2and3May2019;

import java.util.Scanner;

public class P02Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double fuelLiters = Double.parseDouble(scanner.nextLine());
        String dayOfTheWeek = scanner.nextLine();
        double moneyForFuel = fuelLiters*2.10;
        double totalMoney = moneyForFuel+100;

        switch (dayOfTheWeek){
            case "Saturday":
                totalMoney*=0.90;
                break;
            case "Sunday":
                totalMoney*=0.80;
                break;
        }
        if(totalMoney<=budget){
            System.out.printf("Safari time! Money left: %.2f lv.", budget-totalMoney);
        }else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", totalMoney-budget);
        }
    }
}
