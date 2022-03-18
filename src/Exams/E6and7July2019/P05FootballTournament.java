package Exams.E6and7July2019;

import java.util.Scanner;

public class P05FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String teamName = scanner.nextLine();
        int playedGames = Integer.parseInt(scanner.nextLine());
        int winsCounter = 0;
        int losesCounter = 0;
        int drawsCounter = 0;
        int points = 0;

        for (int i = 1; i <= playedGames; i++) {
            String result = scanner.nextLine();
            if (result.equals("W")) {
                points += 3;
                winsCounter++;
            } else if (result.equals("D")) {
                points += 1;
                drawsCounter++;
            } else if (result.equals("L")) {
                losesCounter++;
            }
        }
        if (playedGames == 0) {
            System.out.printf("%s hasn't played any games during this season.", teamName);
        } else {
            System.out.printf("%s has won %d points during this season.\n", teamName, points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d\n", winsCounter);
            System.out.printf("## D: %d\n", drawsCounter);
            System.out.printf("## L: %d\n", losesCounter);
            System.out.printf("Win rate: %.2f%%", winsCounter * 1.00 / playedGames * 100);
        }
    }
}
