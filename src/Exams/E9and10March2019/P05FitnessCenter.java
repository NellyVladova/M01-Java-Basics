package Exams.E9and10March2019;

import java.util.Scanner;

public class P05FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int customerNumber = Integer.parseInt(scanner.nextLine());
        int backCount = 0;
        int chestCount = 0;
        int legsCount = 0;
        int absCount = 0;
        int proteinShakeCount = 0;
        int proteinBarCount = 0;
        int other = 0;
        int trainingCustomersCount = 0;

        for (int i = 1; i <= customerNumber; i++) {
            String activity = scanner.nextLine();
            switch (activity){
                case "Back":
                    backCount++;
                    trainingCustomersCount++;
                    break;
                case "Chest":
                    chestCount++;
                    trainingCustomersCount++;
                    break;
                case "Legs":
                    legsCount++;
                    trainingCustomersCount++;
                    break;
                case "Abs":
                    absCount++;
                    trainingCustomersCount++;
                    break;
                case "Protein shake":
                    proteinShakeCount++;
                    other++;
                    break;
                case "Protein bar":
                    proteinBarCount++;
                    other++;
                    break;
            }
        }
        System.out.printf("%d - back\n", backCount);
        System.out.printf("%d - chest\n", chestCount);
        System.out.printf("%d - legs\n", legsCount);
        System.out.printf("%d - abs\n", absCount);
        System.out.printf("%d - protein shake\n", proteinShakeCount);
        System.out.printf("%d - protein bar\n", proteinBarCount);
        System.out.printf("%.2f%% - work out\n", trainingCustomersCount*1.0/customerNumber*100);
        System.out.printf("%.2f%% - protein\n", other*1.0/customerNumber*100);
    }
}
