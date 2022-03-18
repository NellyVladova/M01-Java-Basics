package Exams.E20and21April2019;

import java.util.Scanner;

public class P03EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String stayTime = scanner.nextLine();
        int sleepNightNumber = Integer.parseInt(scanner.nextLine());
        int sleepNightPrice = 0;

        switch (destination) {
            case "France":
                if (stayTime.equals("21-23")) {
                    sleepNightPrice = 30;
                } else if (stayTime.equals("24-27")) {
                    sleepNightPrice = 35;
                } else if (stayTime.equals("28-31")) {
                    sleepNightPrice = 40;
                }
                break;
            case "Italy":
                if (stayTime.equals("21-23")) {
                    sleepNightPrice = 28;
                } else if (stayTime.equals("24-27")) {
                    sleepNightPrice = 32;
                } else if (stayTime.equals("28-31")) {
                    sleepNightPrice = 39;
                }
                break;
            case "Germany":
                if (stayTime.equals("21-23")) {
                    sleepNightPrice = 32;
                } else if (stayTime.equals("24-27")) {
                    sleepNightPrice = 37;
                } else if (stayTime.equals("28-31")) {
                    sleepNightPrice = 43;
                }
                break;
        }
        System.out.printf("Easter trip to %s : %.2f leva.", destination, sleepNightNumber * sleepNightPrice * 1.0);
    }
}
