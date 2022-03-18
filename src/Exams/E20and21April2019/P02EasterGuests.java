package Exams.E20and21April2019;

import java.util.Scanner;

public class P02EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guestsNumber = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        int eggsNumber = guestsNumber * 2;
        double easterCakesNumber = Math.ceil(guestsNumber * 1.0 / 3);
        double moneyForEggs = eggsNumber * 0.45;
        double moneyForEasterCakes = easterCakesNumber * 4;
        double totalPrice = moneyForEggs+moneyForEasterCakes;
        if(totalPrice<=budget){
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.\n", easterCakesNumber, eggsNumber);
            System.out.printf("He has %.2f lv. left.", budget-totalPrice);
        }else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", totalPrice-budget);
        }
    }
}
