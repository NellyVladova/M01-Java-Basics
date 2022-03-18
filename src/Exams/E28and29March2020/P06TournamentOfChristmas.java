package Exams.E28and29March2020;

import java.util.Scanner;

public class P06TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentDays = Integer.parseInt(scanner.nextLine());
        int winDays = 0;
        int loseDays = 0;
        double finalMoney = 0;

        for (int i = 1; i <=tournamentDays ; i++) {
            String sport = scanner.nextLine();
            double moneyPerDay = 0;
            int winCount = 0;
            int loseCount = 0;

            while (!sport.equals("Finish")){
                String result = scanner.nextLine();
                double moneyPerGame = 0;

                if(result.equals("win")){
                    winCount++;
                    moneyPerGame+=20;
                }else if(result.equals("lose")){
                    loseCount++;
                }
                moneyPerDay+=moneyPerGame;
                sport = scanner.nextLine();
            }
            if(winCount>loseCount){
                //you won the day
                winDays++;
                moneyPerDay*=1.10;
            }else {
                loseDays++;
            }
            finalMoney+=moneyPerDay;
        }
        if(winDays>loseDays){
            //you won the tournament
            finalMoney*=1.20;
            System.out.printf("You won the tournament! Total raised money: %.2f", finalMoney);
        }else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", finalMoney);
        }

    }
}
