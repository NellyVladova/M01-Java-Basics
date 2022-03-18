package Exams.E20and21April2019;

import java.util.Scanner;

public class P05EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coloredEggs = Integer.parseInt(scanner.nextLine());
        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;
        int maxEggs = Integer.MIN_VALUE;
        String maxEggsColor = "";

        for (int i = 1; i <= coloredEggs; i++) {
            String eggColor = scanner.nextLine();
            switch (eggColor) {
                case "red":
                    red++;
                    break;
                case "orange":
                    orange++;
                    break;
                case "blue":
                    blue++;
                    break;
                case "green":
                    green++;
                    break;
            }
        }
        if(red>maxEggs){
            maxEggs = red;
            maxEggsColor = "red";
        }
        if(orange>maxEggs){
            maxEggs = orange;
            maxEggsColor = "orange";
        }
        if(blue>maxEggs){
            maxEggs = blue;
            maxEggsColor = "blue";
        }
        if(green>maxEggs){
            maxEggs = green;
            maxEggsColor = "green";
        }
        System.out.printf("Red eggs: %d\n", red);
        System.out.printf("Orange eggs: %d\n", orange);
        System.out.printf("Blue eggs: %d\n", blue);
        System.out.printf("Green eggs: %d\n", green);
        System.out.printf("Max eggs: %d -> %s", maxEggs, maxEggsColor);
    }
}
