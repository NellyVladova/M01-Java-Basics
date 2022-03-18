package Exams.E2and3May2019;

import java.util.Scanner;

public class P04TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String itemName = scanner.nextLine();
        int count = 0;
        double totalMoney = 0;
        boolean noMoreMoney = false;

        while (!itemName.equals("Stop")) {
            double itemPrice = Double.parseDouble(scanner.nextLine());
            count++;
            if (count % 3 == 0) {
                itemPrice *= 0.50;
            }
            totalMoney += itemPrice;
            budget -= itemPrice;
            if (budget < 0) {
                count--;
                noMoreMoney = true;
                break;
            }

            itemName = scanner.nextLine();
        }
        if (noMoreMoney) {
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", Math.abs(budget));
        } else {
            System.out.printf("You bought %d products for %.2f leva.", count, totalMoney);
        }
    }
}