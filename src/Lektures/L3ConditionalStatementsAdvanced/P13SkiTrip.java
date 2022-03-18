package Lektures.L3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P13SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String rate = scanner.nextLine();

        int sleepNights = days - 1;
        double roomPrice = 0;
        double finalPrice = 0;

        if (room.equals("room for one person")) {
            roomPrice = 18;
            finalPrice = roomPrice * sleepNights;
        } else if (room.equals("apartment")) {
            roomPrice = 25;
            finalPrice = roomPrice * sleepNights;
            if (sleepNights < 10) {
                finalPrice *= 0.70;
            } else if (sleepNights <= 15) {
                finalPrice *= 0.65;
            } else {
                finalPrice *= 0.50;
            }

        } else if (room.equals("president apartment")) {
            roomPrice = 35;
            finalPrice = roomPrice * sleepNights;
            if (sleepNights < 10) {
                finalPrice *= 0.90;
            } else if (sleepNights <= 15) {
                finalPrice *= 0.85;
            } else {
                finalPrice *= 0.80;
            }
        }


        if (rate.equals("positive")) {
            finalPrice *= 1.25;
        } else if (rate.equals("negative")) {
            finalPrice *= 0.90;
        }

        System.out.printf("%.2f\n", finalPrice);
    }
}
