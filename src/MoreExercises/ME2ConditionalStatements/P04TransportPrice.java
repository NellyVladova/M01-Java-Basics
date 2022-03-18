package MoreExercises.ME2ConditionalStatements;

import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        double tariff = 0;
        double finalBill = 0;

        switch (time) {
            case "day":
                if (km < 20) {
                    tariff = 0.79;
                } else if (km < 100) {
                    tariff = 0.09;
                } else {
                    tariff = 0.06;
                }
                break;
            case "night":
                if (km < 20) {
                    tariff = 0.90;
                } else if (km < 100) {
                    tariff = 0.09;
                } else {
                    tariff = 0.06;
                }
                break;
        }
        if (km < 20) {
            double startTariff = 0.70;
            finalBill = (tariff * km) + startTariff;
        } else {
            finalBill = tariff * km;
        }
        System.out.printf("%.2f", finalBill);
    }
}
