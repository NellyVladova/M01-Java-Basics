package MoreExercises.ME4ForLoop;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double cargoCount = 0;
        double pricePerTon = 0;
        double lessThan3TonsPrice = 0;
        double lessThan11TonsPrice = 0;
        double moreThan12Price = 0;
        int lessThan3TonsCounter = 0;
        int lessThan11TonsCounter = 0;
        int moreThan12TonsCounter = 0;
        double averageTons = 0;


        for (int i = 0; i < n; i++) {
            int cargoTons = Integer.parseInt(scanner.nextLine());
            cargoCount += cargoTons;

            if (cargoTons <= 3) {
                pricePerTon = 200.00;
                lessThan3TonsCounter += cargoTons;
                lessThan3TonsPrice = lessThan3TonsCounter * pricePerTon;
            } else if (cargoTons <= 11) {
                pricePerTon = 175.00;
                lessThan11TonsCounter += cargoTons;
                lessThan11TonsPrice = lessThan11TonsCounter * pricePerTon;

            } else {
                pricePerTon = 120.00;
                moreThan12TonsCounter += cargoTons;
                moreThan12Price = moreThan12TonsCounter * pricePerTon;
            }
        }
        averageTons = (lessThan3TonsPrice + lessThan11TonsPrice + moreThan12Price)/cargoCount;
        System.out.printf("%.2f\n", averageTons);
        System.out.printf("%.2f%%\n", lessThan3TonsCounter / cargoCount * 100);
        System.out.printf("%.2f%%\n", lessThan11TonsCounter / cargoCount * 100);
        System.out.printf("%.2f%%\n", moreThan12TonsCounter / cargoCount * 100);
    }
}
