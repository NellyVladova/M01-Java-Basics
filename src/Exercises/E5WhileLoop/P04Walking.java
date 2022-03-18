package Exercises.E5WhileLoop;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int stepsCount = 0;

        while (!input.equals("Going home")){
            int steps = Integer.parseInt(input);
            stepsCount+=steps;

            if(stepsCount>=10000){
                break;
            }
            input = scanner.nextLine();
        }
        if(input.equals("Going home")){
            int stepsAfterGoingHome = Integer.parseInt(scanner.nextLine());
            stepsCount+=stepsAfterGoingHome;
        }
        if(stepsCount>=10000){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", stepsCount-10000);
        }else {
            System.out.printf("%d more steps to reach goal.", 10000-stepsCount);
        }


    }
}
