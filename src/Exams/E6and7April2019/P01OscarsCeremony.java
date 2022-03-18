package Exams.E6and7April2019;

import java.util.Scanner;

public class P01OscarsCeremony {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        int rentForTheHall = Integer.parseInt(scanner.nextLine());
        double statuettePrice = rentForTheHall*0.70;
        double catering = statuettePrice*0.85;
        double music = catering/2;
        double neededMoney = rentForTheHall+statuettePrice+catering+music;

        System.out.printf("%.2f", neededMoney);
    }
}
