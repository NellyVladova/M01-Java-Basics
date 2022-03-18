package Exercises.E3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P09Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String yearType = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());//praznici
        int h = Integer.parseInt(scanner.nextLine());//broj uikendi

        int weekendsInSofia = 48 - h;
        double satGamesInSofia = (weekendsInSofia * 1.00 * 3 / 4);
        int gamesInHomeTown = 48 - weekendsInSofia;
        double gamesInHoliday = p * 1.00 * 2 / 3;
        double allGames = satGamesInSofia + gamesInHomeTown + gamesInHoliday;

        switch (yearType) {
            case "leap":
                allGames *= 1.15;
                System.out.printf("%.0f\n", Math.floor(allGames));
                break;
            case "normal":
                System.out.printf("%.0f\n", Math.floor(allGames));
                break;
        }

    }
}
