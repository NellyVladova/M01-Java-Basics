package Exams.E15and16June2019;

import java.util.Scanner;

public class P06FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int movieCount = 0;
        boolean moviesAre7 = false;
        int max = Integer.MIN_VALUE;
        String favouriteMovieName = "";

        while (!movieName.equals("STOP")) {
            movieCount++;
            int totalValue = 0;
            int length = movieName.length();
            for (int i = 0; i < length; i++) {
                char character = movieName.charAt(i);
                //char firstLetter = movieName.charAt(0);
                int asciiValue = 0;
                //asciiValue = (int) firstLetter;
                asciiValue += (int) character;
                if ((character >= 65 && character <= 90)) {//ABCD...
                    asciiValue -= movieName.length();
                } else if ((character >= 97 && character <= 122)) {//abcd...
                    asciiValue -= (movieName.length() * 2);
                }
                totalValue += asciiValue;
            }
            if (totalValue > max) {
                max = totalValue;
                favouriteMovieName = movieName;
            }

            if (movieCount == 7) {
                moviesAre7 = true;
                break;
            }
            movieName = scanner.nextLine();
        }
        if (moviesAre7) {
            System.out.printf("The limit is reached.\n");
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", favouriteMovieName, max);
    }
}
