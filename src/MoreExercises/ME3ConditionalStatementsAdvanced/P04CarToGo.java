package MoreExercises.ME3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String carClass = "";
        String carType= "";
        double carPrice = 0;

        switch (season){
            case "Summer":
                if(budget<=100){
                    carClass = "Economy class";
                    carType = "Cabrio";
                    carPrice = budget*0.35;
                }else if(budget<=500){
                    carClass = "Compact class";
                    carType = "Cabrio";
                    carPrice = budget*0.45;
                }else {
                    carClass = "Luxury class";
                    carType = "Jeep";
                    carPrice = budget*0.90;
                }
                break;
            case "Winter":
                if(budget<=100){
                    carClass = "Economy class";
                    carType = "Jeep";
                    carPrice = budget*0.65;
                }else if(budget<=500){
                    carClass = "Compact class";
                    carType = "Jeep";
                    carPrice = budget*0.80;
                }else {
                    carClass = "Luxury class";
                    carType = "Jeep";
                    carPrice = budget*0.90;
                }
                break;
        }
        System.out.println(carClass);
        System.out.printf("%s - %.2f", carType, carPrice);
    }
}
