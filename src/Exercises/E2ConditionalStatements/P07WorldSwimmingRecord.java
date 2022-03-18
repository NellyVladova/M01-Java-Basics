package Exercises.E2ConditionalStatements;

import java.util.Scanner;

public class P07WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double record = Double.parseDouble(scan.next());
        double metres = Double.parseDouble(scan.next());
        double secondsPerMeter = Double.parseDouble(scan.next());

        double delay = Math.floor(metres/15) * 12.5;
        double totalTime = metres * secondsPerMeter + delay;
        if(totalTime<record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - record);
        }
    }
}
