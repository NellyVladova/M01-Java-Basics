package Exams.E9and10March2019;

import java.util.Scanner;

public class P04Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();
        String area = scanner.nextLine();
        int startPoints = 301;
        boolean finish = false;
        int failedShotsCount = 0;
        int succeededShotsCount = 0;

        while (!area.equals("Retire")) {
            int points = Integer.parseInt(scanner.nextLine());
            switch (area){
                case "Single":
                    break;
                case "Double":
                    points*=2;
                    break;
                case "Triple":
                   points*=3;
                    break;
            }
            if (points > startPoints) {
                failedShotsCount++;
                area = scanner.nextLine();
                continue;
            } else if (points < startPoints) {
                succeededShotsCount++;
                startPoints-=points;
            }else if(points==startPoints){
                finish = true;
                succeededShotsCount++;
                break;
            }
            area = scanner.nextLine();
        }
        if(finish){
            System.out.printf("%s won the leg with %d shots.", playerName, succeededShotsCount);
        }else {
            System.out.printf("%s retired after %d unsuccessful shots.", playerName, failedShotsCount);
        }
    }
}
