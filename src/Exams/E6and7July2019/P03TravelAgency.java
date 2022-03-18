package Exams.E6and7July2019;

import java.util.Scanner;

public class P03TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        String packetType = scanner.nextLine();
        String VIPDiscount = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double pricePerDay = 0;
        double finalMoney = 0;
        boolean isInvalid = false;

        switch (city){
            case "Bansko":
            case "Borovets":
                if(packetType.equals("noEquipment")){
                    pricePerDay = 80;
                    if(VIPDiscount.equals("yes")){
                        pricePerDay*=0.95;
                    }
                }else if(packetType.equals("withEquipment")){
                    pricePerDay = 100;
                    if(VIPDiscount.equals("yes")){
                        pricePerDay*=0.90;
                    }
                }else {
                    isInvalid = true;
                }
                break;
            case "Varna":
            case "Burgas":
                if(packetType.equals("noBreakfast")){
                    pricePerDay = 100;
                    if(VIPDiscount.equals("yes")){
                        pricePerDay*=0.93;
                    }
                }else if(packetType.equals("withBreakfast")){
                    pricePerDay = 130;
                    if(VIPDiscount.equals("yes")){
                        pricePerDay*=0.88;
                    }
                }else {
                    isInvalid = true;
                }
                break;
            default:
                isInvalid = true;
                break;
        }
        if(days>7){
            finalMoney = pricePerDay*(days-1);
        }else {
            finalMoney = pricePerDay*days;
        }
        if(days<1){
            System.out.println("Days must be positive number!");
        }else if(isInvalid){
            System.out.println("Invalid input!");
        } else {
            System.out.printf("The price is %.2flv! Have a nice time!", finalMoney);
        }
    }
}
