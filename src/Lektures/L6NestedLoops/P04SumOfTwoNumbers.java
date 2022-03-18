package Lektures.L6NestedLoops;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intervalStart = Integer.parseInt(scanner.nextLine());
        int intervalEnd = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combinationCount = 0;
        boolean isFound = false;

        for (int i = intervalStart; i <= intervalEnd; i++) {
            for (int j = intervalStart; j <= intervalEnd; j++) {
                combinationCount++;

                if(i+j==magicNumber){
                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)\n", combinationCount, i, j, magicNumber);
                    break;
                }
            }
            if(isFound){
                break;
            }
        }
        if(!isFound){
            System.out.printf("%d combinations - neither equals %d", combinationCount, magicNumber);

        }
    }
}
