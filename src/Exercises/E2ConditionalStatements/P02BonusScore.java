package Exercises.E2ConditionalStatements;

import java.util.Scanner;

public class P02BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        double bonus = 0;
        double totalPoints = 0;
        if (num <= 100){
            bonus += 5;
        }else if (num <= 1000){
            bonus = num * 0.2;
        }else if (num > 1000){
            bonus = num * 0.1;
        }
        if (num % 2 == 0){
            bonus += 1;
        }else if (num % 5 == 0){
           bonus += 2;
        }
        totalPoints = num + bonus;
        System.out.printf("%.1f\n", bonus);
        System.out.printf("%.1f", totalPoints);
    }
}
