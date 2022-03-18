package MoreExercises.ME3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorCyclists = Integer.parseInt(scanner.nextLine());
        int seniorCyclists = Integer.parseInt(scanner.nextLine());
        String road = scanner.nextLine();

        double juniorCharge = 0;
        double seniorCharge = 0;
        double savedMoney = 0;

        switch (road) {
            case "trail":
                juniorCharge = 5.50;
                seniorCharge = 7.00;
                break;
            case "cross-country":
                if ((juniorCyclists + seniorCyclists) >= 50) {
                    juniorCharge = 8.00 * 0.75;
                    seniorCharge = 9.50 * 0.75;
                } else {
                    juniorCharge = 8.00;
                    seniorCharge = 9.50;
                }
                break;
            case "downhill":
                juniorCharge = 12.25;
                seniorCharge = 13.75;
                break;
            case "road":
                juniorCharge = 20;
                seniorCharge = 21.50;
                break;
        }

        savedMoney = juniorCyclists * juniorCharge + seniorCyclists * seniorCharge;
        savedMoney *= 0.95;

        System.out.printf("%.2f", savedMoney);

    }
}
