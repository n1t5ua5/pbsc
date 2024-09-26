import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User inputs minutes
        System.out.print("Please input number of minutes: ");
        int minutes = scanner.nextInt();

        // Conversion of minutes by days & hours
        int hours = minutes / 60;
        double days = minutes / (60.0 * 24);

        // Print statements to test input
        System.out.println(minutes + " minutes is actually " + hours + " hours.");
        System.out.println("& " + minutes + " minutes is actually " + days + " days!");

        scanner.close();
    }
}
