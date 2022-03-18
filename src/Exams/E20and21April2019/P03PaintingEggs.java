package Exams.E20and21April2019;

import java.util.Scanner;

public class P03PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String eggSize = scanner.nextLine();
        String eggColor = scanner.nextLine();
        int lotNumber = Integer.parseInt(scanner.nextLine());
        int lotPrice = 0;
        double totalPrice = 0;

        switch (eggSize) {
            case "Large":
                if (eggColor.equals("Red")) {
                    lotPrice = 16;
                } else if (eggColor.equals("Green")) {
                    lotPrice = 12;
                } else if (eggColor.equals("Yellow")) {
                    lotPrice = 9;
                }
                break;
            case "Medium":
                if (eggColor.equals("Red")) {
                    lotPrice = 13;
                } else if (eggColor.equals("Green")) {
                    lotPrice = 9;
                } else if (eggColor.equals("Yellow")) {
                    lotPrice = 7;
                }
                break;
            case "Small":
                if (eggColor.equals("Red")) {
                    lotPrice = 9;
                } else if (eggColor.equals("Green")) {
                    lotPrice = 8;
                } else if (eggColor.equals("Yellow")) {
                    lotPrice = 5;
                }
                break;
        }
        totalPrice = (lotNumber * lotPrice) * 0.65;
        System.out.printf("%.2f leva.", totalPrice);
    }
}
