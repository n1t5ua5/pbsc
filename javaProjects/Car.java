public class ElectricCar extends Car implements Electric {

    private int numberOfDoors;

    // Initializes number of doors

    public Car(String brand, int numberOfDoors) {

        super(brand); // Calls the constructor of Vehicle

        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {

        displayBrand(); // Calls the method from Vehicle

        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
