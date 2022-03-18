package MoreExercises.ME1FirstSteps;

import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double door = 1.2 * 2;
        double frontWall = x * x -door;
        double backWall = x *x;
        double window = 1.5 * 1.5;
        double rightSide = x * y - window;
        double leftSide = x * y - window;

        double roofRectangles = 2 * x * y;
        double roofTriangles = x * h;

        double green = (frontWall + backWall + rightSide + leftSide) / 3.4;
        double red = (roofRectangles + roofTriangles) / 4.3;

        System.out.printf("%.2f\n", green);
        System.out.printf("%.2f", red);

    }
}
