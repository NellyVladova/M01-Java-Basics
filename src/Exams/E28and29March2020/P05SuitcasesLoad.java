package Exams.E28and29March2020;

import java.util.Scanner;

public class P05SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        boolean isFull = false;
        double currentCapacity = 0;
        int suitcaseCount = 0;

        while (!command.equals("End")) {
            double suitcaseVolume = Double.parseDouble(command);
            currentCapacity += suitcaseVolume;

            if (currentCapacity >= capacity) {
                isFull = true;
                break;
            }
            suitcaseCount++;
            command = scanner.nextLine();
        }
        if (isFull) {
            System.out.println("No more space!");
        } else {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", suitcaseCount);
    }
}
