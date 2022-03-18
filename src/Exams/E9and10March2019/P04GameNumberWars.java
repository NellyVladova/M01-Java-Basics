package Exams.E9and10March2019;

import java.util.Scanner;

public class P04GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player1 = scanner.nextLine();
        String player2 = scanner.nextLine();
        String name1 = player1;
        String name2 = player2;
        int player1Points = 0;
        int player2Points = 0;
        boolean player1Win = false;
        boolean player2Win = false;

        while (true){
            player1= scanner.nextLine();
            if(player1.equals("End of game")){
                break;
            }
            player2 = scanner.nextLine();
            int card1 = Integer.parseInt(player1);
            int card2 = Integer.parseInt(player2);
            if(card1>card2){
               player1Points +=(card1-card2);
            }else if(card1<card2){
                player2Points+=(card2-card1);
            }else {
                player1= scanner.nextLine();
                player2 = scanner.nextLine();
                int card12 = Integer.parseInt(player1);
                int card22 = Integer.parseInt(player2);
                if(card12>card22){
                    player1Win = true;
                } else if (card22 > card12) {
                    player2Win = true;
                }
                break;
            }
        }
        if(player1Win){
            System.out.println("Number wars!");
            System.out.printf("%s is winner with %d points", name1, player1Points);
        }else if(player2Win){
            System.out.println("Number wars!");
            System.out.printf("%s is winner with %d points", name2, player2Points);
        }else {
            System.out.printf("%s has %d points\n", name1, player1Points);
            System.out.printf("%s has %d points", name2, player2Points);
        }
    }
}
