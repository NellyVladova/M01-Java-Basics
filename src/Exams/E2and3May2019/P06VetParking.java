package Exams.E2and3May2019;

import java.util.Scanner;

public class P06VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        for (int i = 1; i <= days; i++) {
            double parkingBill = 0;

            for (int j = 1; j <=hoursPerDay ; j++) {
                if(i%2==0 && j%2!=0){
                    parkingBill+=2.50;
                }else if(i%2!=0 && j%2==0){
                    parkingBill+=1.25;
                }else {
                    parkingBill+=1.00;
                }
            }
            totalPrice+=parkingBill;
            System.out.printf("Day: %d - %.2f leva\n", i, parkingBill);
        }
        System.out.printf("Total: %.2f leva", totalPrice);
    }
}
