package Exams.E6and7April2019;

import java.util.Scanner;

public class P05MovieRatings {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int movieNumbers = Integer.parseInt(scanner.nextLine());
        double maxRating = Double.MIN_VALUE;
        double minRating = Double.MAX_VALUE;
        double averageRating = 0;
        int ratingCount = 0;
        String maxRatingMovieName = "";
        String minRatingMovieName = "";

        for (int i = 1; i <= movieNumbers ; i++) {
            String movieName = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            if(rating>maxRating){
                maxRatingMovieName = movieName;
                maxRating = rating;
            }
            if(rating<minRating){
                minRatingMovieName = movieName;
                minRating = rating;
            }
            averageRating+=rating;
            ratingCount++;
        }
        System.out.printf("%s is with highest rating: %.1f\n", maxRatingMovieName, maxRating);
        System.out.printf("%s is with lowest rating: %.1f\n", minRatingMovieName, minRating);
        System.out.printf("Average rating: %.1f\n", averageRating/ratingCount);

    }
}
