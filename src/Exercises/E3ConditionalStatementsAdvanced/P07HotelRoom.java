package Exercises.E3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int sleepnights = Integer.parseInt(scanner.nextLine());
        double studio = 0;
        double apartment = 0;

        switch (month) {
            case "May":
            case "October":
                studio = 50.00;
                apartment = 65.00;
                if (sleepnights > 7 && sleepnights <= 14) {
                    studio *= 0.95;
                } else if (sleepnights > 14) {
                    studio *= 0.70;
                    apartment *= 0.90;
                }

                break;
            case "June":
            case "September":
                studio = 75.20;
                apartment = 68.70;
                if (sleepnights > 14) {
                    studio *= 0.80;
                    apartment *= 0.90;
                }
                break;
            case "July":
            case "August":
                studio = 76.00;
                apartment = 77.00;
                if (sleepnights > 14) {
                    apartment *= 0.90;
                }
                break;
        }

        System.out.printf("Apartment: %.2f lv.\n", apartment * sleepnights);
        System.out.printf("Studio: %.2f lv.", studio * sleepnights);

    }
}
