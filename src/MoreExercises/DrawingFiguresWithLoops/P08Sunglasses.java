package MoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class P08Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //?????????
        int n = Integer.parseInt(scanner.nextLine());

        for (int j = 1; j <= 2 * n; j++) {//goren
            System.out.print("*");
        }
        for (int j = 1; j <= n; j++) {//goren
            System.out.print(" ");
        }
        for (int j = 1; j <= 2 * n; j++) {//goren
            System.out.print("*");
        }
        System.out.println();
        //za sreden
        for (int i = 1; i <= n - 2; i++) {
            System.out.print("*");
            for (int j = 1; j <= 2 * n - 2; j++) {
                System.out.print("/");
            }
            System.out.print("*");
            if (i == (n - 1) / 2) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("|");
                }
            }else {
                for (int j = 1; j <= n; j++) {//goren
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            for (int j = 1; j <= 2 * n - 2; j++) {
                System.out.print("/");
            }
            System.out.print("*");
            if (i != n - 2) {
                System.out.println();
            }
        }

        //za dolen
        System.out.println();
        for (int j = 1; j <= 2 * n; j++) {
            System.out.print("*");
        }
        for (int j = 1; j <= n; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= 2 * n; j++) {
            System.out.print("*");
        }
        System.out.println();


    }
}
