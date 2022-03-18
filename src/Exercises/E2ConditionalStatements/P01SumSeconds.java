package Exercises.E2ConditionalStatements;

import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sec1 = Integer.parseInt(scan.nextLine());
        int sec2 = Integer.parseInt(scan.nextLine());
        int sec3 = Integer.parseInt(scan.nextLine());
        int allSec = sec1 + sec2 + sec3;
        int minutes = allSec / 60;
        int seconds = allSec % 60;
        if (seconds < 10){
            System.out.printf("%d:0%d", minutes , seconds);
        }else {
            System.out.printf("%d:%d", minutes , seconds);
        }
    }
}
