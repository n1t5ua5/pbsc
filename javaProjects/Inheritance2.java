interface Edible {
    void eat();
} // Created interface with method declaration

class Plants {
    String name;
    Plants(String name) {
        this.name = name;
    } // Created parent class with constructor method containing single attribute

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
        System.out.println(name + " is a type of flower; but it's actually edible!");
    } // Overriding displayInfo method to output specific flower type
}

class Tree extends Plants implements Edible {
    Tree(String name) {
        super(name);
    } // Created second child class which inherits from parent class & calls constructor

    @Override
    void displayInfo() {
        System.out.println(name + " is a fruit that grows on trees.");
    } // Overriding displayInfo method to output specific tree type

    @Override
    public void eat() {
        System.out.println("You can eat the fruit from an " + name + " tree, it's delicious!");
    }  // Overriding consume method from Edible interface
}

public class Inheritance2 {
    public static void main(String[] args) {
        Plants myFlower = new Flower("Lavendar");
        Tree myTree = new Tree("apple");
        // Created main class & instances of flowers of trees

        myFlower.displayInfo();
        myTree.displayInfo();
        myTree.eat();
        // The overriding flower, tree & edible types are called & then displayed
    }
}
