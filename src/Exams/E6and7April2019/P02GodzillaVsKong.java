package Exams.E6and7April2019;

import java.util.Scanner;

public class P02GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statistsNumber = Integer.parseInt(scanner.nextLine());
        double statistsClothePrice = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.10;
        if (statistsNumber > 150) {
            statistsClothePrice *= 0.90;
        }
        double moneyForClothes = statistsClothePrice * statistsNumber;
        double finalMoney = decor + moneyForClothes;
        if (finalMoney > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", finalMoney - budget);
        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget-finalMoney);
        }
    }
}
