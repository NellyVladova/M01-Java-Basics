package Exams.E20and21April2019;

import java.util.Scanner;

public class P06EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterCakeNumber = Integer.parseInt(scanner.nextLine());
        int maxPoints = Integer.MIN_VALUE;
        String masterName = "";

        for (int i = 1; i <= easterCakeNumber; i++) {
            String bakerName = scanner.nextLine();
            String command = scanner.nextLine();
            int totalPoints = 0;
            while (!command.equals("Stop")) {
                int points = Integer.parseInt(command);
                totalPoints += points;
                command = scanner.nextLine();
            }
            System.out.printf("%s has %d points.\n", bakerName, totalPoints);
            if(totalPoints>maxPoints){
                maxPoints = totalPoints;
                masterName = bakerName;
                System.out.printf("%s is the new number 1!\n", masterName);
            }
        }
        System.out.printf("%s won competition with %d points!", masterName, maxPoints);
    }
}
