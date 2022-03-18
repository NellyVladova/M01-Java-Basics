package MoreExercises.ME4ForLoop;

import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());
        int treatedPatients = 0;
        int untreatedPatients = 0;
        int doctors = 7;

        for (int i = 1; i <= period; i++) {
            if(i%3==0 && untreatedPatients>treatedPatients){
                doctors++;
            }
            int patientPerDay = Integer.parseInt(scanner.nextLine());
            if(patientPerDay<=doctors){
                treatedPatients+=patientPerDay;

            }else if(patientPerDay>doctors){
                treatedPatients+=doctors;
                untreatedPatients += patientPerDay-doctors;
            }

        }

        System.out.printf("Treated patients: %d.\n", treatedPatients);
        System.out.printf("Untreated patients: %d.\n", untreatedPatients);
    }
}
