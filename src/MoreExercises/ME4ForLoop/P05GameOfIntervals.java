package MoreExercises.ME4ForLoop;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moves = Integer.parseInt(scanner.nextLine());
        double result = 0;
        double from0To9 = 0;
        double from10To19 = 0;
        double from20To29 = 0;
        double from30To39 = 0;
        double from40To50 = 0;
        double invalidNumbers = 0;

        for (int i = 0; i < moves; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            if (numbers >= 0 && numbers <= 9) {
                result += numbers * 0.20;
                from0To9++;
            } else if (numbers >= 10 && numbers <= 19) {
                result += numbers * 0.30;
                from10To19++;
            } else if (numbers >= 20 && numbers <= 29) {
                result += numbers * 0.40;
                from20To29++;
            } else if (numbers >= 30 && numbers <= 39) {
                result += 50;
                from30To39++;
            } else if (numbers >= 40 && numbers <= 50) {
                result += 100;
                from40To50++;
            } else {
                result /= 2;
                invalidNumbers++;
            }
        }
        System.out.printf("%.2f\n", result);
        System.out.printf("From 0 to 9: %.2f%%\n", from0To9 / moves * 100);
        System.out.printf("From 10 to 19: %.2f%%\n", from10To19 / moves * 100);
        System.out.printf("From 20 to 29: %.2f%%\n", from20To29 / moves * 100);
        System.out.printf("From 30 to 39: %.2f%%\n", from30To39 / moves * 100);
        System.out.printf("From 40 to 50: %.2f%%\n", from40To50 / moves * 100);
        System.out.printf("Invalid numbers: %.2f%%\n", invalidNumbers / moves * 100);
    }
}
