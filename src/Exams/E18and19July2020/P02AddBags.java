package Exams.E18and19July2020;

import java.util.Scanner;

public class P02AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double luggagePriceMoreThan20kilo = Double.parseDouble(scanner.nextLine());
        double luggageKilos = Double.parseDouble(scanner.nextLine());
        int daysBeforeTheTrip = Integer.parseInt(scanner.nextLine());
        int luggageNumber = Integer.parseInt(scanner.nextLine());

        double luggagePrice = 0;

        if (luggageKilos < 10) {
            luggagePrice = luggagePriceMoreThan20kilo * 0.20;
        } else if (luggageKilos <= 20) {
            luggagePrice = luggagePriceMoreThan20kilo * 0.50;
        } else {
            luggagePrice = luggagePriceMoreThan20kilo;
        }
        if (daysBeforeTheTrip > 30) {
            luggagePrice *= 1.10;
        } else if (daysBeforeTheTrip >= 7) {
            luggagePrice *= 1.15;
        } else {
            luggagePrice *= 1.40;
        }
        System.out.printf("The total price of bags is: %.2f lv.", luggagePrice * luggageNumber);
    }
}
