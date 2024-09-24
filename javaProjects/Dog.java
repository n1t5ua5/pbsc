// Dog class with name & breed attributes
public class Dog {

    String name;
    String breed;

    // Constructor to initialize dog name & breed
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        }

        // Getter method to get dog's name
        public String getName() {
            return name;
        }

        // Setter method to modify dog's name
        public void setName(String name) {
            this.name = name;
        }

        // Getter method to get dog's breed
        public String getBreed() {
            return breed;
        }

        // Setter method to modify dog's breed
        public void setBreed(String breed) {
            this.breed = breed;
        }

        // Method to display details
        public void displayDogInfo() {
            System.out.println("Name: " + name + ", Breed: " + breed);
        }


    // Main method to create Dog instance, modify attributes & print updated values
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", "Lab Mix");
        Dog dog2 = new Dog("Sage", "Husky");

        // Display initial values
        System.out.println("Initial Dog Information:");
        dog1.displayDogInfo();
        dog2.displayDogInfo();

        // Modify the attributes using the setter methods
        dog1.setName("Savi");
        dog1.setBreed("Whippet");

        dog2.setName("Sadie");
        dog2.setBreed("Malamute");

        // Display updated values
        System.out.println("\nUpdated Dog Information:");
        dog1.displayDogInfo();
        dog2.displayDogInfo();
    }
}
