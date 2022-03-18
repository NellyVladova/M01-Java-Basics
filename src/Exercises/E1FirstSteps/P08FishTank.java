package Exercises.E1FirstSteps;

import java.util.Scanner;

public class P08FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int wide = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        double volumeInLitres = length * wide * height * 0.001;
        double realPercent = percent / 100;
        double totalLitres = volumeInLitres * (1- realPercent);

        System.out.printf("%.2f", totalLitres);
    }
}
