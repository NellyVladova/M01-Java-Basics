package MoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class P04TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("$ ");
            }
            System.out.println();
        }
    }
}
