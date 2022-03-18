package Lektures.L1FirstSteps;

import java.util.Scanner;

public class P04InchesToCentimeters {
        public static void main(String[] args) {
            // write your code here
            //System.out.println("Input inches:");
            Scanner scan = new Scanner(System.in);
            double inches = Double.parseDouble(scan.nextLine());
            double centimeteres = inches * 2.54;
            System.out.println(centimeteres);
    }

}
