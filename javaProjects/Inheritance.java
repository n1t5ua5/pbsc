class Plants {
    String name;
    // Created parent class named Plants with single attribute

    Plants(String name) {
        this.name = name;
    } // Constructor method initializes the plant name

    void displayInfo() {
        System.out.println("This plant is called " + name);
    } // Method displays info about the plant
}

class Flower extends Plants {
    Flower(String name) {
        super(name);
    } // Created first child class which inherits from parent class & calls constructor

    @Override
    void displayInfo() {
        System.out.println(name + " is a type of flower; those flowers are beautiful!");
    } // Overriding displayInfo method to output specific flower type
}

class Tree extends Plants {
    Tree(String name) {
        super(name);
    } // Created second child class which inherits from parent class & calls constructor

    @Override
    void displayInfo() {
        System.out.println(name + " is a type of tree; those trees look lush!");
    } // Overriding displayInfo method to output specific tree type
}

public class Inheritance {
    public static void main(String[] args) {
        Plants myFlower = new Flower("Magnolia");
        Plants myTree = new Tree("Pine");
        // Created main class & instances of flowers of trees
        myFlower.displayInfo();
        myTree.displayInfo();
        // The overriding flower & tree types are called & then displayed
    }
}
