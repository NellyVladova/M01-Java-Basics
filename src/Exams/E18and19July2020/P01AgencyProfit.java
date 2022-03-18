package Exams.E18and19July2020;

import java.util.Scanner;

public class P01AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String airCompany = scanner.nextLine();
        int ticketsForAdults = Integer.parseInt(scanner.nextLine());
        int ticketsForKIds = Integer.parseInt(scanner.nextLine());
        double adultTicketPrice = Double.parseDouble(scanner.nextLine());
        double servicePrice = Double.parseDouble(scanner.nextLine());

        double kidTicketPrice = 0;
        double finalMoney = 0;
        double finalMoneyPerAdult = adultTicketPrice + servicePrice;

        kidTicketPrice = adultTicketPrice * 0.3 + servicePrice;
        finalMoney = finalMoneyPerAdult*ticketsForAdults + ticketsForKIds * kidTicketPrice;
        double profit = finalMoney * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", airCompany, profit);
    }
}
