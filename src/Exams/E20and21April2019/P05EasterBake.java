package Exams.E20and21April2019;

import java.util.Scanner;

public class P05EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterCakeNumber = Integer.parseInt(scanner.nextLine());
        double neededSugar = 0;
        double neededFlour = 0;
        double packsSugar = 0;
        double packsFlour = 0;
        int maxGramsFlour = Integer.MIN_VALUE;
        int maxGramsSugar = Integer.MIN_VALUE;

        for (int i = 1; i <= easterCakeNumber; i++) {
            int neededSugarForOne = Integer.parseInt(scanner.nextLine());
            int neededFlourForOne = Integer.parseInt(scanner.nextLine());
            neededSugar+=neededSugarForOne;
            neededFlour+=neededFlourForOne;
            if (neededSugarForOne>maxGramsSugar){
                maxGramsSugar=neededSugarForOne;
            }
            if (neededFlourForOne>maxGramsFlour){
                maxGramsFlour=neededFlourForOne;
            }

        }
        packsSugar=Math.ceil(neededSugar/950);
        packsFlour=Math.ceil(neededFlour/750);

        System.out.printf("Sugar: %.0f\n", packsSugar);
        System.out.printf("Flour: %.0f\n", packsFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxGramsFlour, maxGramsSugar);
    }
}
