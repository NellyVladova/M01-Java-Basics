package MoreExercises.ME4ForLoop;

import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        double averageBill = 0;
        double electricityBillForAllMonths = 0;
        for (int i = 0; i < months; i++) {
            double electricityBill = Double.parseDouble(scanner.nextLine());
            electricityBillForAllMonths += electricityBill;
        }
        double waterBill = months * 20.00;
        double internetBill = months * 15.00;
        double otherBills = (electricityBillForAllMonths + waterBill + internetBill) * 1.20;
        averageBill = (otherBills + electricityBillForAllMonths + waterBill + internetBill) / months;

        System.out.printf("Electricity: %.2f lv\n", electricityBillForAllMonths);
        System.out.printf("Water: %.2f lv\n", waterBill);
        System.out.printf("Internet: %.2f lv\n", internetBill);
        System.out.printf("Other: %.2f lv\n", otherBills);
        System.out.printf("Average: %.2f lv", averageBill);
    }
}
