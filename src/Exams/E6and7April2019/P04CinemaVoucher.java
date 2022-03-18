package Exams.E6and7April2019;

import java.util.Scanner;

public class P04CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucherValue = Integer.parseInt(scanner.nextLine());
        String purchase = scanner.nextLine();
        boolean noMoreMoney = false;
        int ticketCount = 0;
        int otherPurchaseCount = 0;

        while (!purchase.equals("End")) {
            double price = 0;

            if (purchase.length() > 8) {
                char character1 = purchase.charAt(0);
                char character2 = purchase.charAt(1);
                price = (int) character1;
                price += (int) character2;
                if (price <= voucherValue) {
                    voucherValue -= price;
                    ticketCount++;
                } else {
                    noMoreMoney = true;
                    break;
                }
            } else {//<=8
                char character = purchase.charAt(0);
                price = (int) character;
                if (price <= voucherValue) {
                    voucherValue -= price;
                    otherPurchaseCount++;
                } else {
                    noMoreMoney = true;
                    break;
                }
            }

            purchase = scanner.nextLine();
        }
        System.out.printf("%d\n", ticketCount);
        System.out.printf("%d\n", otherPurchaseCount);
    }
}
