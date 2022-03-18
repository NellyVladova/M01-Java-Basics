package Exams.E9and10March2019;

import java.util.Scanner;

public class P05TennisRankList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentNumber = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());
        int totalPoints = 0;
        double averagePointsFromTournaments = 0;
        int winCount = 0;

        totalPoints+=initialPoints;
        for (int i = 1; i <= tournamentNumber ; i++) {
            String stage = scanner.nextLine();
            switch (stage){
                case "W":
                    totalPoints+=2000;
                    winCount++;
                    break;
                case "F":
                    totalPoints+=1200;
                    break;
                case "SF":
                    totalPoints+=720;
                    break;
            }
        }
        averagePointsFromTournaments = (totalPoints-initialPoints)*1.0/tournamentNumber;

        System.out.printf("Final points: %d\n", totalPoints);
        System.out.printf("Average points: %.0f\n", Math.floor(averagePointsFromTournaments));
        System.out.printf("%.2f%%\n", winCount*1.0/tournamentNumber*100);
    }
}
