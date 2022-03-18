package Exams.E20and21April2019;

import java.util.Scanner;

public class P06EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int customersNumber = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double finalPrice = 0;

        for (int i = 1; i <= customersNumber; i++) {
            String product = scanner.nextLine();
            double totalPrice = 0;
            int productCount = 0;
            while (!product.equals("Finish")){
                switch (product){
                    case "basket":
                        price = 1.50;
                        totalPrice+=price;
                        productCount++;
                        break;
                    case "wreath":
                        price = 3.80;
                        totalPrice+=price;
                        productCount++;
                        break;
                    case "chocolate bunny":
                        price = 7;
                        totalPrice+=price;
                        productCount++;
                        break;
                }

                product = scanner.nextLine();
            }
            if (productCount % 2 == 0) {
                totalPrice*=0.80;
            }
            System.out.printf("You purchased %d items for %.2f leva.\n", productCount, totalPrice);
            finalPrice+=totalPrice;
        }
        System.out.printf("Average bill per client is: %.2f leva.\n", finalPrice/customersNumber);
    }
}
