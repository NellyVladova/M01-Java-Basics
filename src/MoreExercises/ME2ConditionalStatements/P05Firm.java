package MoreExercises.ME2ConditionalStatements;

import java.util.Scanner;

public class P05Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hoursForProject = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int employers = Integer.parseInt(scanner.nextLine());
        double hoursForWork = days * 0.90 * 8;
        int workExtraHours = employers * 2 * days;
        double finalHours = Math.floor(hoursForWork + workExtraHours);

        if(finalHours<hoursForProject){
            System.out.printf("Not enough time!%.0f hours needed.", hoursForProject-finalHours);
        }else {
            System.out.printf("Yes!%.0f hours left.", finalHours-hoursForProject);
        }

    }
}
