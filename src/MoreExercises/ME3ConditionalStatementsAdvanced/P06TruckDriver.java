package MoreExercises.ME3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());
        double moneyPerKm = 0;
        double finalMoney = 0;

        switch (season){
            case "Spring":
            case "Autumn":
                if(kmPerMonth<=5000){
                    moneyPerKm = 0.75;
                }else if(kmPerMonth<=10000){
                    moneyPerKm = 0.95;
                }else if (kmPerMonth<=20000){
                    moneyPerKm = 1.45;
                }
                break;
            case "Summer":
                if(kmPerMonth<=5000){
                    moneyPerKm = 0.90;
                }else if(kmPerMonth<=10000){
                    moneyPerKm = 1.10;
                }else if (kmPerMonth<=20000){
                    moneyPerKm = 1.45;
                }
                break;
            case "Winter":
                if(kmPerMonth<=5000){
                    moneyPerKm = 1.05;
                }else if(kmPerMonth<=10000){
                    moneyPerKm = 1.25;
                }else if (kmPerMonth<=20000){
                    moneyPerKm = 1.45;
                }
                break;
        }
        finalMoney = moneyPerKm*kmPerMonth*4;
        finalMoney*=0.90;
        System.out.printf("%.2f", finalMoney);
    }
}
