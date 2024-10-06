// Car class representing a car in the system

class Car{
    // Private attributes (encapsulation)
    private String brand; // 2 usages
    private String model; // 1 use
    private int year; // 1 use
    private int speed; // 1 use

    // Constructor to initialize a car's attributes
    public Car (String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0;

    }
    // Method to start the car
    public void start () {
        System.out.println(brand + "" + model + "is starting.");
    }
    // Method to stop the car
    public void stop () {
        speed = 0;
        System.out.println(brand + "" + model + "has stopping.");
    }
    // Method to accelerate the car's speed
    public void accelerate (int increment) {
        if (speed == 0){
            System.out.println(brand + "" + model + "is not moving yet. Start the first!");
        }else{
            speed += increment;
            System.out.println(brand + "" + model + "is running at " + speed + " km/h.");
        }
    }

    // Getter and setter methods for encapsulation
    // Get the brand of the car

    public String getBrand() {
        return brand;
    }
    // Set the brand of the car
    public void setBrand(String brand) {
        this.brand = brand;
    }
    // Get the model of the Car
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    // Get the year of the Car
    public String getYear() {
        return model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

}

public class CarDemo {
    public static void main(String[] args) {
        // Create two car objects using the constructor
        Car car1 = new Car("Honda ", "Accord", 2022);
        Car car2 = new Car("Toyota ", "Camry", 2019);

        // Start both cars
        car1.start();
        car2.start();
        // Acceleration both cars
        car1.accelerate(50);
        car2.accelerate(60);

        // Stop both cars
        car1.stop();
        car2.stop();
        // Display the ar details using getter methods
        System.out.println(car1.getBrand() + " " + car1.getModel()
            + " (" + car1.getYear() + ") is now at speed: " + car1.getSpeed()+ " km/h.");
        System.out.println(car2.getBrand() + " " + car2.getModel()
            + " (" + car1.getYear() + ") is now at speed: " + car1.getSpeed()+ " km/h.");

    }
}
