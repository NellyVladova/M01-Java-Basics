package MoreExercises.ME4ForLoop;

import java.util.Scanner;

public class P08EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int value = 0;
        int currentValue = 0;
        boolean isDifferent = true;
        int maxDiff = Integer.MIN_VALUE;
        int currentDiff = 0;

        for (int i = 0; i < n; i++) {
            //???????????????????????????????????????????
            for (int j = 0; j < 2; j++) {
                int number = Integer.parseInt(scanner.nextLine());
                currentValue += number;
            }
            if (value == currentValue) {
                isDifferent = false;
            }else {
                isDifferent = true;
                currentDiff = Math.abs(value-currentValue);
                if(currentDiff>maxDiff){
                    maxDiff = currentDiff;
                }
                value = 0;
                currentDiff =0;
            }
            value = currentValue;
            currentValue = 0;
        }
        if (isDifferent) {
            System.out.printf("No, maxdiff=%d", maxDiff);
        } else {
            System.out.printf("Yes, value=%d", value);
        }
    }
}
