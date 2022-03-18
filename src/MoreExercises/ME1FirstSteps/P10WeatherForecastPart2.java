package MoreExercises.ME1FirstSteps;

import java.util.Scanner;

public class P10WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double degrees = Double.parseDouble(scan.nextLine());

        if (degrees <= 35.00 && degrees>= 26.00) {
            System.out.println("Hot");
        } else if (degrees <= 25.9 && degrees >= 20.1){
            System.out.println("Warm");
        } else if (degrees <= 20.00 && degrees >= 15.00){
            System.out.println("Mild");
        } else if (degrees <= 14.9 && degrees >= 12.00){
            System.out.println("Cool");
        } else if (degrees <= 11.9 && degrees >= 5.00){
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }
    }
}
