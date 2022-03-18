package Exams.E6and7April2019;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int studentCount = 0;
        int standardCount = 0;
        int kidCount = 0;
        int allTickets = 0;

        while (!movieName.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            int busySeats = 0;
            while (!ticketType.equals("End")) {
                if (ticketType.equals("student")) {
                    studentCount++;
                    busySeats++;
                } else if (ticketType.equals("standard")) {
                    standardCount++;
                    busySeats++;
                } else if (ticketType.equals("kid")) {
                    kidCount++;
                    busySeats++;
                }
                if(busySeats>=freeSeats){
                    break;
                }
                ticketType = scanner.nextLine();
            }
            allTickets+=busySeats;
            System.out.printf("%s - %.2f%% full.\n", movieName, busySeats*1.00/freeSeats*100);
            movieName = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d\n", allTickets);
        System.out.printf("%.2f%% student tickets.\n", studentCount*1.00/allTickets*100);
        System.out.printf("%.2f%% standard tickets.\n", standardCount*1.00/allTickets*100);
        System.out.printf("%.2f%% kids tickets.\n", kidCount*1.00/allTickets*100);
    }
}
