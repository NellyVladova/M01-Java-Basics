package Exams.FinalExam;

import java.util.Scanner;

public class P03CatLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String catBreed = scanner.nextLine();
        String catGender = scanner.nextLine();
        boolean invalid = false;
        int years = 0;
        double catMonths = 0;
        String invalidCat = "";

        switch (catBreed) {
            case "British Shorthair":
                if (catGender.equals("m")) {
                    years = 13;
                } else if (catGender.equals("f")) {
                    years = 14;
                }
                break;
            case "Siamese":
                if (catGender.equals("m")) {
                    years = 15;
                } else if (catGender.equals("f")) {
                    years = 16;
                }
                break;
            case "Persian":
                if (catGender.equals("m")) {
                    years = 14;
                } else if (catGender.equals("f")) {
                    years = 15;
                }
                break;
            case "Ragdoll":
                if (catGender.equals("m")) {
                    years = 16;
                } else if (catGender.equals("f")) {
                    years = 17;
                }
                break;
            case "American Shorthair":
                if (catGender.equals("m")) {
                    years = 12;
                } else if (catGender.equals("f")) {
                    years = 13;
                }
                break;
            case "Siberian":
                if (catGender.equals("m")) {
                    years = 11;
                } else if (catGender.equals("f")) {
                    years = 12;
                }
                break;
            default:
                invalid = true;
                invalidCat = catBreed;
                break;
        }
        catMonths = years * 1.00 * 12 / 6;
        if (invalid) {
            System.out.printf("%s is invalid cat!", invalidCat);
        } else {
            System.out.printf("%.0f cat months", catMonths);
        }
    }
}
