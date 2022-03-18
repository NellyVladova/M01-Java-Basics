package MoreExercises.ME1FirstSteps;

import java.util.Scanner;

public class P02TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = Double.parseDouble(scan.nextLine());
        double ha = Double.parseDouble(scan.nextLine());
        double area = a * ha / 2;

        System.out.printf("%.2f", area);
    }
}
