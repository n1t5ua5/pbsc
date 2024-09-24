public class Circle {
    // Attribute
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Main method to test the Circle class
    public static void main (String[] args) {
        Circle circle = new Circle(5);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());

        // Modify the radius & display the updated values
        circle.setRadius(7.0);

        System.out.println("\nUpdated Radius" + circle.getRadius());
        System.out.println("\nUpdated Area" + circle.calculateArea());
        System.out.println("\nUpdated Circumference" + circle.calculateCircumference());

    }
}
