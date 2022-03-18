package Exams.E28and29March2020;

import java.util.Scanner;

public class P02CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int walkingMinutesPerDay = Integer.parseInt(scanner.nextLine());
        int walkingNumbersPerDay = Integer.parseInt(scanner.nextLine());
        int caloriesPerDay = Integer.parseInt(scanner.nextLine());

//        За всяка минута от разходката, котката гори по 5 калории.
//        Разходката е достатъчна, ако котката изграря 50% от приетите калории.

        int allWalkingMinutes = walkingMinutesPerDay*walkingNumbersPerDay;
        int burnedCalories = allWalkingMinutes*5;
        double calories = caloriesPerDay*0.50;

        if(burnedCalories>=calories){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCalories);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCalories);
        }
    }
}
