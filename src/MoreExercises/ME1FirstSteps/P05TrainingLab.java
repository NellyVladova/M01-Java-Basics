package MoreExercises.ME1FirstSteps;

import java.util.Scanner;

public class P05TrainingLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double w = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        int wCm = (int) (w*100);
        int hCm = (int) (h*100);
        int desks = (hCm-100) / 70;
        int rows = wCm / 120;
        int place = (desks * rows) - 3;

        System.out.println(place);
    }
}
