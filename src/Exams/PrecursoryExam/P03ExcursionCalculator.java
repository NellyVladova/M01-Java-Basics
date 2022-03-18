package Exams.PrecursoryExam;

import java.util.Scanner;

public class P03ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleNumber = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;

        switch (season){
            case "spring":
                if(peopleNumber<=5){
                    price = 50.00;
                }else {
                    price = 48.00;
                }
                break;
            case "summer":
                if(peopleNumber<=5){
                    price = 48.50;
                }else {
                    price = 45.00;
                }
                price*=0.85;
                break;
            case "autumn":
                if(peopleNumber<=5){
                    price = 60.00;
                }else {
                    price = 49.50;
                }
                break;
            case "winter":
                if(peopleNumber<=5){
                    price = 86.00;
                }else {
                    price = 85.00;
                }
                price*=1.08;
                break;
        }
        System.out.printf("%.2f leva.", price*peopleNumber);
    }
}
