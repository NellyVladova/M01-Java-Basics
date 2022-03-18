package Exams.PrecursoryExam;

import java.util.Scanner;

public class P05Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int daysCount = 1;
        boolean moreThan5Days = false;
        int startMeters = 5364;
        boolean isClimbed = false;

        while (!command.equals("END")){
            int climbedMeters = Integer.parseInt(scanner.nextLine());
            if(command.equals("Yes")){
                daysCount++;
            }
            if(daysCount>5){
                moreThan5Days = true;
                break;
            }
            startMeters+=climbedMeters;
            if(startMeters>=8848){
                isClimbed = true;
                break;
            }

            command = scanner.nextLine();
        }
        if (moreThan5Days){
            //failed
            System.out.println("Failed!");
            System.out.printf("%d", startMeters);
        }else if(isClimbed){
            //reached
            System.out.printf("Goal reached for %d days!", daysCount);
        }else{
            //failed
            System.out.println("Failed!");
            System.out.printf("%d", startMeters);
        }
    }
}
