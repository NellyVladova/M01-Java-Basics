package MoreExercises.ME3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P05Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = "";
        String place = "";
        double finalPrice = 0;

        if(season.equals("Summer")){
            if(budget<=1000){
                location = "Alaska";
                place = "Camp";
                finalPrice=budget*0.65;
            }else if(budget<=3000){
                location = "Alaska";
                place = "Hut";
                finalPrice=budget*0.80;
            }else {
                location = "Alaska";
                place = "Hotel";
                finalPrice=budget*0.90;
            }

        }else if(season.equals("Winter")){
            if(budget<=1000){
                location = "Morocco";
                place = "Camp";
                finalPrice=budget*0.45;
            }else if(budget<=3000){
                location = "Morocco";
                place = "Hut";
                finalPrice=budget*0.60;
            }else {
                location = "Morocco";
                place = "Hotel";
                finalPrice=budget*0.90;
            }
        }
        System.out.printf("%s - %s - %.2f", location, place, finalPrice);
    }
}
