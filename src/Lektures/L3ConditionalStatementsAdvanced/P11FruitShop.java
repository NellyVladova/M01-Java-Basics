package Lektures.L3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double bananaPrice = 0;
        double applePrice = 0;
        double orangePrice = 0;
        double grapefruitPrice = 0;
        double kiwiPrice = 0;
        double pineapplePrice = 0;
        double grapesPrice = 0;

        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")) {
                    bananaPrice = 2.50;
                    System.out.printf("%.2f", bananaPrice * quantity);
                } else if (fruit.equals("apple")) {
                    applePrice = 1.20;
                    System.out.printf("%.2f", applePrice * quantity);
                } else if (fruit.equals("orange")) {
                    orangePrice = 0.85;
                    System.out.printf("%.2f", orangePrice * quantity);
                } else if (fruit.equals("grapefruit")) {
                    grapefruitPrice = 1.45;
                    System.out.printf("%.2f", grapefruitPrice * quantity);
                } else if (fruit.equals("kiwi")) {
                    kiwiPrice = 2.70;
                    System.out.printf("%.2f", kiwiPrice * quantity);
                } else if (fruit.equals("pineapple")) {
                    pineapplePrice = 5.50;
                    System.out.printf("%.2f", pineapplePrice * quantity);
                } else if (fruit.equals("grapes")) {
                    grapesPrice = 3.85;
                    System.out.printf("%.2f", grapesPrice* quantity);
                } else {
                    System.out.println("error");
                }
                break;
            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")) {
                    bananaPrice = 2.70;
                    System.out.printf("%.2f", bananaPrice * quantity);
                } else if (fruit.equals("apple")) {
                    applePrice = 1.25;
                    System.out.printf("%.2f", applePrice * quantity);
                } else if (fruit.equals("orange")) {
                    orangePrice = 0.90;
                    System.out.printf("%.2f", orangePrice * quantity);
                } else if (fruit.equals("grapefruit")) {
                    grapefruitPrice = 1.60;
                    System.out.printf("%.2f", grapefruitPrice * quantity);
                } else if (fruit.equals("kiwi")) {
                    kiwiPrice = 3.00;
                    System.out.printf("%.2f", kiwiPrice * quantity);
                } else if (fruit.equals("pineapple")) {
                    pineapplePrice = 5.60;
                    System.out.printf("%.2f", pineapplePrice * quantity);
                } else if (fruit.equals("grapes")) {
                    grapesPrice = 4.20;
                    System.out.printf("%.2f", grapesPrice* quantity);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }

    }
}
