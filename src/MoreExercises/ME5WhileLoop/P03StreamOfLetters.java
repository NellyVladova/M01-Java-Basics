package MoreExercises.ME5WhileLoop;

import java.util.Scanner;

public class P03StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //?????
        String letter = scanner.nextLine();
        int cCounter = 0;
        int oCounter = 0;
        int nCounter = 0;
        String word = "";

        while (!letter.equals("End")) {
            if(letter.equals("c")){
                cCounter++;
            } else if (letter.equals("o")) {
                oCounter++;
            } else if (letter.equals("n")) {
                nCounter++;
            }

            if (letter.equals("c") || letter.equals("o") || letter.equals("n") && (cCounter > 1 || oCounter > 1 || nCounter > 1)) {
                System.out.printf("");
            }
            letter = scanner.nextLine();
        }
    }
}
