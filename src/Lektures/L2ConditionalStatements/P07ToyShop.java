package Lektures.L2ConditionalStatements;

import java.util.Scanner;

public class P07ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tour = Double.parseDouble(scan.nextLine());
        int puzzles = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int teddyBears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());

        double priceForAllToys = (puzzles * 2.60) + (dolls * 3) + (teddyBears * 4.10) + (minions * 8.20) + (trucks * 2);
        int allToys = puzzles + dolls + teddyBears + minions + trucks;
        if (allToys >= 50){
            priceForAllToys = priceForAllToys * 0.75;
        }
        double rent = priceForAllToys * 0.1;
        double finalPrice = priceForAllToys - rent;
        if (finalPrice >= tour){
            System.out.printf("Yes! %.2f lv left.", finalPrice - tour);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", tour - finalPrice);
        }
    }
}
