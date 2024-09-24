// Person class with name & age attributes
class Person {
    private String name;
    private int age;

    // Constructor to initialize attributes
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method to get person's name
    public String getName() {
        return name;
    }

    // Getter method to get person's age
    public int getAge() {
        return age;
    }

    // Method to display person's details
    public void displayPersonInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method to create two instances of Person & display attributes
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Display name & age of each person
        person1.displayPersonInfo();
        person2.displayPersonInfo();
    }
}
