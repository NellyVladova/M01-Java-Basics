package Exams.E15and16June2019;

import java.util.Scanner;

public class P04Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        boolean noMoreSeats = false;
        double cinemaIncome = 0;

        while (!command.equals("Movie time!")) {
            int peopleNumber = Integer.parseInt(command);
            double currentBill = 0;
            hallCapacity -= peopleNumber;
            if (peopleNumber % 3 == 0) {
                currentBill += peopleNumber * 5 - 5;
            } else {
                currentBill += peopleNumber * 5;
            }
            if (hallCapacity < 0) {
                noMoreSeats = true;
                break;
            }
            cinemaIncome+=currentBill;
            command = scanner.nextLine();
        }
        if (noMoreSeats) {
            System.out.println("The cinema is full.");
        }else {
            System.out.printf("There are %d seats left in the cinema.\n", hallCapacity);
        }
        System.out.printf("Cinema income - %.0f lv.", cinemaIncome);
    }
}
