package Exams.E20and21April2019;

import java.util.Scanner;

public class P02EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guestsNumber = Integer.parseInt(scanner.nextLine());
        double coverPrice = Double.parseDouble(scanner.nextLine());
        double desiBudget = Double.parseDouble(scanner.nextLine());

        if(guestsNumber>=10 && guestsNumber<=15){
            coverPrice*=0.85;
        }else if(guestsNumber>=16 && guestsNumber<=20){
            coverPrice*=0.80;
        }else if(guestsNumber>20){
            coverPrice*=0.75;
        }
        double cakePrice = desiBudget*0.10;
        double totalPrice = guestsNumber*coverPrice+cakePrice;
        if(totalPrice<=desiBudget){
            System.out.printf("It is party time! %.2f leva left.", desiBudget-totalPrice);
        }else {
            System.out.printf("No party! %.2f leva needed.", totalPrice-desiBudget);
        }
    }
}
