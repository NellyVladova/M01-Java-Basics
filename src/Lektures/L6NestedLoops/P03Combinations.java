package Lektures.L6NestedLoops;

import java.util.Scanner;

public class P03Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int validCombinationCount = 0;

        for (int i = 0; i <= n ; i++) { //x1
            for (int j = 0; j <= n ; j++) { //x2
                for (int k = 0; k <= n ; k++) { //x3
                    if(i+j+k==n){
                        validCombinationCount++;
                    }
                }
            }
        }
        System.out.println(validCombinationCount);
    }
}
