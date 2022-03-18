package Exercises.E1FirstSteps;

import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int timeForBook = pages / pagesPerHour;
        int necessaryHoursPerDay = timeForBook / days;

        System.out.println(necessaryHoursPerDay);

    }
}
