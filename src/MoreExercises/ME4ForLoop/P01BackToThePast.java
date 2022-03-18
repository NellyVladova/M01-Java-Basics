package MoreExercises.ME4ForLoop;

import java.util.Scanner;

public class P01BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double legacy = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        double moneyForPaying = 0;
        int ivanYear = 17;

        for (int i = 1800; i <= year; i++) {
            ivanYear++;
            if (i % 2 == 0) {
                moneyForPaying = 12000;
                legacy -= moneyForPaying;
            } else {
                moneyForPaying = 12000 + 50 * ivanYear;
                legacy-=moneyForPaying;
            }
        }
        double diff = Math.abs(legacy);
        if(legacy>=0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", diff);
        }else {
            System.out.printf("He will need %.2f dollars to survive.", diff);
        }

    }
}
