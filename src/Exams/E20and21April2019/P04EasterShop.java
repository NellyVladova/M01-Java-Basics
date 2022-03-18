package Exams.E20and21April2019;

import java.util.Scanner;

public class P04EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsQuantity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        boolean stop = false;
        int soldEggs = 0;

        while (!command.equals("Close")) {
            int eggsNumber = Integer.parseInt(scanner.nextLine());
            if (command.equals("Buy")) {
                if (eggsNumber > eggsQuantity) {
                    stop = true;
                    break;
                }
                eggsQuantity -= eggsNumber;
                soldEggs += eggsNumber;

            } else if (command.equals("Fill")) {
                eggsQuantity += eggsNumber;
            }
            command = scanner.nextLine();
        }
        if (stop) {
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.", eggsQuantity);
        } else {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", soldEggs);
        }
    }
}
