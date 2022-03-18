package Exercises.E4ForLoop;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Да се напише програма, която чете n-на брой цели числа, въведени от потребителя,
//        и проверява дали сред тях съществува число, което е равно на сумата на всички останали.
//        Ако има такъв елемент, печата "Yes", "Sum = "  + неговата стойност; иначе печата "No",
//        "Diff = " + разликата между най-големия елемент и сумата на останалите (по абсолютна стойност).

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxNum = Integer.MIN_VALUE;
        int sumWithoutMaxNum = 0;
        int diff = 0;

        for (int i = 1; i <= n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            sum+=numbers;
            if(numbers>maxNum){
                maxNum = numbers;
            }
        }

        sumWithoutMaxNum = sum - maxNum;
        diff = Math.abs(maxNum - sumWithoutMaxNum);

        if(maxNum==sumWithoutMaxNum){
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumWithoutMaxNum);
        }else {
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }

    }
}
