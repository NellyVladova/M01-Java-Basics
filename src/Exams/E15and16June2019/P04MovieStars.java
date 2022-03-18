package Exams.E15and16June2019;

import java.util.Scanner;

public class P04MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgetForActors = Double.parseDouble(scanner.nextLine());
        String actorName = scanner.nextLine();
        boolean noMoreMoney = false;

        while (!actorName.equals("ACTION")) {
            if (actorName.length() <= 15) {
                double remuneration = Double.parseDouble(scanner.nextLine());
                budgetForActors -= remuneration;
            } else {
                double remuneration = budgetForActors * 0.20;
                budgetForActors -= remuneration;
            }
            if (budgetForActors < 0) {
                noMoreMoney = true;
                break;
            }
            actorName = scanner.nextLine();
        }
        if(noMoreMoney){
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budgetForActors));
        }else {
            System.out.printf("We are left with %.2f leva.", budgetForActors);
        }
    }
}
