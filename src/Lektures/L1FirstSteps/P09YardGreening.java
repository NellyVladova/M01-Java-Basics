package Lektures.L1FirstSteps;

import java.util.Scanner;

public class P09YardGreening {
        public static void main(String[] args) {
            //System.out.println("Input area:");
            Scanner scan = new Scanner(System.in);
            double area = Double.parseDouble(scan.nextLine());
            double price = area * 7.61;
            double discount = price * 0.18;
            double finalPrice = price - discount;
            System.out.printf("The final price is: %.2f lv.\n", finalPrice);
            System.out.printf("The discount is: %.2f lv. ",discount);
    }

}
