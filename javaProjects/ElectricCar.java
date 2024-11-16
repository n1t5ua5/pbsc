public class ElectricCar extends Car implements Electric {

    private int batteryCapacity;
    // Private variable stores battery capacity of electric car

    public ElectricCar(String brand, int numberOfDoors, int batteryCapacity) {
        super(brand, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        // Constructor initializes electric car's brand, number of doors & battery capacity
    }

    @Override
    public void chargeBattery() {
        System.out.println("Charging the battery with capacity: " + batteryCapacity + "kWh.");
        // Implementated chargeBattery method from Electric interface

    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh.");
        // Override displayDetails method to include battery capacity information
    }
}
