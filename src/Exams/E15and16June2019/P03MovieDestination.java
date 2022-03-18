package Exams.E15and16June2019;

import java.util.Scanner;

public class P03MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double priceForOneDay = 0;

        switch (destination) {
            case "Dubai":
                if (season.equals("Winter")) {
                    priceForOneDay = 45000;
                } else if (season.equals("Summer")) {
                    priceForOneDay = 40000;
                }
                priceForOneDay *= 0.70;
                break;
            case "Sofia":
                if (season.equals("Winter")) {
                    priceForOneDay = 17000;
                } else if (season.equals("Summer")) {
                    priceForOneDay = 12500;
                }
                priceForOneDay *= 1.25;
                break;
            case "London":
                if (season.equals("Winter")) {
                    priceForOneDay = 24000;
                } else if (season.equals("Summer")) {
                    priceForOneDay = 20250;
                }
                break;
        }
        double totalMoney = priceForOneDay * days;
        if(totalMoney<=budget){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget-totalMoney);
        }else {
            System.out.printf("The director needs %.2f leva more!", totalMoney-budget);
        }
    }
}
