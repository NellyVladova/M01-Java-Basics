package Exercises.E3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowersType = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double rosePrice = 5.00;
        double dahliasPrice = 3.80;
        double tulipsPrice = 2.80;
        double narcissusPrice = 3.00;
        double gladiolusPrice = 2.50;
        double finalPrice = 0;

        switch (flowersType) {
            case "Roses":
                if (count > 80) {
                    rosePrice *= 0.90;
                }
                finalPrice = count * rosePrice;
                break;
            case "Dahlias":
                if (count > 90) {
                    dahliasPrice *= 0.85;
                }
                finalPrice = count * dahliasPrice;
                break;
            case "Tulips":
                if (count > 80) {
                    tulipsPrice *= 0.85;
                }
                finalPrice = count * tulipsPrice;
                break;
            case "Narcissus":
                if (count < 120) {
                    narcissusPrice *= 1.15;
                }
                finalPrice = count * narcissusPrice;
                break;
            case "Gladiolus":
                if (count < 80) {
                    gladiolusPrice *= 1.20;
                }
                finalPrice = count * gladiolusPrice;
                break;
        }
        if (budget >= finalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flowersType, budget - finalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", finalPrice - budget);
        }
    }
}
