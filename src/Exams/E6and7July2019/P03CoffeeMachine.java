package Exams.E6and7July2019;

import java.util.Scanner;

public class P03CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drinkType = scanner.nextLine();
        String sugarType = scanner.nextLine();
        int drinkNumber = Integer.parseInt(scanner.nextLine());
        double espressoPrice = 0;
        double cappuccinoPrice = 0;
        double teaPrice = 0;
        double finalBill = 0;

        switch (drinkType){
            case "Espresso":
                if(sugarType.equals("Without")){
                    espressoPrice = 0.90;
                    espressoPrice*=0.65;
                }else if(sugarType.equals("Normal")){
                    espressoPrice = 1.00;
                }else if(sugarType.equals("Extra")){
                    espressoPrice = 1.20;
                }
                if(drinkNumber>=5){
                    espressoPrice*=0.75;
                }
                finalBill+=espressoPrice*drinkNumber;
                break;
            case "Cappuccino":
                if(sugarType.equals("Without")){
                    cappuccinoPrice = 1.00;
                    cappuccinoPrice*=0.65;
                }else if(sugarType.equals("Normal")){
                    cappuccinoPrice = 1.20;
                }else if(sugarType.equals("Extra")){
                    cappuccinoPrice = 1.60;
                }
                finalBill+=cappuccinoPrice*drinkNumber;
                break;
            case "Tea":
                if(sugarType.equals("Without")){
                    teaPrice = 0.50;
                    teaPrice*=0.65;
                }else if(sugarType.equals("Normal")){
                    teaPrice = 0.60;
                }else if(sugarType.equals("Extra")){
                    teaPrice = 0.70;
                }
                finalBill+=teaPrice*drinkNumber;
                break;
        }
        if (finalBill>15.00){
            finalBill*=0.80;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", drinkNumber, drinkType, finalBill);
    }
}
