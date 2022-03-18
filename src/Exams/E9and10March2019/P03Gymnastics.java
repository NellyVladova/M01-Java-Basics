package Exams.E9and10March2019;

import java.util.Scanner;

public class P03Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String apparatus = scanner.nextLine();
        double difficultyPoints = 0;
        double performancePoints = 0;

        switch (country) {
            case "Russia":
                if (apparatus.equals("ribbon")) {
                    difficultyPoints = 9.100;
                    performancePoints = 9.400;
                } else if (apparatus.equals("hoop")) {
                    difficultyPoints = 9.300;
                    performancePoints = 9.800;
                } else if (apparatus.equals("rope")) {
                    difficultyPoints = 9.600;
                    performancePoints = 9.000;
                }
                break;
            case "Bulgaria":
                if (apparatus.equals("ribbon")) {
                    difficultyPoints = 9.600;
                    performancePoints = 9.400;
                } else if (apparatus.equals("hoop")) {
                    difficultyPoints = 9.550;
                    performancePoints = 9.750;
                } else if (apparatus.equals("rope")) {
                    difficultyPoints = 9.500;
                    performancePoints = 9.400;
                }
                break;
            case "Italy":
                if (apparatus.equals("ribbon")) {
                    difficultyPoints = 9.200;
                    performancePoints = 9.500;
                } else if (apparatus.equals("hoop")) {
                    difficultyPoints = 9.450;
                    performancePoints = 9.350;
                } else if (apparatus.equals("rope")) {
                    difficultyPoints = 9.700;
                    performancePoints = 9.150;
                }
                break;
        }
        double totalPoints = difficultyPoints + performancePoints;
        double remainingPoints = 20 - totalPoints;
        System.out.printf("The team of %s get %.3f on %s.\n", country, totalPoints, apparatus);
        System.out.printf("%.2f%%", (remainingPoints / 20) * 100);
    }
}
