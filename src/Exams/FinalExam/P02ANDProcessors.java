package Exams.FinalExam;

import java.util.Scanner;

public class P02ANDProcessors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int processorsNumber = Integer.parseInt(scanner.nextLine());
        int employeesNumber = Integer.parseInt(scanner.nextLine());
        int workDays = Integer.parseInt(scanner.nextLine());

        int allHours = employeesNumber * workDays * 8;
        double producedProcessors = Math.floor(allHours * 1.00 / 3);
        if (producedProcessors < processorsNumber) {
            double losses = (processorsNumber - producedProcessors) * 110.10;
            System.out.printf("Losses: -> %.2f BGN", losses);
        } else {
            double profit = (producedProcessors - processorsNumber) * 110.10;
            System.out.printf("Profit: -> %.2f BGN", profit);
        }
    }
}
