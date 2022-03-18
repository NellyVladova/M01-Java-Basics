package MoreExercises.ME1FirstSteps;

import java.util.Scanner;

public class P09WeatherForecast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        if(text.equals("sunny")){
            System.out.println("It's warm outside!");
        } else{
            System.out.println("It's cold outside!");
        }
    }
}
