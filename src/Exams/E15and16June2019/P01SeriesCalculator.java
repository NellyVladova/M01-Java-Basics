package Exams.E15and16June2019;

import java.util.Scanner;

public class P01SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int seasonsNumber = Integer.parseInt(scanner.nextLine());
        int episodesNumber = Integer.parseInt(scanner.nextLine());
        double timeForOneEpisode = Double.parseDouble(scanner.nextLine());
        double advertising = timeForOneEpisode * 0.20;
        double timePlusAdvertising = advertising+timeForOneEpisode;
        double extraTime = seasonsNumber*10;
        double totalTime =timePlusAdvertising*episodesNumber*seasonsNumber +extraTime;
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", seriesName, totalTime);

    }
}
