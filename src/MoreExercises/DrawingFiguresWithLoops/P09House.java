package MoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class P09House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //pokriv
        for (int i = 1; i < (n + 1) / 2; i++) {
            if (i == 1) {//za purvi red - veren kod
                if (n % 2 == 0) {
                    for (int j = 1; j <= (n-2)/2; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("**");
                    for (int j = 1; j <= n-1; j++) {
                        System.out.print(" ");
                    }
                } else {
                    for (int j = 1; j <= (n-1)/2; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for (int j = 1; j <= 1; j++) {
                        System.out.print(" ");
                    }
                }
            }
            //za drugite redove - greshka ???????????
            System.out.println();
            if (n % 2 == 0) {
                for (int j = 1; j <=(n-4)/2 ; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= n-2; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= (n-4)/2; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }else {
                for (int j = 1; j <=(n-3)/2 ; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= n-2; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= (n-3)/2; j++) {
                    System.out.print(" ");
                }

            }
        }
        System.out.println();
        //osnova - veren kod
        for (int i = 1; i <= n / 2 ; i++) {
            System.out.print("|");
            for (int j = 1; j <= n-2; j++) {
                System.out.print("*");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
