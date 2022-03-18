package Exams.E20and21April2019;

import java.util.Scanner;

public class P01EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double flourPricePerOneKilo = Double.parseDouble(scanner.nextLine());
        double flourKg = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int eggsCover = Integer.parseInt(scanner.nextLine());
        int yeastNumber = Integer.parseInt(scanner.nextLine());

        double sugarPricePerOneKilo = flourPricePerOneKilo * 0.75;
        double eggsPrice = flourPricePerOneKilo * 1.10;
        double yeastPrice = sugarPricePerOneKilo * 0.20;
        double totalPrice = flourPricePerOneKilo * flourKg + sugarPricePerOneKilo * sugarKg + eggsPrice * eggsCover + yeastPrice * yeastNumber;
        System.out.printf("%.2f", totalPrice);
    }
}
