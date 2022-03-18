package Exams.E15and16June2019;

import java.util.Scanner;

public class P05Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double totalPoints = pointsFromAcademy;
        boolean stop = false;

        for (int i = 1; i <= n; i++) {
            String judgeName = scanner.nextLine();
            double pointsFromJudge = Double.parseDouble(scanner.nextLine());
            double currentPoints = judgeName.length()*pointsFromJudge*1.00/2;
            totalPoints+=currentPoints;
            if(totalPoints>=1250.5){
                stop = true;
                break;
            }
        }
        if (stop){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
        }else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5-totalPoints);
        }
    }
}
