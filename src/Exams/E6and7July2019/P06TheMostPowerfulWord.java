package Exams.E6and7July2019;

import java.util.Scanner;

public class P06TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        double maxValue = Double.MIN_VALUE;
        String mostPowerfulWord = "";

        while (!word.equals("End of words")) {
            int length = word.length();
            double totalValue = 0;
            for (int i = 0; i < length; i++) {
                char character = word.charAt(i);
                char firstLetter = word.charAt(0);
                int asciiValue = 0;
                asciiValue = (int) character;
                totalValue += asciiValue;
                if (i == length - 1) {
                    if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i'
                            || firstLetter == 'o' || firstLetter == 'u' || firstLetter == 'y' ||
                            firstLetter == 'A' || firstLetter == 'E' || firstLetter == 'I'
                            || firstLetter == 'O' || firstLetter == 'U' || firstLetter == 'Y') {
                        totalValue *= length;
                    }else {
                        totalValue /= length;

                    }
                }
            }
            if (totalValue > maxValue) {
                maxValue = totalValue;
                mostPowerfulWord = word;
            }
            word = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f", mostPowerfulWord, maxValue);
    }
}
