package Exams.E6and7July2019;

import java.util.Scanner;

public class P02Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardsNumber = Integer.parseInt(scanner.nextLine());
        int processorsNumber = Integer.parseInt(scanner.nextLine());
        int ramNumber = Integer.parseInt(scanner.nextLine());

        double moneyForVideoCards = videoCardsNumber * 250;
        double moneyForProcessors = moneyForVideoCards * 0.35 * processorsNumber;
        double moneyForRAM = moneyForVideoCards * 0.10 * ramNumber;
        double finalBill = moneyForVideoCards + moneyForProcessors + moneyForRAM;

        if (videoCardsNumber > processorsNumber) {
            finalBill *= 0.85;
        }
        if (finalBill <= budget) {
            System.out.printf("You have %.2f leva left!", budget - finalBill);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", finalBill - budget);
        }
    }
}
