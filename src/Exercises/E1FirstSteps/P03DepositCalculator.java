package Exercises.E1FirstSteps;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double stock = Double.parseDouble(scanner.nextLine());
        int limitTime = Integer.parseInt(scanner.nextLine());
        double yearPercent = Double.parseDouble(scanner.nextLine());
        double percent = yearPercent / 100;

        double interestPerMonth = (stock * percent) / 12;
        double totalPrice = stock + (limitTime * interestPerMonth);

        System.out.println(totalPrice);

    }
}
