package Exams.E2and3May2019;

import java.util.Scanner;

public class P01FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenuNumber = Integer.parseInt(scanner.nextLine());
        int fishMenuNumber = Integer.parseInt(scanner.nextLine());
        int vegetarianMenuNumber = Integer.parseInt(scanner.nextLine());

        double moneyFromChicken = chickenMenuNumber * 10.35;
        double moneyFromFish = fishMenuNumber * 12.40;
        double moneyFromVegetarianMenu = vegetarianMenuNumber * 8.15;
        double finalBill = moneyFromChicken + moneyFromFish + moneyFromVegetarianMenu;
        double moneyFromDessert = finalBill * 0.20;
        finalBill += (moneyFromDessert + 2.50);

        System.out.printf("Total: %.2f", finalBill);
    }
}
