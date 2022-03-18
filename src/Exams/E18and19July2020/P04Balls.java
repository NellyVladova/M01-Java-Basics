package Exams.E18and19July2020;

import java.util.Scanner;

public class P04Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double points = 0;
        int redCount = 0;
        int orangeCount = 0;
        int yellowCount = 0;
        int whiteCount = 0;
        int blackCount = 0;
        int otherColorCount = 0;

        for (int i = 1; i <= n; i++) {
            String ballColor = scanner.nextLine();
            switch (ballColor) {
                case "red":
                    points += 5;
                    redCount++;
                    break;
                case "orange":
                    points += 10;
                    orangeCount++;
                    break;
                case "yellow":
                    points += 15;
                    yellowCount++;
                    break;
                case "white":
                    points += 20;
                    whiteCount++;
                    break;
                case "black":
                    points /= 2;
                    blackCount++;
                    break;
                default:
                    otherColorCount++;
                    break;
            }
        }
        System.out.printf("Total points: %.0f\n", Math.floor(points));
        System.out.printf("Points from red balls: %d\n", redCount);
        System.out.printf("Points from orange balls: %d\n", orangeCount);
        System.out.printf("Points from yellow balls: %d\n", yellowCount);
        System.out.printf("Points from white balls: %d\n", whiteCount);
        System.out.printf("Other colors picked: %d\n", otherColorCount);
        System.out.printf("Divides from black balls: %d\n", blackCount);
    }
}
