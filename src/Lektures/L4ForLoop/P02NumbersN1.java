package Lektures.L4ForLoop;

import java.util.Scanner;

public class P02NumbersN1 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        int n = Integer.parseInt(sca.nextLine());
        for (int i = n; i>0; i--){
            System.out.println(i);
        }
    }
}
