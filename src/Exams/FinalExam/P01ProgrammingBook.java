package Exams.FinalExam;

import java.util.Scanner;

public class P01ProgrammingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerOnePage = Double.parseDouble(scanner.nextLine());
        double pricePerOneCover = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());
        double moneyForDesigner = Double.parseDouble(scanner.nextLine());
        int moneyFromTheTeam = Integer.parseInt(scanner.nextLine());

        double firstSum = pricePerOnePage*899 + pricePerOneCover*2;
        double withDiscount = firstSum - (firstSum*percent/100);
        double finalSum = withDiscount + moneyForDesigner;
        finalSum = finalSum-(finalSum*moneyFromTheTeam/100);

        System.out.printf("Avtonom should pay %.2f BGN.", finalSum);
    }
}
