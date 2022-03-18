package MoreExercises.ME5WhileLoop;

import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int detergentsBottle = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int i = 0;
        int mlPerPlate = 0;
        int allDishes = 0;
        int allPots = 0;
        boolean notEnough = false;
        int detergentAmount = detergentsBottle * 750;
        int cleanDishes = 0;
        int cleanPots = 0;

        while (!command.equals("End")) {
            int dish = Integer.parseInt(command);
            i++;
            if (i % 3 == 0) {
                mlPerPlate = 15;
                cleanPots = dish * mlPerPlate;
                detergentAmount -= cleanPots;
                allPots += dish;
            } else {
                mlPerPlate = 5;
                cleanDishes = dish * mlPerPlate;
                detergentAmount -= cleanDishes;
                allDishes += dish;
            }
            if (detergentAmount < 0) {
                notEnough = true;
                break;
            }
            command = scanner.nextLine();

        }
        if (notEnough) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergentAmount));
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.\n", allDishes, allPots);
            System.out.printf("Leftover detergent %d ml.\n", detergentAmount);
        }
    }
}
