package Lektures.L6NestedLoops;

import java.util.Scanner;

public class P07CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int studentCount = 0;
        int standardCount = 0;
        int kidCount = 0;
        int allTickets = 0;

        while (!input.equals("Finish")) {
            String movieName = input;
            int seats = Integer.parseInt(scanner.nextLine());

            int ticketsCount = 0;
            String command = scanner.nextLine();
            while (!command.equals("End")) {
                String ticketType = command;
                switch (ticketType) {
                    case "student":
                        studentCount++;
                        break;
                    case "standard":
                        standardCount++;
                        break;
                    case "kid":
                        kidCount++;
                        break;
                }
                ticketsCount++;
                allTickets++;
                if (ticketsCount == seats) {
                    break;
                }
                command = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.\n", movieName, ticketsCount * 1.00 / seats * 100);
            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d\n", allTickets);
        System.out.printf("%.2f%% student tickets.\n", studentCount * 1.00 / allTickets * 100);
        System.out.printf("%.2f%% standard tickets.\n", standardCount * 1.00 / allTickets * 100);
        System.out.printf("%.2f%% kids tickets.\n", kidCount * 1.00 / allTickets * 100);
    }
}
