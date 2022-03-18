package Lektures.L1FirstSteps;

import java.util.Scanner;

public class P07ArchitectProjects {
        public static void main(String[] args) {
            //System.out.println("Input name and how many projects you have:");
            Scanner scan = new Scanner(System.in);
            String name = scan.nextLine();
            int projects = Integer.parseInt(scan.nextLine());
            int hoursPerProject = 3;
            System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, projects * hoursPerProject, projects);
    }

}
