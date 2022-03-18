package Exams.E2and3May2019;

import java.util.Scanner;

public class P03MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String timeLimit = scanner.nextLine();
        String agreement = scanner.nextLine();
        String mobileInternet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());
        double pricePerMonth = 0;
        double totalBill = 0;

        switch (agreement){
            case "Small":
                if(timeLimit.equals("one")){
                    pricePerMonth = 9.98;
                }else if(timeLimit.equals("two")){
                    pricePerMonth = 8.58;
                }
                break;
            case "Middle":
                if(timeLimit.equals("one")){
                    pricePerMonth = 18.99;
                }else if(timeLimit.equals("two")){
                    pricePerMonth = 17.09;
                }
                break;
            case "Large":
                if(timeLimit.equals("one")){
                    pricePerMonth = 25.98;
                }else if(timeLimit.equals("two")){
                    pricePerMonth = 23.59;
                }
                break;
            case "ExtraLarge":
                if(timeLimit.equals("one")){
                    pricePerMonth = 35.99;
                }else if(timeLimit.equals("two")){
                    pricePerMonth = 31.79;
                }
                break;
        }
        if(mobileInternet.equals("yes")){
            if(pricePerMonth<=10){
                pricePerMonth+=5.50;
            }else if(pricePerMonth<=30){
                pricePerMonth+=4.35;
            }else {
                pricePerMonth+=3.85;
            }
        }
        totalBill=pricePerMonth*months;
        if(timeLimit.equals("two")){
            totalBill*=0.9625;
        }
        System.out.printf("%.2f lv.", totalBill);
    }
}
