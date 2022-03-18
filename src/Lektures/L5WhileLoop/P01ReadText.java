package Lektures.L5WhileLoop;

import java.util.Scanner;

public class P01ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (true){
            if(input.equals("Stop")){
                break;
            }
            System.out.println(input);
            input = scanner.nextLine();
        }
    }
}
