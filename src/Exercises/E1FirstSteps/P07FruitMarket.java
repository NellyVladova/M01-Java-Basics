package Exercises.E1FirstSteps;

import java.util.Scanner;

public class P07FruitMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double strawberryPrice = Double.parseDouble(scan.nextLine());
        double bananasKg = Double.parseDouble(scan.nextLine());
        double orangesKg = Double.parseDouble(scan.nextLine());
        double raspberriesKg = Double.parseDouble(scan.nextLine());
        double strawberriesKg = Double.parseDouble(scan.nextLine());

        double raspberriesPrice = strawberryPrice/2;
        double orangesPrice = raspberriesPrice * 0.60;
        double bananasPrice = raspberriesPrice * 0.20;
        double finalPriceStrawberries = strawberriesKg * strawberryPrice;
        double finalPriceRaspberries = raspberriesPrice * raspberriesKg;
        double finalPriceBananas = bananasPrice * bananasKg;
        double finalPriceOranges = orangesPrice * orangesKg;
        double totalPrice = finalPriceStrawberries + finalPriceRaspberries + finalPriceBananas + finalPriceOranges;

        System.out.printf("%.2f", totalPrice);

    }
}
