package Exams.FinalExam;

import java.util.Scanner;

public class P05ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int toysCounter = 0;
        int sweaterCounter = 0;
        int kidsCount = 0;
        int adultCount = 0;

        while (!command.equals("Christmas")){
            int years = Integer.parseInt(command);

            if(years<=16){
                kidsCount++;
                toysCounter++;
            }else {
                adultCount++;
                sweaterCounter++;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Number of adults: %d\n", adultCount);
        System.out.printf("Number of kids: %d\n", kidsCount);
        System.out.printf("Money for toys: %d\n", kidsCount*5);
        System.out.printf("Money for sweaters: %d\n", adultCount*15);
    }
}
