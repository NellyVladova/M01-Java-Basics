package Exams.E28and29March2020;

import java.util.Scanner;

public class P01SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pencilPacks = Integer.parseInt(scanner.nextLine());
        int markersPacks = Integer.parseInt(scanner.nextLine());
        double preparationLiters = Double.parseDouble(scanner.nextLine());
        int reductionPercent = Integer.parseInt(scanner.nextLine());

        double finalPrice = 0;
        double pencilPrice = pencilPacks*5.80;
        double markersPrice = markersPacks*7.20;
        double preparationPrice = preparationLiters*1.20;
        finalPrice = pencilPrice+markersPrice+preparationPrice;
        finalPrice = finalPrice - (finalPrice*reductionPercent/100);

        System.out.printf("%.3f", finalPrice);
    }
}
