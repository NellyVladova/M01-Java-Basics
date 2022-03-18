package Exams.PrecursoryExam;

import java.util.Scanner;

public class P01CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatPercent = Integer.parseInt(scanner.nextLine());
        int proteinPercent = Integer.parseInt(scanner.nextLine());
        int carbohydrates = Integer.parseInt(scanner.nextLine());
        int allCalories = Integer.parseInt(scanner.nextLine());
        int waterPercent = Integer.parseInt(scanner.nextLine());

        double allFats = (fatPercent*1.00/100*allCalories)/9;
        double allProteins= (proteinPercent*1.00/100*allCalories)/4;
        double allCarbohydrates = (carbohydrates*1.00/100*allCalories)/4;
        double allFood = allFats+allProteins+allCarbohydrates;
        double caloriesPerOneGram = allCalories/allFood;
        double water = waterPercent*1.00/100*caloriesPerOneGram;
        System.out.printf("%.4f", caloriesPerOneGram-water);
    }
}
