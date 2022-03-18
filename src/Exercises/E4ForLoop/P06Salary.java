package Exercises.E4ForLoop;

import java.util.Scanner;

public class P06Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < tabs; i++) {
            String siteName = scanner.nextLine();

            if (siteName.equals("Facebook")) {
                salary -= 150;
            } else if (siteName.equals("Instagram")) {
                salary -= 100;
            } else if (siteName.equals("Reddit")) {
                salary -= 50;
            }
            if (salary <= 0) {
                System.out.printf("You have lost your salary.");
                break;
            }
        }

        if(salary>0){
            System.out.printf("%d", salary);
        }
    }
}
