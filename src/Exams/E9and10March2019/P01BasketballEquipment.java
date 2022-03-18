package Exams.E9and10March2019;

import java.util.Scanner;

public class P01BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearPrice = Integer.parseInt(scanner.nextLine());

        double shoes = yearPrice * 0.6;
        double outfit = shoes * 0.8;
        double ball = outfit / 4;
        double accessories = ball / 5;
        double totalPrice = yearPrice + shoes + outfit + ball + accessories;
        System.out.printf("%.2f", totalPrice);
    }
}
