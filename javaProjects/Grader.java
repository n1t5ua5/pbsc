import java.util.Scanner;
// scanner is imported for user input

public class Grader {
    // Grader class is defined

    public static void main (String[] args) {
        // main method is created to execute program

        Scanner scanner = new Scanner(System.in);
        // Created Scanner object to read input from user
        float[][] studentGrades = new float[6][4];
        // for example, there are 6 students taking 4 different subjects

        // calculate & display each student's average
        for (int i = 0; i < studentGrades.length; i++) {
            System.out.println("Enter grades for student " + (i + 1) + ":");
            // Looping through each subject for the current student
            for (int j = 0; j < studentGrades[i].length; j++) {
                System.out.println("Subject " + (j + 1) + ": ");
                while (!scanner.hasNextFloat()) { // Basic check for valid float input
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); // Clear the invalid input
                }
                studentGrades[i][j] = scanner.nextFloat();
            }
        }

        System.out.println("\nAll grades entered. Calculating stats...\n");
        // message updates user when input complete

        System.out.println("Highest & Lowest Grades per Subject:");
         // Calculate high & loww grades for every students subjeccts
        for (int j = 0; j < studentGrades[0].length; j++) {
            // Loop through each subject
            float highest = studentGrades[0][j];
            // Initialize highest grade
            float lowest = studentGrades[0][j];
            // Initialize lowest grade
            for (int i = 1; i < studentGrades.length; i++) {
                // loop through each students grades for current subject
                if (studentGrades[i][j] > highest) highest = studentGrades[i][j];
                if (studentGrades[i][j] < lowest) lowest = studentGrades[i][j];
            }
            System.out.println("Subject: " + (j + 1) + " - Highest: " + highest + ", Lowest: " + lowest);
        }

        System.out.println("\nFinished calculating, exiting program; goodbye!");
        // program completion message displayed
        scanner.close();
        // scanner object is closed to prevent data leakage
    }
}
