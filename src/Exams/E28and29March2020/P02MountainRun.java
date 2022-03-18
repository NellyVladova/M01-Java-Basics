package Exams.E28and29March2020;

import java.util.Scanner;

public class P02MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secondsPer1Meter = Double.parseDouble(scanner.nextLine());

        double georgiTime = distance * secondsPer1Meter;
        double delay = Math.floor(distance / 50);
        delay*=30;
        georgiTime += delay;
        if(georgiTime<record){
            System.out.printf("Yes! The new record is %.2f seconds.", georgiTime);
        }else {
            System.out.printf("No! He was %.2f seconds slower.", georgiTime-record);
        }
    }
}
