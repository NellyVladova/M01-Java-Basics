package Exams.PrecursoryExam;

import java.util.Scanner;

public class P04Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsNumber = Integer.parseInt(scanner.nextLine());
        double gradeBetween2and3 = 0;
        double gradeBetween3and4 = 0;
        double gradeBetween4and5 = 0;
        double gradeOver5 = 0;
        double averageGrade = 0;

        for (int i = 1; i <= studentsNumber; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            averageGrade+=grade;
            if(grade>=2.00 && grade<=2.99){
                gradeBetween2and3++;
            }else if(grade>=3 && grade<=3.99){
                gradeBetween3and4++;
            }else if(grade>=4 && grade<=4.99){
                gradeBetween4and5++;
            }else if(grade>=5 && grade<=6.00){
                gradeOver5++;
            }
        }
        System.out.printf("Top students: %.2f%%\n", gradeOver5/studentsNumber*100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", gradeBetween4and5/studentsNumber*100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", gradeBetween3and4/studentsNumber*100);
        System.out.printf("Fail: %.2f%%\n", gradeBetween2and3/studentsNumber*100);
        System.out.printf("Average: %.2f\n", averageGrade/studentsNumber);
    }
}
