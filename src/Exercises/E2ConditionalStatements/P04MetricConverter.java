package Exercises.E2ConditionalStatements;

import java.util.Scanner;

public class P04MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num = Double.parseDouble(scan.nextLine());
        String text1 = scan.nextLine();
        String text2 = scan.nextLine();

        if(text1.equals("mm") && text2.equals("cm")){
            num/=10;
        } else if(text1.equals("mm") && text2.equals("m")){
            num/=1000;
        } else if(text1.equals("cm") && text2.equals("mm")){
            num*=10;
        } else if(text1.equals("cm") && text2.equals("m")){
            num/=100;
        } else if(text1.equals("m") && text2.equals("mm")){
            num*=1000;
        }else if(text1.equals("m") && text2.equals("cm")){
            num*=100;
        }
        System.out.printf("%.3f", num);
    }
}
