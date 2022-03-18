package MoreExercises.ME5WhileLoop;

import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededMoney = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double card = 0;
        double cash = 0;
        double total = 0;
        int countCash=0;
        int countCard=0;
        int times = 0;
        boolean isEnough = false;
        while (!command.equals("End")) {
            int prize = Integer.parseInt(command);
            times += 1;
            if (times%2==0){
                if (prize<10){
                    System.out.println("Error in transaction!");
                }else {
                    System.out.println("Product sold!");
                    card+=prize;
                    countCard++;
                    total+=prize;
                }
            }else {
                if (prize>100){
                    System.out.println("Error in transaction!");
                }else {
                    System.out.println("Product sold!");
                    cash+=prize;
                    countCash++;
                    total+=prize;
                }
            }
            if (total>=neededMoney){
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("End")){
            System.out.println("Failed to collect required money for charity.");
        }else {
            System.out.printf("Average CS: %.2f\n",cash/countCash);
            System.out.printf("Average CC: %.2f",card/countCard);
        }
    }
}
