package Exercises.E5WhileLoop;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int cakePieces = width * length;
        boolean thereIsNoCake = false;

        while (!input.equals("STOP")) {
            int guests = Integer.parseInt(input);
            cakePieces-=guests;

            if(cakePieces<=0){
                thereIsNoCake = true;
                break;
            }

            input = scanner.nextLine();
        }
        if(thereIsNoCake){
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePieces));
        }else {
            System.out.printf("%d pieces are left.", cakePieces);
        }
    }
}
