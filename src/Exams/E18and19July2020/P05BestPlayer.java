package Exams.E18and19July2020;

import java.util.Scanner;

public class P05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int maxGoals = Integer.MIN_VALUE;
        boolean hatTrick = false;
        String bestPlayer = "";
        int goalsWithoutHatTrick = 0;

        while(!command.equals("END")){
            int goals = Integer.parseInt(scanner.nextLine());
            if(goals>maxGoals){
                bestPlayer = command;
                maxGoals = goals;
            }
            if(goals>=3){
                hatTrick = true;
            }else {
                goalsWithoutHatTrick = goals;
            }
            if(goals>=10){
                break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("%s is the best player!\n", bestPlayer);
        if(hatTrick){
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        }else {
            System.out.printf("He has scored %d goals.", goalsWithoutHatTrick);
        }
    }
}
