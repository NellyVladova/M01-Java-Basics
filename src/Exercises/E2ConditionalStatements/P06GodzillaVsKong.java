package Exercises.E2ConditionalStatements;

import java.util.Scanner;

public class P06GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scab = new Scanner(System.in);
        double budget = Double.parseDouble(scab.nextLine());
        int extra = Integer.parseInt(scab.nextLine());
        double clothePrice = Double.parseDouble(scab.nextLine());
        double decor = budget*0.1;
        double moneyForClothes = extra * clothePrice;

        if(extra>150){
            moneyForClothes*=0.9;
        }
        double finalMoney = decor + moneyForClothes;

        if(finalMoney > budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", finalMoney - budget);
        } else {
            System.out.println("Action!" );
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - finalMoney);
        }
    }
}
