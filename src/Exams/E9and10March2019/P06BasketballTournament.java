package Exams.E9and10March2019;

import java.util.Scanner;

public class P06BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tournamentName = scanner.nextLine();

        int winCount = 0;
        int lostCount = 0;
        int allMatches = 0;

        while (!tournamentName.equals("End of tournaments")) {
            int matchNumber = Integer.parseInt(scanner.nextLine());
            allMatches += matchNumber;
            for (int i = 1; i <= matchNumber; i++) {
                int desiTeamPoints = Integer.parseInt(scanner.nextLine());
                int otherTeamPoints = Integer.parseInt(scanner.nextLine());
                boolean desiWin = false;
                boolean desiLost = false;
                if (desiTeamPoints > otherTeamPoints) {
                    desiWin = true;
                    winCount++;
                } else {
                    desiLost = true;
                    lostCount++;
                }
                if (desiWin) {
                    System.out.printf("Game %d of tournament %s: win with %d points.\n", i, tournamentName, desiTeamPoints - otherTeamPoints);
                } else if (desiLost) {
                    System.out.printf("Game %d of tournament %s: lost with %d points.\n", i, tournamentName, otherTeamPoints - desiTeamPoints);
                }
            }
            tournamentName = scanner.nextLine();
        }
        System.out.printf("%.2f%% matches win\n", winCount * 1.0 /allMatches*100);
        System.out.printf("%.2f%% matches lost\n", lostCount * 1.0 /allMatches*100);
    }
}
