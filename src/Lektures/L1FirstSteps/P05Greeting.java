package Lektures.L1FirstSteps;

import java.util.Scanner;

public class P05Greeting {
        public static void main(String[] args) {
            //System.out.print("Input name:\n");
            Scanner scan = new Scanner(System.in);
            String name = scan.nextLine();
            System.out.printf("Hello, %s!", name);
            //System.out.print("Hello, " + name + "!");
    }
}
