import java.util.Scanner;

public class Percentages {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt user to enter the double values
        System.out.println("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        // Call the computePercent() method to compute & display percent
        computePercent(num1, num2);
        // Call the method again with values in reverse order
        computePercent(num2, num1);

        // Close scanner
        input.close();
    }

    // Method to compute & display percentage
    public static void computePercent (double a, double b) {
        double percentage = (a / b) * 100;
        System.out.printf ("%.2f is %.2f%% of %.2f%n", a, percentage, b);

    }

}
