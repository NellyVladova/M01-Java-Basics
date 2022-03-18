package MoreExercises.ME2ConditionalStatements;

import java.util.Scanner;

public class P06Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int food = Integer.parseInt(scanner.nextLine());
        double dogFoodPerDay = Double.parseDouble(scanner.nextLine());
        double catFoodPerDay = Double.parseDouble(scanner.nextLine());
        double tortoiseFoodPerDay = Double.parseDouble(scanner.nextLine());

        double neededFood = days * (dogFoodPerDay + catFoodPerDay + (tortoiseFoodPerDay/1000));
        if (neededFood <= food) {
            System.out.printf("%.0f kilos of food left.", Math.floor(food - neededFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(neededFood - food));
        }
    }
}
