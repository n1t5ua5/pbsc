// Scanner imported for user input
import java.util.Scanner;

// Class & main method created, variables instantiated in main
public class DistanceFromAverage {
    public static void main(String[] args) {
        final int MAX_ENTRIES = 15;
        double []numbers = new double[MAX_ENTRIES];
        int count = 0;
        double sum = 0.0;

        // new Scanner object is created
        Scanner input = new Scanner(System.in);
        System.out.print("Enter up to 15 double values OR type 99999 to exit program: ");

        // Loop formed to allow user to enter numbers
        while (count < MAX_ENTRIES) {
            System.out.print("Enter number " + (count + 1 ) + " : ");
            double userInput = input.nextDouble();

            // Check if user wants to quit by entering 99999
            if (userInput == 99999) {
                break;
            }

            // Store number & increment count
            numbers[count] = userInput;
            sum += userInput;
            count++;
        }

        // Check if the user entered any numbers
        if (count == 0) {
            System.out.println("Error: No numbers entered.");
        } else {
            double average = sum / count;

            // Display count & average
            System.out.println("You entered " + count + " numbers.");
            System.out.println("The average is: " + average);

            // Display each number & its distance from average
            for (int i = 0; i < count; i++) {
                double distance = Math.abs(numbers[i] - average);
                System.out.println("Number " + (i + 1) + ": " + numbers[i] + " is " + distance + " away from the average.");
            }
        }
    }
}
