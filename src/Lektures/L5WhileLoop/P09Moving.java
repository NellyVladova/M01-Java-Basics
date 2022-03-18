package Lektures.L5WhileLoop;

import java.util.Scanner;

public class P09Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int volume = width * length * height;
        int boxVolume = 0;
        boolean isFull = false;

        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);
            boxVolume += boxes;
            if (boxVolume > volume) {
                isFull = true;
                break;
            }
            input = scanner.nextLine();
        }
        int diff = Math.abs(volume - boxVolume);
        if (isFull) {
            System.out.printf("No more free space! You need %d Cubic meters more.", diff);
        } else {
            System.out.printf("%d Cubic meters left.", diff);
        }
    }
}
