package MoreExercises.ME1FirstSteps;

import java.util.Scanner;

public class P03CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double celsius = Double.parseDouble(scan.nextLine());

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.printf("%.2f", fahrenheit);
    }
}
