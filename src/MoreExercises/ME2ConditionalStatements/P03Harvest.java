package MoreExercises.ME2ConditionalStatements;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double grapes = x * y;
        double litersForSold = grapes * 0.40 / 2.50;
        double left = Math.ceil(litersForSold - z);
        if (litersForSold >= z) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", Math.floor(litersForSold));
            System.out.printf("%.0f liters left -> %.0f liters per person.", left, Math.ceil(left / workers));
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(z - litersForSold));
        }

    }
}
