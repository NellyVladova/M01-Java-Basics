package Exams.E15and16June2019;

import java.util.Scanner;

public class P03FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        String packetType = scanner.nextLine();
        int ticketNumber = Integer.parseInt(scanner.nextLine());
        double ticketPrice = 0;


        switch (movieName) {
            case "John Wick":
                if (packetType.equals("Drink")) {
                    ticketPrice = 12;
                } else if (packetType.equals("Popcorn")) {
                    ticketPrice = 15;
                } else if (packetType.equals("Menu")) {
                    ticketPrice = 19;
                }
                break;
            case "Star Wars":
                if (packetType.equals("Drink")) {
                    ticketPrice = 18;
                } else if (packetType.equals("Popcorn")) {
                    ticketPrice = 25;
                } else if (packetType.equals("Menu")) {
                    ticketPrice = 30;
                }
                if (ticketNumber >= 4) {
                    ticketPrice *= 0.70;
                }
                break;
            case "Jumanji":
                if (packetType.equals("Drink")) {
                    ticketPrice = 9;
                } else if (packetType.equals("Popcorn")) {
                    ticketPrice = 11;
                } else if (packetType.equals("Menu")) {
                    ticketPrice = 14;
                }
                if(ticketNumber==2){
                    ticketPrice*=0.85;
                }
                break;
        }
        System.out.printf("Your bill is %.2f leva.", ticketNumber*ticketPrice);
    }
}
