package MoreExercises.ME3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int members = Integer.parseInt(scanner.nextLine());

        double vipPrice = 499.99;
        double normalPrice = 249.99;

        if (category.equals("VIP")) {
            if (members <= 4) {
                budget *= 0.25;
            } else if (members <= 9) {
                budget *= 0.40;
            } else if (members <= 24) {
                budget *= 0.50;
            } else if (members <= 49) {
                budget *= 0.60;
            } else {
                budget *= 0.75;
            }
            double finalPrice = vipPrice * members;
            if (finalPrice <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - finalPrice);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", finalPrice-budget);
            }
        } else if (category.equals("Normal")) {
            if (members <= 4) {
                budget *= 0.25;
            } else if (members <= 9) {
                budget *= 0.40;
            } else if (members <= 24) {
                budget *= 0.50;
            } else if (members <= 49) {
                budget *= 0.60;
            } else {
                budget *= 0.75;
            }
            double finalPrice = normalPrice * members;
            if (budget >= normalPrice) {
                System.out.printf("Yes! You have %.2f leva left.", budget - finalPrice);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", finalPrice - budget);
            }

        }
    }
}
