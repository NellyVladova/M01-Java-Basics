package Exams.PrecursoryExam;

import java.util.Scanner;

public class P06MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int thirdDigit = number/100;
        int firstDigit = number%10;
        number/=10;
        int secondDigit = number%10;

        for (int i = 1; i <= firstDigit; i++) {
            for (int j = 1; j <= secondDigit; j++) {
                for (int k = 1; k <= thirdDigit; k++) {
                    System.out.printf("%d * %d * %d = %d;\n", i, j, k, i*j*k);
                }
            }
        }
    }
}
