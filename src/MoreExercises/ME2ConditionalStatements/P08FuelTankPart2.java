package MoreExercises.ME2ConditionalStatements;

import java.util.Scanner;

public class P08FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double fuelLiters = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double gasolinePricePerLiter = 2.22;
        double dieselPricePerLiter = 2.33;
        double gasPricePerLiter = 0.93;
        double finalPrice = 0;

        if (clubCard.equals("Yes")) {
            switch (fuelType) {
                case "Gasoline":
                    gasolinePricePerLiter -= 0.18;
                    finalPrice = gasolinePricePerLiter * fuelLiters;
                    break;
                case "Diesel":
                    dieselPricePerLiter -= 0.12;
                    finalPrice = dieselPricePerLiter * fuelLiters;
                    break;
                case "Gas":
                    gasPricePerLiter -= 0.08;
                    finalPrice = gasPricePerLiter * fuelLiters;
                    break;
            }
        } else {
            switch (fuelType) {
                case "Gasoline":
                    finalPrice = gasolinePricePerLiter * fuelLiters;
                    break;
                case "Diesel":
                    finalPrice = dieselPricePerLiter * fuelLiters;
                    break;
                case "Gas":
                    finalPrice = gasPricePerLiter * fuelLiters;
                    break;
            }
        }

        if (fuelLiters >= 20 && fuelLiters <= 25) {
            finalPrice *= 0.92;
        } else if (fuelLiters > 25) {
            finalPrice *= 0.90;
        }

        System.out.printf("%.2f lv.", finalPrice);
    }
}
