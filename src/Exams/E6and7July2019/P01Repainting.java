package Exams.E6and7July2019;

import java.util.Scanner;

public class P01Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededNylon = Integer.parseInt(scanner.nextLine());
        int neededPaint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double finalPaint=neededPaint*1.10;
        neededNylon+=2;
        double moneyForNylon = neededNylon*1.50;
        double moneyForPaint = finalPaint*14.50;
        double moneyForThinner = thinner*5.00;
        double moneyForMaterials = moneyForNylon+moneyForPaint+moneyForThinner+0.40;
        double moneyForWorkers = hours*moneyForMaterials*0.30;
        double finalMoney = moneyForWorkers+moneyForMaterials;
        System.out.printf("Total expenses: %.2f lv.", finalMoney);


    }
}
