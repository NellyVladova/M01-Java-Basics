package Exams.E28and29March2020;

import java.util.Scanner;

public class P04TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupNumber = Integer.parseInt(scanner.nextLine());
        double musalaCount = 0;
        double montBlancCount = 0;
        double kilimanjaroCount = 0;
        double k2Count = 0;
        double everestCount = 0;
        int allPeople = 0;

        for (int i = 1; i <= groupNumber; i++) {
            int peopleNumber = Integer.parseInt(scanner.nextLine());

            allPeople += peopleNumber;
            if (peopleNumber <= 5) {
                musalaCount += peopleNumber;
            } else if (peopleNumber <= 12) {
                montBlancCount += peopleNumber;
            } else if (peopleNumber <= 25) {
                kilimanjaroCount += peopleNumber;
            } else if (peopleNumber <= 40) {
                k2Count += peopleNumber;
            } else {
                everestCount += peopleNumber;
            }
        }
        System.out.printf("%.2f%%\n", musalaCount / allPeople * 100);
        System.out.printf("%.2f%%\n", montBlancCount / allPeople * 100);
        System.out.printf("%.2f%%\n", kilimanjaroCount / allPeople * 100);
        System.out.printf("%.2f%%\n", k2Count / allPeople * 100);
        System.out.printf("%.2f%%\n", everestCount / allPeople * 100);
    }
}
