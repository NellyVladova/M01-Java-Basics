package Exams.E6and7July2019;

import java.util.Scanner;

public class P06NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();
        int maxPoints = Integer.MIN_VALUE;
        String winner = "";

        while (!playerName.equals("Stop")){
            int currentPoints = 0;
            for (int i = 0; i <playerName.length(); i++) {
                int number = Integer.parseInt(scanner.nextLine());
                char character = playerName.charAt(i);
                int asciiValue = 0;
                asciiValue = (int)character;
                if(asciiValue==number){
                    currentPoints+=10;
                }else {
                    currentPoints+=2;
                }
                if(currentPoints>=maxPoints){
                    maxPoints = currentPoints;
                    winner = playerName;
                }
            }
            playerName = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", winner, maxPoints);
    }
}
