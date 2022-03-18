package Exams.E6and7July2019;

import java.util.Scanner;

public class P05PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int hearthstoneCount = 0;
        int forniteCount = 0;
        int overwatchCount = 0;
        int othersCount = 0;

        for (int i = 1; i <= n; i++) {
            String gameName = scanner.nextLine();
            switch (gameName){
                case "Hearthstone":
                    hearthstoneCount++;
                    break;
                case "Fornite":
                    forniteCount++;
                    break;
                case "Overwatch":
                    overwatchCount++;
                    break;
                default:
                    othersCount++;
                    break;
            }
        }
        System.out.printf("Hearthstone - %.2f%%\n", hearthstoneCount*1.00/n*100);
        System.out.printf("Fornite - %.2f%%\n", forniteCount*1.00/n*100);
        System.out.printf("Overwatch - %.2f%%\n", overwatchCount*1.00/n*100);
        System.out.printf("Others - %.2f%%\n", othersCount*1.00/n*100);
    }
}
