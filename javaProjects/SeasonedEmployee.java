// Import scanner & create Employee class with three variables

import java.util.Scanner;

public class SeasonedEmployee {

        String name;
        String hireDate;
        double salary;

        // Constructor method
        SeasonedEmployee(String name, String hireDate, double salary) {
            this.name = name;
            this.hireDate = hireDate;
            this.salary = salary;
        }


        int totalYears(int currentYear) {
            int hireYear = Integer.parseInt(hireDate);
            return currentYear - hireYear;
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

                // Input employee details
                System.out.print("Enter employee name: ");
                String name = scanner.nextLine();

                System.out.print("Enter hire year: (XXXX)");
                String hireDate = scanner.nextLine();

                System.out.print("Enter salary: ");
                double salary = scanner.nextDouble();

                // Create Employee object
                SeasonedEmployee SeasonedEmployee = new SeasonedEmployee(name, hireDate, salary);

                int totalTimeEmployed = SeasonedEmployee.totalYears(2024);

                // Display employee details
                System.out.println("New Employee Name: " + SeasonedEmployee.name);
                System.out.println("Hire Date: " + SeasonedEmployee.hireDate);
                System.out.println("Salary: " + SeasonedEmployee.salary);
                System.out.println("Total Years Employed: " + totalTimeEmployed);

                scanner.close();

        }

}
