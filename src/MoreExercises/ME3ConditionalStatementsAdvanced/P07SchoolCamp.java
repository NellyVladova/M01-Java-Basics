package MoreExercises.ME3ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int studentsNumber = Integer.parseInt(scanner.nextLine());
        int sleepingNights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = 0;
        double finalPrice = 0;
        String sport = "";

        switch (season) {
            case "Winter":
                if (groupType.equals("girls") || groupType.equals("boys")) {
                    pricePerNight = 9.60;
                } else if (groupType.equals("mixed")) {
                    pricePerNight = 10.00;
                }
                if(groupType.equals("girls")){
                    sport = "Gymnastics";
                }else if(groupType.equals("boys")){
                    sport = "Judo";
                }else if(groupType.equals("mixed")){
                    sport = "Ski";
                }
                break;
            case "Spring":
                if (groupType.equals("girls") || groupType.equals("boys")) {
                    pricePerNight = 7.20;
                } else if (groupType.equals("mixed")) {
                    pricePerNight = 9.50;
                }
                if(groupType.equals("girls")){
                    sport = "Athletics";
                }else if(groupType.equals("boys")){
                    sport = "Tennis";
                }else if(groupType.equals("mixed")){
                    sport = "Cycling";
                }
                break;
            case "Summer":
                if (groupType.equals("girls") || groupType.equals("boys")) {
                    pricePerNight = 15;
                } else if (groupType.equals("mixed")) {
                    pricePerNight = 20;
                }
                if(groupType.equals("girls")){
                    sport = "Volleyball";
                }else if(groupType.equals("boys")){
                    sport = "Football";
                }else if(groupType.equals("mixed")){
                    sport = "Swimming";
                }
                break;
        }
        finalPrice = pricePerNight * studentsNumber * sleepingNights;
        if(studentsNumber>=50){
            finalPrice*=0.50;
        }else if(studentsNumber>=20){
            finalPrice*=0.85;
        }else if(studentsNumber>=10){
            finalPrice*=0.95;
        }
        System.out.printf("%s %.2f lv.", sport, finalPrice);
    }
}
