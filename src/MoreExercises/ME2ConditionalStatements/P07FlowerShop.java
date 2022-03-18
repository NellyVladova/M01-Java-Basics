package MoreExercises.ME2ConditionalStatements;

import java.util.Scanner;

public class P07FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double magnoliasPrice = 3.25;
        double hyacinthsPrice = 4.00;
        double rosesPrice = 3.50;
        double cactusPrice = 8.00;

        double sum = magnolias * magnoliasPrice + hyacinths * hyacinthsPrice + roses * rosesPrice + cactus * cactusPrice;
        double duty = sum * 0.05;
        double earning = sum - duty;

        if (earning >= giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(earning - giftPrice));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(giftPrice - earning));
        }
    }
}
