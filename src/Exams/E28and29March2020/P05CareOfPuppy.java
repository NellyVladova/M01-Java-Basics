package Exams.E28and29March2020;

import java.util.Scanner;

public class P05CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodInKg = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int eatenFood = 0;
        //in grams
        foodInKg *= 1000;
        while (!command.equals("Adopted")) {
            int foodPerFeeding = Integer.parseInt(command);
            eatenFood += foodPerFeeding;
            command = scanner.nextLine();
        }
        if(eatenFood<=foodInKg){
            System.out.printf("Food is enough! Leftovers: %d grams.", foodInKg-eatenFood);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.", eatenFood-foodInKg);
        }
    }
}
