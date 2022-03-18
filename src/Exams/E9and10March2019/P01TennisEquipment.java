package Exams.E9and10March2019;

import java.util.Scanner;

public class P01TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tennisRacket = Double.parseDouble(scanner.nextLine());
        int tennisRacketNumber = Integer.parseInt(scanner.nextLine());
        int shoesNumber = Integer.parseInt(scanner.nextLine());

        double tennisRacketPrice = tennisRacket * tennisRacketNumber;
        double shoesPrice = shoesNumber * (tennisRacket / 6);
        double equipment = (shoesPrice + tennisRacketPrice) * 0.2;
        double totalPrice = tennisRacketPrice + shoesPrice + equipment;
        double priceForDjokovic = totalPrice / 8;
        double priceForSponsors = totalPrice * 7 / 8;

        System.out.printf("Price to be paid by Djokovic %.0f\n", Math.floor(priceForDjokovic));
        System.out.printf("Price to be paid by sponsors %.0f\n", Math.ceil(priceForSponsors));
    }
}
