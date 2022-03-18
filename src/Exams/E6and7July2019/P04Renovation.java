package Exams.E6and7July2019;

import java.util.Scanner;

public class P04Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int weight = Integer.parseInt(scanner.nextLine());
        int percentOfAll = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int area = height * weight * 4;
        boolean isDone = false;
        int paintLeft = 0;

        area -= area * percentOfAll/100;

        while (!command.equals("Tired!")) {
            int paintLiters = Integer.parseInt(command);
            area-=paintLiters;
            if(area<=0){
                paintLeft = Math.abs(area);
                isDone = true;
                break;
            }
            command = scanner.nextLine();
        }
        if(isDone){
            if(paintLeft>0){
                System.out.printf("All walls are painted and you have %d l paint left!\n", paintLeft);
            }else {
                System.out.println("All walls are painted! Great job, Pesho!");
            }
        }else {
            System.out.printf("%d quadratic m left.", area);
        }

    }
}
