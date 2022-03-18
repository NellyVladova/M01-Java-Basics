package MoreExercises.ME3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemum = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String isHoliday = scanner.nextLine();

        double chrysanthemumPrice = 0;
        double rosesPrice = 0;
        double tulipsPrice = 0;
        double bouquetPrice = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                chrysanthemumPrice = 2.00;
                rosesPrice = 4.10;
                tulipsPrice = 2.50;
                break;
            case "Autumn":
            case "Winter":
                chrysanthemumPrice = 3.75;
                rosesPrice = 4.50;
                tulipsPrice = 4.15;
                break;
        }
        if (isHoliday.equals("Y")) {
            chrysanthemumPrice *= 1.15;
            rosesPrice *= 1.15;
            tulipsPrice *= 1.15;
        }
        bouquetPrice = chrysanthemum * chrysanthemumPrice + roses * rosesPrice + tulips * tulipsPrice;
        if (tulips > 7 && season.equals("Spring")) {
            bouquetPrice *= 0.95;
        }
        if (roses >= 10 && season.equals("Winter")) {
            bouquetPrice *= 0.90;
        }
        if (chrysanthemum + roses + tulips > 20) {
            bouquetPrice *= 0.80;
        }
        System.out.printf("%.2f", bouquetPrice + 2);

    }
}
