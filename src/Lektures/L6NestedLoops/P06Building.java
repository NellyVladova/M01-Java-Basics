package Lektures.L6NestedLoops;

import java.util.Scanner;

public class P06Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floor = Integer.parseInt(scanner.nextLine());
        int roomPerFloor = Integer.parseInt(scanner.nextLine());

        //print-a ?????
        for (int i = floor; i >= 1; i--) {
            for (int j = 0; j < roomPerFloor; j++) {
                if (i % 2 == 0) {
                    if (i == floor) {
                        System.out.printf("L%d%d ", i, j);
                    } else {
                        System.out.printf("O%d%d ", i, j);
                    }
                } else {
                    if (i == floor) {
                        System.out.printf("L%d%d ", i, j);
                    } else {
                        System.out.printf("A%d%d ", i, j);
                    }
                }

            }
            System.out.println();
        }
    }
}
