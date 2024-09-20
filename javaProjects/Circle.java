public class Circle {
    }
    // Main method to test the Circle class
    public static void main (String[] args) {
        Circle circle = new Circle(radius 5.0);
        System.out.printIn("Radius: " + circle.getRadius());
        System.out.printIn("Area: " + circle.calculateArea());
        System.out.printIn("Circumference: " + circle.calculateCircumference());

        // Modify the radius & display the updated values
        circle.setRadius(7.0);
        System.out.printIn("\nUpdated Radius" + circle.getRadius());
        System.out.printIn("\nUpdated Radius" + circle.getRadius());
        System.out.printIn("\nUpdated Radius" + circle.getRadius());

    }

}
