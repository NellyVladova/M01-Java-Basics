package Exams.E15and16June2019;

import java.util.Scanner;

public class P01MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int ticketNumber = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int percentForTheCinema = Integer.parseInt(scanner.nextLine());

        double totalMoney = days*ticketNumber*ticketPrice;
        double moneyForCinema = totalMoney*percentForTheCinema/100;
        totalMoney-=moneyForCinema;
        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, totalMoney);
    }
}
