package Exercises.E2ConditionalStatements;

import java.util.Scanner;

public class P05TimeAnd15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        minutes+=15;

        if(minutes>59){
            if(hours==23){
                hours = 0;
            }else if(hours>=0 && hours<23){
                hours+=1;
            }
            minutes-=60;
        }
        if(minutes<10){
            System.out.printf("%d:0%d", hours, minutes);
        }else {
            System.out.printf("%d:%d", hours, minutes);
        }

    }
}
