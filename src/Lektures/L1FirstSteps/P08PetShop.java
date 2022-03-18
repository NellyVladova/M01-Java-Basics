package Lektures.L1FirstSteps;

import java.util.Scanner;

public class P08PetShop {
        public static void main(String[] args) {
            //System.out.println("Input my number of my dogs and other dogs:");
            Scanner scan = new Scanner(System.in);
            int myDogs = Integer.parseInt(scan.nextLine());
            int otherDogs = Integer.parseInt(scan.nextLine());
            double moneyForMyDogs = myDogs * 2.50;
            double moneyForOtherDogs = otherDogs * 4;
            double finalPrice = moneyForMyDogs + moneyForOtherDogs;
            System.out.println(finalPrice + " lv.");
    }

}
