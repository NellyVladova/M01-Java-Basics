package Lektures.L4ForLoop;

import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Да се напише програма, която чете 2*n-на брой цели числа, подадени от потребителя,
//        и проверява дали сумата на първите n числа (лява сума) е равна на сумата на вторите n числа (дясна сума).
//        При равенство печата " Yes, sum = " + сумата; иначе печата " No, diff = " + разликата.
//        Разликата се изчислява като положително число (по абсолютна стойност).

        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        int diff = 0;

        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= n; j++) {
                int numbers = Integer.parseInt(scanner.nextLine());

                if (i == 1) {
                    leftSum += numbers;
                } else {
                    rightSum += numbers;
                }
            }

        }
        diff = Math.abs(leftSum - rightSum);

        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            System.out.printf("No, diff = %d", diff);
        }

    }
}
