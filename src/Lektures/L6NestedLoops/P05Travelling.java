package Lektures.L6NestedLoops;

import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            double priceDestination = Double.parseDouble(scanner.nextLine());
            String destination = input;

            double sum = 0;
            while (sum < priceDestination) {
                double amount = Double.parseDouble(scanner.nextLine());
                sum += amount;
            }
            System.out.printf("Going to %s!\n", destination);
            input = scanner.nextLine();
        }
    }
}
