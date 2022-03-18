package Exercises.E1FirstSteps;

import java.util.Scanner;

public class P06CharityCampaign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int pastryChefs = Integer.parseInt(scan.nextLine());
        int cakes = Integer.parseInt(scan.nextLine());
        int waffles = Integer.parseInt(scan.nextLine());
        int pancakes = Integer.parseInt(scan.nextLine());

        double cakePrice = cakes * 45;
        double wafflesPrice = waffles * 5.80;
        double pancakesPrice = pancakes * 3.20;
        double pricePerChef = cakePrice + wafflesPrice + pancakesPrice;
        double chefsPrice = pricePerChef * pastryChefs;
        double totalPrice = chefsPrice * days;
        double finalPrice = totalPrice - (totalPrice/8);

        System.out.printf("%.2f", finalPrice);

    }
}
