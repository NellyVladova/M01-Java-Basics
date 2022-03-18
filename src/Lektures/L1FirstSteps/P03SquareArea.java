package Lektures.L1FirstSteps;

import java.util.Scanner;

public class P03SquareArea {
    public static void main(String[] args) {
        //System.out.println("Input number:");
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int area = a * a;
        System.out.println(area);
    }
}
