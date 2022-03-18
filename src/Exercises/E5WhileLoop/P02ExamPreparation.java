package Exercises.E5WhileLoop;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int failedMarks = Integer.parseInt(scanner.nextLine());
        int failedTimes = 0;
        int solvedProblemsCount = 0;
        double gradesSum = 0;
        String lastProblem = "";
        boolean isFailed = true;

        while (failedTimes < failedMarks) {
            String problemName = scanner.nextLine();
            if (problemName.equals("Enough")) {
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                failedTimes++;
            }
            gradesSum += grade;
            solvedProblemsCount++;
            lastProblem = problemName;
        }
        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", failedMarks);
        } else {
            System.out.printf("Average score: %.2f\n", gradesSum / solvedProblemsCount);
            System.out.printf("Number of problems: %d\n", solvedProblemsCount);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
