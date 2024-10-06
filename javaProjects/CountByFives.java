// import scanner for user input
import java.util.Scanner;

// create CountByFives class & declare initial values of 5 & 500
public class CountByFives {
    public static final int START = 5;
    public static final int STOP = 500;

    // main method begins by asking user for input
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input value to count: ");

        // checks if input is valid integer
        if (input.hasNextInt()) {
            int countBy = input.nextInt();

            // loop through numbers 5 - 500 & increments by user input value
            for (int i = START, count = 1; i <= STOP; i += countBy, count++) {
                System.out.print(i + " ");
                // start new line after every 10 values printed
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        // if invalid integer input, error msg displayed
        } else {
            System.out.println("Please enter valid integer.");
        }
    }
}
