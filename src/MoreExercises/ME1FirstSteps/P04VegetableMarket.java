package MoreExercises.ME1FirstSteps;

import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vegetablesPrice = Double.parseDouble(scan.nextLine());
        double fruitsPrice = Double.parseDouble(scan.nextLine());
        double vegetablesKg = Double.parseDouble(scan.nextLine());
        double fruitsKg = Double.parseDouble(scan.nextLine());

        double totalPrice = (vegetablesPrice * vegetablesKg) + (fruitsPrice * fruitsKg);
        double totalPriceInEuro = totalPrice / 1.94;

        System.out.printf("%.2f", totalPriceInEuro);
    }
}
