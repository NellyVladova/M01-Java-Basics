package Exercises.E6NestedLoops;

import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int currentNum = 1;
        boolean isBigger = false;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=i ; ++j) {
                if(currentNum>num){
                    isBigger = true;
                    break;
                }
                System.out.printf("%d ", currentNum);
                currentNum++;
            }
            if(isBigger){
                break;
            }
            System.out.println();
        }
    }
}
