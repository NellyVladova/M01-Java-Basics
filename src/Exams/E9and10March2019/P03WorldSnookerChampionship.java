package Exams.E9and10March2019;

import java.util.Scanner;

public class P03WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int ticketNumber = Integer.parseInt(scanner.nextLine());
        String photoWithTrophy = scanner.nextLine();
        double ticketPrice = 0;
        double totalPrice = 0;

        switch (stage) {
            case "Quarter final":
                if (ticketType.equals("Standard")) {
                    ticketPrice = 55.50;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice = 105.20;
                } else if (ticketType.equals("VIP")) {
                    ticketPrice = 118.90;
                }
                break;
            case "Semi final":
                if (ticketType.equals("Standard")) {
                    ticketPrice = 75.88;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice = 125.22;
                } else if (ticketType.equals("VIP")) {
                    ticketPrice = 300.40;
                }
                break;
            case "Final":
                if (ticketType.equals("Standard")) {
                    ticketPrice = 110.10;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice = 160.66;
                } else if (ticketType.equals("VIP")) {
                    ticketPrice = 400;
                }
                break;
        }
        totalPrice = ticketPrice * ticketNumber;

        if (totalPrice > 4000) {
            totalPrice *= 0.75;
        } else if (totalPrice > 2500) {
            totalPrice *= 0.90;
            if (photoWithTrophy.equals("Y")) {
                totalPrice += (ticketNumber * 40);
            }
        }else {
            if (photoWithTrophy.equals("Y")) {
                totalPrice += (ticketNumber * 40);
            }
        }

        System.out.printf("%.2f", totalPrice);
    }
}
