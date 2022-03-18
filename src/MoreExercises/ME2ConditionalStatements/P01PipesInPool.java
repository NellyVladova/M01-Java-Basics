package MoreExercises.ME2ConditionalStatements;

import java.util.Scanner;

public class P01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());

        double water = (P1 + P2) * H;
        double percentP1 = (P1 * 1.00 * H / water) * 100;
        double percentP2 = (P2 * 1.00 * H / water) * 100;
        double allPercent = (water / V) * 100;

        if (water > V) {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, water - V);
        } else {
            System.out.printf("The pool is %.2f full. Pipe 1: %.2f. Pipe 2: %.2f.", allPercent, percentP1, percentP2);
        }
    }
}
