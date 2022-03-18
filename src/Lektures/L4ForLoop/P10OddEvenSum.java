package Lektures.L4ForLoop;

import java.util.Scanner;

public class P10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Да се напише програма, която чете n-на брой цели числа, подадени от потребителя,
//        и проверява дали сумата от числата на четни позиции е равна на сумата на числата на нечетни позиции.
//        При равенство да се отпечатат два реда: "Yes" и на нов ред "Sum = " + сумата;
//        иначе да се отпечата "No" и на нов ред "Diff = " + разликата.
//        Разликата се изчислява по абсолютна стойност.

        int n = Integer.parseInt(scanner.nextLine());
        int evenSum = 0;
        int oddSum = 0;
        int diff = 0;

        for (int i = 1; i <= n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum += numbers;
            } else {
                oddSum += numbers;
            }
        }

        diff = Math.abs(evenSum - oddSum);

        if (evenSum == oddSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", evenSum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}
