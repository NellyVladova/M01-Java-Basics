package MoreExercises.ME3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P10MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  input = scanner.nextLine();
        while (true) {
            double num = Double.parseDouble(input);
            if (num >= 0) {
                System.out.printf("Result: %.2f\n", num*2);
            }else {
                System.out.println("Negative number!");
                break;
            }
            input = scanner.nextLine();
        }
    }
}
