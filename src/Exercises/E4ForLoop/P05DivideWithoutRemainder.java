package Exercises.E4ForLoop;

import java.util.Scanner;

public class P05DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        От тях някакъв процент p1 се делят без остатък на 2,
//        друг процент p2 се делят без остатък на 3,
//        друг процент p3 се делят без остатък на 4.
//        Да се напише програма, която изчислява и отпечатва процентите p1, p2 и p3.

        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0) {
                p1++;
            }
            if (number % 3 == 0) {
                p2++;
            }
            if (number % 4 == 0) {
                p3++;
            }

        }
        System.out.printf("%.2f%%\n", p1 / n * 100);
        System.out.printf("%.2f%%\n", p2 / n * 100);
        System.out.printf("%.2f%%\n", p3 / n * 100);
    }
}
