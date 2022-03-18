package Exams.E15and16June2019;

import java.util.Scanner;

public class P05Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int movieNumbers = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        int movieCount = 0;
        boolean stop = false;

        for (int i = 1; i <= movieNumbers; i++) {
            String name = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());
            switch (name){
                case "Thrones":
                    price*=0.5;
                    break;
                case "Lucifer":
                    price*=0.6;
                    break;
                case "Protector":
                    price*=0.7;
                    break;
                case "TotalDrama":
                    price*=0.8;
                    break;
                case "Area":
                    price*=0.9;
                    break;
            }
            totalPrice+=price;
            movieCount++;
            if(movieCount==movieNumbers && totalPrice>budget){
                stop = true;
                break;
            }
        }
        if(stop){
            System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(totalPrice-budget));
        }else {
            System.out.printf("You bought all the series and left with %.2f lv.", Math.abs(budget-totalPrice));
        }
    }
}
