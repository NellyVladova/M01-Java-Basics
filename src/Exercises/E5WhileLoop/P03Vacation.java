package Exercises.E5WhileLoop;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgetForTrip = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());
        int daysCount = 0;
        int spendingCount = 0;

        while (currentMoney<budgetForTrip && spendingCount<5){
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            daysCount++;
            if (action.equals("save")){
                currentMoney+=money;
                spendingCount=0;
            }else if(action.equals("spend")){
                currentMoney-=money;
                spendingCount++;
                if(currentMoney<0){
                    currentMoney=0;
                }
            }
        }
        if(spendingCount==5){
            System.out.println("You can't save the money.");
            System.out.println(daysCount);
        }
        if(currentMoney>=budgetForTrip){
            System.out.printf("You saved the money for %d days.", daysCount);
        }

    }
}
