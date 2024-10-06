// important Scanner method
import java.util.Scanner;

// create AscendingDescending class
public class AscendingDescending {

    // use scanner method with input object for user input
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Input first number: ");
    int num1 = input.nextInt();

    System.out.println("Input second number: ");
    int num2 = input.nextInt();

    System.out.println("Input third number: ");
    int num3 = input.nextInt();

    int max, mid, min;

    // use if statements to find max, mid & min number
    if (num1 >= num2 && num1 >= num3) {
        max = num1;
        if (num2 >= num3) {
            mid = num2;
            min = num3;
        } else {
            mid = num3;
            min = num2;
        }
    } else if (num2 >= num1 && num2 >= num3) {
        max = num2;
        if (num1 >= num3) {
            mid = num1;
            min = num3;
        } else {
            mid = num3;
            min = num1;
        }
    } else {
        max = num3;
        if (num1 >= num2) {
            mid = num1;
            min = num2;
        } else {
            mid = num2;
            min = num1;
        }
    }

    // Display the numbers in ascending and descending order
    System.out.println("Ascending order: " + min + " " + mid + " " + max);
    System.out.println("Descending order: " + max + " " + mid + " " + min);

    }
}
