package Exams.E20and21April2019;

import java.util.Scanner;

public class P04EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggNumberPlayer1 = Integer.parseInt(scanner.nextLine());
        int eggNumberPlayer2 = Integer.parseInt(scanner.nextLine());
        String winner = scanner.nextLine();
        boolean noMoreEggsPlayer1 = false;
        boolean noMoreEggsPlayer2 = false;

        while (!winner.equals("End of battle")){
            if(winner.equals("one")){
                eggNumberPlayer2--;
            } else if (winner.equals("two")) {
                eggNumberPlayer1--;
            }
            if(eggNumberPlayer1==0){
                noMoreEggsPlayer1 = true;
                break;
            }else if(eggNumberPlayer2==0){
                noMoreEggsPlayer2 = true;
                break;
            }
            winner = scanner.nextLine();
        }
        if (noMoreEggsPlayer1) {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggNumberPlayer2);
        } else if (noMoreEggsPlayer2) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggNumberPlayer1);
        }else {
            System.out.printf("Player one has %d eggs left.\n", eggNumberPlayer1);
            System.out.printf("Player two has %d eggs left.\n", eggNumberPlayer2);
        }
    }
}
