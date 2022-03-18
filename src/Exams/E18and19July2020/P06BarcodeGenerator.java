package Exams.E18and19July2020;

import java.util.Scanner;

public class P06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        //vzima purvata cifra na firstNum za validaciq
        int firstValid = firstNum / 1000;
        //vzima vtorata cifra na firstNum za validaciq
        int secondValid = firstNum / 100;
        secondValid = secondValid % 10;
        //vzima tretata cifra na firstNum za validaciq
        int thirdValid = firstNum / 10;
        thirdValid = thirdValid % 10;
        //vzima poslednata cifra na firstNum za validaciq
        int forthValid = firstNum % 10;

        //vzima purvata cifra na secondNum
        int first2 = secondNum / 1000;
        //vzima vtorata cifra na secondNum
        int second2 = secondNum / 100;
        second2 = second2 % 10;
        //vzima tretata cifra na secondNum
        int third2 = secondNum / 10;
        third2 = third2 % 10;
        //vzima poslednata cifra na secondNum
        int forth2 = secondNum % 10;

        for (int i = firstNum; i <= secondNum; i++) {
            //vzima purvata cifra na firstNum
            int first1 = i / 1000;
            //vzima vtorata cifra na firstNum
            int second1 = i / 100;
            second1 = second1 % 10;
            //vzima tretata cifra na firstNum
            int third1 = i / 10;
            third1 = third1 % 10;
            //vzima poslednata cifra na firstNum
            int forth1 = i % 10;

            if (first1 % 2 != 0 && second1 % 2 != 0 && third1 % 2 != 0 && forth1 % 2 != 0) {
                if (first1 <= first2 && second1 <= second2 && third1 <= third2 && forth1 <= forth2) {
                    if(first1>=firstValid &&second1>=secondValid && third1>=thirdValid && forth1>=forthValid){
                        System.out.printf("%d%d%d%d ", first1, second1, third1, forth1);
                    }
                }
            }
        }
    }
}
