package Lektures.L4ForLoop;

import java.util.Scanner;

public class P11CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toyCounter = 0;
        int money = 0;
        int brotherCount = 0;
        double sumMoney = 0;
        double savedMoney = 0;
        double diff = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                brotherCount++;
                money += 10;
                sumMoney += money;
            } else {
                toyCounter++;
            }
        }

        savedMoney = sumMoney + (toyCounter * toyPrice) - brotherCount;
        diff = Math.abs(savedMoney - washMachinePrice);

        if (savedMoney >= washMachinePrice) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
