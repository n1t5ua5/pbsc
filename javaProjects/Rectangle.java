// Defined rectangle class with width & height attributes
class Rectangle {
    private double width;
    private double height;

    // Constructor to initialize attributes
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area of the rectangle
    public double calculateArea() {
        return width * height;
    }

    // Method to calculate the perimeter of rectangle
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Method to display rectangle's details
    public void displayRectangleInfo() {
        System.out.println("Width: " + width + ", Height: " + height);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

    // Main method to create a Rectangle object & display attributes
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5.0, 3.0);
        rectangle1.displayRectangleInfo();
    }
}
