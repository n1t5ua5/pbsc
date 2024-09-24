// Import scanner & create Employee class with three variables

import java.util.Scanner;

public class Employee {

        String name;
        String jobTitle;
        double salary;

        // Constructor method
        Employee(String name, String jobTitle, double salary) {
            this.name = name;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

                // Input employee details
                System.out.print("Enter employee name: ");
                String name = scanner.nextLine();

                System.out.print("Enter job title: ");
                String jobTitle = scanner.nextLine();

                System.out.print("Enter salary: ");
                double salary = scanner.nextDouble();

                // Create Employee object
                Employee employee = new Employee(name, jobTitle, salary);

                // Display employee details
                System.out.println("Employee Name: " + employee.name);
                System.out.println("Job Title: " + employee.jobTitle);
                System.out.println("Salary: " + employee.salary);

                scanner.close();

        }

}
