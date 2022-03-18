package Exercises.E3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        int result1 = 0;
        double result2 = 0.00;
        String isEven = "";

        switch (symbol) {
            case "+":
                result1 = N1 + N2;
                if (result1 % 2 == 0) {
                    isEven = "even";
                    System.out.printf("%d %s %d = %d - %s\n", N1, symbol, N2, result1, isEven);
                } else {
                    isEven = "odd";
                    System.out.printf("%d %s %d = %d - %s\n", N1, symbol, N2, result1, isEven);
                }
                break;
            case "-":
                result1 = N1 - N2;
                if (result1 % 2 == 0) {
                    isEven = "even";
                    System.out.printf("%d %s %d = %d - %s\n", N1, symbol, N2, result1, isEven);
                } else {
                    isEven = "odd";
                    System.out.printf("%d %s %d = %d - %s\n", N1, symbol, N2, result1, isEven);
                }
                break;
            case "*":
                result1 = N1 * N2;
                if (result1 % 2 == 0) {
                    isEven = "even";
                    System.out.printf("%d %s %d = %d - %s\n", N1, symbol, N2, result1, isEven);
                } else {
                    isEven = "odd";
                    System.out.printf("%d %s %d = %d - %s\n", N1, symbol, N2, result1, isEven);
                }
                break;
            case "/":
                if (N2 != 0) {
                    result2 = N1 / N2 * 1.00;
                    double rest = N1 % N2;
                    rest /= N2;
                    System.out.printf("%d %s %d = %.2f", N1, symbol, N2, result2 + rest);
                } else {
                    System.out.printf("Cannot divide %d by zero", N1);
                }
                break;
            case "%":
                if (N2 != 0) {
                    result1 = N1 % N2;
                    System.out.printf("%d %s %d = %d", N1, symbol, N2, result1);
                } else {
                    System.out.printf("Cannot divide %d by zero", N1);
                }
                break;

        }
    }
}
