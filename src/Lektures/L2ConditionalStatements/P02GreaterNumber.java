package Lektures.L2ConditionalStatements;

import java.util.Scanner;

public class P02GreaterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        if (a<b){
            System.out.println(b);
        }else {
            System.out.println(a);
        }
    }
}
