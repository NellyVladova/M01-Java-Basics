package MoreExercises.ME4ForLoop;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());        //studentsNumber
        int markABCount = 0;
        int markCCount = 0;
        int markDCount = 0;
        int markFCount = 0;
        double topStudents = 0;
        double goodStudents = 0;
        double studentsWith3 = 0;
        double poorStudents = 0;
        double average = 0;

        for (int i = 0; i < n; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            average+=grade;
            if(grade>=5.00){
                markABCount++;
            }else if(grade>=4.00){
                markCCount++;
            }else if(grade>=3.00){
                markDCount++;
            }else {
                markFCount++;
            }
        }
        topStudents=markABCount*1.00/n*100;
        goodStudents = markCCount*1.00/n*100;
        studentsWith3 = markDCount*1.00/n*100;
        poorStudents = markFCount*1.00/n*100;

        System.out.printf("Top students: %.2f%%\n", topStudents);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", goodStudents);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", studentsWith3);
        System.out.printf("Fail: %.2f%%\n", poorStudents);
        System.out.printf("Average: %.2f", average/n);
    }
}
