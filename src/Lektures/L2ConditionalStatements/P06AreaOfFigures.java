package Lektures.L2ConditionalStatements;

import java.util.Scanner;

public class P06AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String shape = scan.nextLine();
        if (shape.equals("square")){
            double a = Double.parseDouble(scan.nextLine());
            double area = a * a;
            System.out.printf("%.3f", area);
        }else if (shape.equals("rectangle")){
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            double area = a * b;
            System.out.printf("%.3f", area);
        }else if (shape.equals("circle")){
            double r = Double.parseDouble(scan.nextLine());
            double area = Math.PI * r * r;
            System.out.printf("%.3f", area);
        }else if (shape.equals("triangle")){
            double a = Double.parseDouble(scan.nextLine());
            double h = Double.parseDouble(scan.nextLine());
            double area = a * h/2;
            System.out.printf("%.3f", area);
        }
    }
}
