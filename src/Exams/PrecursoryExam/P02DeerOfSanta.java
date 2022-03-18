package Exams.PrecursoryExam;

import java.util.Scanner;

public class P02DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysAbsent = Integer.parseInt(scanner.nextLine());
        int foodInKg = Integer.parseInt(scanner.nextLine());
        double foodForFirstDeerPerDay = Double.parseDouble(scanner.nextLine());
        double foodForSecondDeerPerDay = Double.parseDouble(scanner.nextLine());
        double foodForThirdDeerPerDay = Double.parseDouble(scanner.nextLine());
        double allFoodForFirstDeer = foodForFirstDeerPerDay*daysAbsent;
        double allFoodForSecondDeer = foodForSecondDeerPerDay*daysAbsent;
        double allFoodForThirdDeer = foodForThirdDeerPerDay*daysAbsent;
        double allFood= allFoodForFirstDeer+allFoodForSecondDeer+allFoodForThirdDeer;
        if(allFood<=foodInKg){
            System.out.printf("%.0f kilos of food left.", Math.floor(foodInKg-allFood));
        }else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(allFood-foodInKg));
        }

    }
}
