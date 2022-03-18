package Lektures.L1FirstSteps;

import java.util.Scanner;

public class P06ConcatenateData {
        public static void main(String[] args) {
            //System.out.println("Input information:");
            Scanner scan = new Scanner(System.in);
            String firstName = scan.nextLine();
            String lastName = scan.nextLine();
            int age = Integer.parseInt(scan.nextLine());
            String town = scan.nextLine();

            System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);
    }

}
