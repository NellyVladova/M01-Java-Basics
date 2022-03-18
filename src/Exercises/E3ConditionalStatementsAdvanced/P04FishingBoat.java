package Exercises.E3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());
        double boatPrice = 0;

        switch (season) {
            case "Spring":
                boatPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                boatPrice = 4200;
                break;
            case "Winter":
                boatPrice = 2600;
                break;
        }
        if (fishers <= 6) {
            boatPrice *= 0.90;
        } else if (fishers <= 11) {
            boatPrice *= 0.85;
        } else {
            boatPrice *= 0.75;
        }
        if (season.equals("Spring") || season.equals("Summer") || season.equals("Winter")) {
            if (fishers % 2 == 0) {
                boatPrice *= 0.95;
            }
        }
        if (budget >= boatPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - boatPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", boatPrice - budget);
        }
    }
}
