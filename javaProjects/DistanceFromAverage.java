import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        final int MAX_ENTRIES = 15;
        double []numbers = new double[MAX_ENTRIES];
        int count = 0;
        double sum = 0.0;

        double average = 0.0;
        boolean numbersEntered = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter up to 15 double values( enter 99999 to stop) : ");
        // Loop to allow the user to enter numbers

        while (count < MAX_ENTRIES) {
            System.out.print("Enter number " + (count + 1 ) + " : ");
            double userInput = input.nextDouble();

            // Check if the user wants to quit by entering 99999
            if (userInput == 99999) {
                break;
            }
            // Store the number * increment the count
            numbers [count] = userInput;
            count++;
            numbersEntered = true;
        }
        // Check if the user entered any numbers
        if (!numbersEntered) {
            System.out.println();
        }
    }
}
