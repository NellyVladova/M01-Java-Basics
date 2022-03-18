package MoreExercises.ME2ConditionalStatements;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int holidays = Integer.parseInt(scanner.nextLine());
        int workDays = 365 - holidays;
        int timeForPlayHoliday = holidays * 127;
        int timeForPlayWorkDay = workDays * 63;
        int totalMinForPlaying = timeForPlayHoliday + timeForPlayWorkDay;
        int enoughMinForPlaying = 30000;

        if (totalMinForPlaying > enoughMinForPlaying) {
            System.out.println("Tom will run away");
            int h = (totalMinForPlaying - enoughMinForPlaying) / 60;
            int m = (totalMinForPlaying - enoughMinForPlaying) % 60;
            System.out.printf("%d hours and %d minutes more for play", h, m);
        } else {
            System.out.println("Tom sleeps well");
            int h = (enoughMinForPlaying - totalMinForPlaying) / 60;
            int m = (enoughMinForPlaying - totalMinForPlaying) % 60;
            System.out.printf("%d hours and %d minutes less for play", h, m);
        }
    }
}
