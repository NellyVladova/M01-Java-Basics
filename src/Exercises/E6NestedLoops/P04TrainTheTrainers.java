package Exercises.E6NestedLoops;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double averageGradeOfAllPresentations = 0;
        int count = 0;

        while (!input.equals("Finish")) {
            double averageGrade = 0;
            double finalGrade = 0;
            count++;

            for (int i = 1; i <= n; i++) {
                double grades = Double.parseDouble(scanner.nextLine());
                finalGrade+=grades;
            }
            averageGrade = finalGrade/n;
            averageGradeOfAllPresentations+=averageGrade;
            System.out.printf("%s - %.2f.\n", input, averageGrade);
            input = scanner.nextLine();
        }
        averageGradeOfAllPresentations/=count;
        System.out.printf("Student's final assessment is %.2f.", averageGradeOfAllPresentations);
    }
}
