package MoreExercises.ME2ConditionalStatements;

import java.util.Scanner;

public class P08FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double fuelLiters = Double.parseDouble(scanner.nextLine());

        switch (fuel){
            case "Diesel":
                fuel = "diesel";
                if(fuelLiters>=25){
                    System.out.printf("You have enough %s.", fuel);
                }else {
                    System.out.printf("Fill your tank with %s!", fuel);
                }
                break;
            case "Gasoline":
                fuel = "gasoline";
                if(fuelLiters>=25){
                    System.out.printf("You have enough %s.", fuel);
                }else {
                    System.out.printf("Fill your tank with %s!", fuel);
                }
                break;
            case "Gas":
                fuel="gas";
                if(fuelLiters>=25){
                    System.out.printf("You have enough %s.", fuel);
                }else {
                    System.out.printf("Fill your tank with %s!", fuel);
                }
                break;
            default:
                System.out.println("Invalid fuel!");
                break;
        }

    }
}
