package Exams.E6and7July2019;

import java.util.Scanner;

public class P01PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleNumber = Integer.parseInt(scanner.nextLine());
        double enterCharge = Double.parseDouble(scanner.nextLine());
        double loungePrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());
        double finalMoney = 0;
        double moneyForEnter = 0;
        double moneyForUmbrellas = 0;
        double moneyForLounges = 0;
        moneyForEnter = peopleNumber * enterCharge;
        moneyForUmbrellas = Math.ceil(peopleNumber * 1.00 / 2) * umbrellaPrice;
        moneyForLounges = Math.ceil(peopleNumber * 0.75) * loungePrice;
        finalMoney = moneyForEnter + moneyForLounges + moneyForUmbrellas;
        System.out.printf("%.2f lv.", finalMoney);
    }
}
