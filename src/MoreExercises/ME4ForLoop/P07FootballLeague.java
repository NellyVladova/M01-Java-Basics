package MoreExercises.ME4ForLoop;

import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int fansNumber = Integer.parseInt(scanner.nextLine());
        int sectorACount = 0;
        int sectorBCount = 0;
        int sectorVCount = 0;
        int sectorGCount = 0;

        for (int i = 0; i < fansNumber; i++) {
            String sector = scanner.nextLine();
            switch (sector) {
                case "A":
                    sectorACount++;
                    break;
                case "B":
                    sectorBCount++;
                    break;
                case "V":
                    sectorVCount++;
                    break;
                case "G":
                    sectorGCount++;
                    break;
            }
        }
        System.out.printf("%.2f%%\n", sectorACount * 1.00 / fansNumber * 100);
        System.out.printf("%.2f%%\n", sectorBCount * 1.00 / fansNumber * 100);
        System.out.printf("%.2f%%\n", sectorVCount * 1.00 / fansNumber * 100);
        System.out.printf("%.2f%%\n", sectorGCount * 1.00 / fansNumber * 100);
        System.out.printf("%.2f%%\n", fansNumber * 1.00 / stadiumCapacity * 100);
    }
}
