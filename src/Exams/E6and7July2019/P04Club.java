package Exams.E6and7July2019;

import java.util.Scanner;

public class P04Club {
    public static void main(String[] args) {
        Scanner scanner  =new Scanner(System.in);

        double dreamedSum = Double.parseDouble(scanner.nextLine());
        String cocktailName = scanner.nextLine();
        boolean areCollected  = false;
        double allMoney = 0;

        while (!cocktailName.equals("Party!")){
            int cocktailNumber = Integer.parseInt(scanner.nextLine());
            double cocktailPrice = cocktailName.length();
            double moneyFromOneOrder = 0;
            moneyFromOneOrder=cocktailPrice*cocktailNumber;
            if(moneyFromOneOrder%2!=0){
                moneyFromOneOrder*=0.75;
            }
            allMoney+=moneyFromOneOrder;
            if(allMoney>=dreamedSum){
                areCollected = true;
                break;
            }
            cocktailName = scanner.nextLine();
        }
        if(areCollected){
            System.out.println("Target acquired.");
        }else {
            System.out.printf("We need %.2f leva more.\n", dreamedSum-allMoney);
        }
        System.out.printf("Club income - %.2f leva.", allMoney);
    }
}
