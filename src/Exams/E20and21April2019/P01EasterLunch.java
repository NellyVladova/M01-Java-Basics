package Exams.E20and21April2019;

import java.util.Scanner;

public class P01EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterCakeNumber = Integer.parseInt(scanner.nextLine());
        int eggsCoverNumber = Integer.parseInt(scanner.nextLine());
        int cookiesKg = Integer.parseInt(scanner.nextLine());

        double priceForEasterCake = easterCakeNumber * 3.20;
        double priceForEggs = eggsCoverNumber * 4.35;
        double priceForCookies = cookiesKg * 5.40;
        double priceForEggPaint = eggsCoverNumber * 12 * 0.15;

        System.out.printf("%.2f", priceForEasterCake + priceForEggs + priceForCookies + priceForEggPaint);
    }
}
