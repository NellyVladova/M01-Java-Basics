package Exams.E9and10March2019;

import java.util.Scanner;

public class P02Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        int secondsFor100m = Integer.parseInt(scanner.nextLine());

        int totalTimeInSeconds = minutes * 60 + seconds;
        double extra = length / 120;
        double extraTime = extra * 2.5;
        double martinTime = (length * 1.0 / 100) * secondsFor100m - extraTime;
        if (martinTime <= totalTimeInSeconds) {
            //vzel e kvota
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", martinTime);
        } else {
            //ne e vzel
            System.out.printf("No, Marin failed! He was %.3f second slower.", Math.abs(totalTimeInSeconds - martinTime));
        }
    }
}
