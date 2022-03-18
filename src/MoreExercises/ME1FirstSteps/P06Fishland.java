package MoreExercises.ME1FirstSteps;

import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mackerelPrice = Double.parseDouble(scan.nextLine());
        double spratPrice = Double.parseDouble(scan.nextLine());
        double beltedBonitoKg = Double.parseDouble(scan.nextLine());
        double scadKg = Double.parseDouble(scan.nextLine());
        double musselKg = Double.parseDouble(scan.nextLine());

        double beltedBonitoPrice =  mackerelPrice * 1.60;
        double scadPrice = spratPrice * 1.8;
        double musselPrice = 7.50;

        double totalPrice = (beltedBonitoPrice * beltedBonitoKg) + (scadPrice * scadKg) + (musselPrice * musselKg);

        System.out.printf("%.2f", totalPrice);
    }
}
