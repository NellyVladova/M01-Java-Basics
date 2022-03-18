package Exams.E28and29March2020;

import java.util.Scanner;

public class P04FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double allFoodQuantity = Double.parseDouble(scanner.nextLine());
        double allEatenFood = 0;
        double biscuits = 0;
        double foodEatenByTheCat = 0;
        double foodEatenByTheDog = 0;

        for (int i = 1; i <= days; i++) {
            int eatenByDog = Integer.parseInt(scanner.nextLine());
            int eatenByCat = Integer.parseInt(scanner.nextLine());

            int foodForTheDay = eatenByCat + eatenByDog;

            foodEatenByTheCat+=eatenByCat;
            foodEatenByTheDog+=eatenByDog;
            allEatenFood+=foodForTheDay;

            if (i % 3 == 0) {
                biscuits += foodForTheDay*0.10;
            }
        }
        System.out.printf("Total eaten biscuits: %.0fgr.\n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.\n", allEatenFood/allFoodQuantity*100);
        System.out.printf("%.2f%% eaten from the dog.\n", foodEatenByTheDog/allEatenFood*100);
        System.out.printf("%.2f%% eaten from the cat.\n", foodEatenByTheCat/allEatenFood*100);
    }
}
