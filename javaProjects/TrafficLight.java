// Import Scanner for user input
import java.util.Scanner;

// Defined TrafficLight class with two attributes
public class TrafficLight {
    String color;
    int duration;

    // Method to change the color set right duration
    void changeColor(String newColor) {
        color = newColor;
        if (color.equals("red")) {
            duration = 60;
        } else if (color.equals("green")) {
            duration = 180;
        } else {
            duration = 0;
        }
    }

    // Method to check if light is red
    boolean isRed() {
        return color.equals("red");
    }

    // Method to check if light is green
    boolean isGreen() {
        return color.equals("green");
    }

    // Main method to test TrafficLight class with user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrafficLight light = new TrafficLight();

        // Asks user for color input
        System.out.println("Please enter traffic light color (red or green): ");
        String userColor = scanner.nextLine();

        // Change color based on user input
        light.changeColor(userColor);

        // Output color & duration
        System.out.println("The light is " + light.color + " & lasts " + light.duration + " seconds.");

        // Check if light is red or green
        if (light.isRed()) {
            System.out.println("The light is red.");
        } else if (light.isGreen()) {
            System.out.println("The light is green.");
        } else {
            System.out.println("The light is neither red nor green.");
        }

        scanner.close();
    }
}
