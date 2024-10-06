// import scanner object for user input
import java.util.Scanner;

// create Even class
public class Even {

    // create main method which first declares user input & number value
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Enter even number or 999 to quit: ");
        number = input.nextInt();

        if (number == 999) {
            System.out.println("Goodbye.");
        } else {
            if (number % 2 == 0) {
                System.out.println("Good job!");
            } else {
                System.out.println("Error: input even number.");
            }
        }

        input.close();

    }

}
