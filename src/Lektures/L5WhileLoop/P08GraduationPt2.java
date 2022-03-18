package Lektures.L5WhileLoop;

import java.util.Scanner;

public class P08GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int count = 1;
        double averageMark = 0;
        int poorMark = 0;

        while (count <= 12) {
            if (poorMark > 1) {
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4) {
                poorMark++;
                continue;
            }
            averageMark += grade;
            count++;
        }
        if (poorMark < 1) {
            System.out.printf("%s graduated. Average grade: %.2f", name, averageMark / 12);
        }else {
            System.out.printf("%s has been excluded at %d grade", name, count);
        }
    }
}
