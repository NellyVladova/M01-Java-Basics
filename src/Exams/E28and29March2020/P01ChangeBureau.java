package Exams.E28and29March2020;

import java.util.Scanner;

public class P01ChangeBureau {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);

        int bitcoins = Integer.parseInt(scanner.nextLine());
        double chineseYuan = Double.parseDouble(scanner.nextLine());
        double commissionPercent = Double.parseDouble(scanner.nextLine());

        double euro = 0;
        double lv = 0;
        double dollars = 0;
        double commissionValue = 0;

        lv = bitcoins*1168;
        dollars = chineseYuan*0.15;

        euro = lv/1.95 + dollars*1.76/1.95;
        commissionValue = euro*(commissionPercent/100);
        euro-=commissionValue;

        System.out.printf("%.2f", euro);
    }
}
