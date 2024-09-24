public class Circle {
    }
    // Main method to test the Circle class
    public static void main (String[] args) {
        Circle circle = new Circle(radius 5.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());

        // Modify the radius & display the updated values
        circle.setRadius(7.0);
        System.out.println("\nUpdated Radius" + circle.getRadius());
        System.out.println("\nUpdated Radius" + circle.getRadius());
        System.out.println("\nUpdated Radius" + circle.getRadius());

    }
