package Exercises.E3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String holidayType = "";
        String destination = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                budget *= 0.30;
                holidayType = "Camp";
            } else if (season.equals("winter")) {
                budget *= 0.70;
                holidayType = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                budget *= 0.40;
                holidayType = "Camp";
            } else if (season.equals("winter")) {
                budget *= 0.80;
                holidayType = "Hotel";
            }
        } else {
            destination = "Europe";
            budget *= 0.90;
            holidayType = "Hotel";
        }
        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f", holidayType, budget);
    }
}
