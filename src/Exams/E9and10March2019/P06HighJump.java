package Exams.E9and10March2019;

import java.util.Scanner;

public class P06HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            //??? 50/100
        int height = Integer.parseInt(scanner.nextLine());
        int startHeight = height-30;
        int jumpCount = 0;
        boolean fail = false;
        boolean stop = false;
        boolean succeed = false;
        int failedHeight = 0;

        while(true){
            int currentHeight = Integer.parseInt(scanner.nextLine());
            int failedJumps = 0;
            for (int i = 1; i <=3 ; i++) {
                if(currentHeight>startHeight){
                    startHeight+=5;
                    jumpCount++;
                    break;
                }else {
                    jumpCount++;
                    failedJumps++;
                    if(failedJumps==3){
                        fail = true;
                        failedHeight = currentHeight;
                        break;
                    }
                }
                currentHeight = Integer.parseInt(scanner.nextLine());
            }
            if(fail){
                stop = true;
                break;
            }
            if(currentHeight>height){
                succeed = true;
                break;
            }
        }
        if(stop){
            System.out.printf("Tihomir failed at %dcm after %d jumps.", failedHeight, jumpCount);
        }
        if (succeed) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", height, jumpCount);
        }
    }
}
