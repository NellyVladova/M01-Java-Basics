package Exercises.E1FirstSteps;

import java.util.Scanner;

public class P05BirthdayParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rentForParty = Integer.parseInt(scan.nextLine());

        double cake = rentForParty * 0.20;
        double drinks = cake - (cake * 0.45);
        double animator = rentForParty/3.0;
        double totalPrice = rentForParty + cake + drinks + animator;

        System.out.println(totalPrice);
    }
}
