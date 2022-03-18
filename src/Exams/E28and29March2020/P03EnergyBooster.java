package Exams.E28and29March2020;

import java.util.Scanner;

public class P03EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String setType = scanner.nextLine();
        int setsNumber = Integer.parseInt(scanner.nextLine());
        double gelPrice = 0;
        int gelNumber = 0;

        switch (fruit){
            case "Watermelon":
                if(setType.equals("small")){
                    gelNumber = 2;
                    gelPrice = 56;
                }else if(setType.equals("big")){
                    gelNumber = 5;
                    gelPrice = 28.70;
                }
                break;
            case "Mango":
                if(setType.equals("small")){
                    gelNumber = 2;
                    gelPrice = 36.66;
                }else if(setType.equals("big")){
                    gelNumber = 5;
                    gelPrice = 19.60;
                }
                break;
            case "Pineapple":
                if(setType.equals("small")){
                    gelNumber = 2;
                    gelPrice = 42.10;
                }else if(setType.equals("big")){
                    gelNumber = 5;
                    gelPrice = 24.80;
                }
                break;
            case "Raspberry":
                if(setType.equals("small")){
                    gelNumber = 2;
                    gelPrice = 20;
                }else if(setType.equals("big")){
                    gelNumber = 5;
                    gelPrice = 15.20;
                }
                break;
        }
        double packPrice = gelPrice*gelNumber;
        double finalPrice = setsNumber*packPrice;
        if(finalPrice>=400 && finalPrice<=1000){
            finalPrice*=0.85;
        }else if(finalPrice>1000){
            finalPrice*=0.5;
        }
        System.out.printf("%.2f lv.", finalPrice);
    }
}
