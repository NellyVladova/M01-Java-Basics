package Lektures.L3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double coffeePrice = 0;
        double waterPrice = 0;
        double beerPrice = 0;
        double sweetsPrice = 0;
        double peanutsPrice = 0;

        switch (product) {
            case "coffee":
                if (town.equals("Sofia")) {
                    coffeePrice = 0.50;
                } else if (town.equals("Plovdiv")) {
                    coffeePrice = 0.40;
                } else {
                    coffeePrice = 0.45;
                }
                System.out.printf("%f", coffeePrice * quantity);
                break;
            case "water":
                if (town.equals("Sofia")) {
                    waterPrice = 0.80;
                } else if (town.equals("Plovdiv")) {
                    waterPrice = 0.70;
                } else {
                    waterPrice = 0.70;
                }
                System.out.printf("%f", waterPrice * quantity);
                break;
            case "beer":
                if (town.equals("Sofia")) {
                    beerPrice  = 1.20;
                } else if (town.equals("Plovdiv")) {
                    beerPrice  = 1.15;
                } else {
                    beerPrice  = 1.10;
                }
                System.out.printf("%f", beerPrice * quantity);
                break;
            case "sweets":
                if (town.equals("Sofia")) {
                    sweetsPrice = 1.45;
                } else if (town.equals("Plovdiv")) {
                    sweetsPrice = 1.30;
                } else {
                    sweetsPrice = 1.35;
                }
                System.out.printf("%f", sweetsPrice * quantity);
                break;
            case "peanuts":
                if (town.equals("Sofia")) {
                    peanutsPrice = 1.60;
                } else if (town.equals("Plovdiv")) {
                    peanutsPrice = 1.50;
                } else {
                    peanutsPrice = 1.55;
                }
                System.out.printf("%f", peanutsPrice * quantity);
                break;
        }

    }
}
