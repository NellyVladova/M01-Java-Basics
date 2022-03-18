package Exams.E18and19July2020;

import java.util.Scanner;

public class P03AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int joineryNumber = Integer.parseInt(scanner.nextLine());
        String joineryType = scanner.nextLine();
        String delivery = scanner.nextLine();
        double joineryPrice = 0;
        double finalPrice = 0;

        switch (joineryType){
            case "90X130":
                joineryPrice = 110;
                if(joineryNumber>30 && joineryNumber<=60){
                    joineryPrice*=0.95;
                }else if(joineryNumber>60){
                    joineryPrice*=0.92;
                }
                break;
            case "100X150":
                joineryPrice = 140;
                if(joineryNumber>40 && joineryNumber<=80){
                    joineryPrice*=0.94;
                }else if(joineryNumber>80){
                    joineryPrice*=0.90;
                }
                break;
            case "130X180":
                joineryPrice = 190;
                if(joineryNumber>20 && joineryNumber<=50){
                    joineryPrice*=0.93;
                }else if(joineryNumber>50){
                    joineryPrice*=0.88;
                }
                break;
            case "200X300":
                joineryPrice = 250;
                if(joineryNumber>25 && joineryNumber<=50){
                    joineryPrice*=0.91;
                }else if(joineryNumber>50){
                    joineryPrice*=0.86;
                }
                break;
        }

        if(delivery.equals("With delivery")){
            finalPrice = joineryPrice*joineryNumber + 60;
        }else {
            finalPrice = joineryPrice*joineryNumber;
        }
        if(joineryNumber>99){
            finalPrice*=0.96;
        }
        if(joineryNumber<10){
            System.out.println("Invalid order");
        }else {
            System.out.printf("%.2f BGN", finalPrice);
        }
    }
}
