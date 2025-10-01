# JAVA JOURNAL, DECEMBER 2024


# Insurance Selecter
## [JInsurance.java](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/jinsurance.java)

**Problem:**
Write an application that allows the user to choose insurance options in JCheckBoxes. Use a ButtonGroup to allow the user to select only one of two insurance types—HMO (health maintenance organization) or PPO (preferred provider organization). Use regular (single) JCheckBoxes for dental insurance and vision insurance options; the user can select one option, both options, or neither option. As the user selects each option, display its name and price in a text field; the HMO costs $200 per month, the PPO costs $600 per month, the dental coverage adds $75 per month, and the vision care adds $20 per month. When a user deselects an item, make the text field blank. Save the file as JInsurance.java.

**Solution:**
After creating the JFrame application I created a button group of radio buttons so the user can choose between mutually exclusive insurance types: HMO or PPO. Users can also select optional dental & vision coverage using JCheckBox & JTextField to display the correct information. ActionListener logic exists on lines 29 - 57 to check which options are selected or not, the data is then updated & finally displays the selected options & total cost.


# Country Capital City App
## [JCapital.java](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/jcapital.java)

**Problem:**
Write an application that allows a user to select a country from a list box that contains at least seven options. After the user makes a selection, display the country’s capital city. Save the file as JCapitals.java.

**Solution:**
Firt I created a HashMap within the main method to store the different countries with their respective capitals. Then I made a JComboBox dropdown menu listing different countries with a JLabel to display the selected country's capital. When the user selects a country from the dropdown menu, an ActionListener located on lines 30 - 39 retrieves the corresponding capital from the HashMap & updates the JLabel to show the result.


# Paula's Portraits Application
## [JPhotoFrame.java](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/jphotoframe.java)

**Problem:**
Create an application for Paula’s Portraits, a photography studio. The application allows users to compute the price of a photography session. Paula’s base price is $40 for an in-studio photo session with one person. The in-studio fee is $75 for a session with two or more subjects, and $95 for a session with a pet. A $90 fee is added to take photos on location instead of in the studio. Include a set of mutually exclusive checkboxes to select the portrait subject and another set for the session location. Include labels as appropriate to explain the application’s functionality. Save the file as JPhotoFrame.java

**Solution:**
This application features a graphical user interface (GUI) with options for selecting the subject of the portrait: "One Person," "Two or More People," or "Pet" & then the session location, either "In-Studio" or "On-Location." Users make selections using mutually exclusive JRadioButtons grouped into two panels: one for subject & one for location. The ActionListener located on lines 61 - 84 calculates the total cost based on whatever combo the user selected & finally shows the calculated total at the bottom of the application. The components use JPanels with titled borders to clearly show which items are being selected to the user.


# Java Dorm App
## [JDorm.java](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/mod12/jdorm.java)
## [JDorm2.java](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/mod12/jdorm2.java)

**Problem(s):**
(JDorm.java) Search the Internet for information about how to use a JTextArea, its constructors, and its setText() and append() methods. Write an application that allows the user to select options for a dormitory room. Use JCheckBoxes for options such as private room, Internet connection, cable TV connection, microwave, refrigerator, and so on. When the application starts, use a text area to display a message listing the options that are not yet selected. As the user selects and deselects options, add appropriate messages to the text area so it accumulates a running list that reflects the user’s choices. Save the file as JDorm.java. (JDorm2.java) Modify the JDorm application so that instead of a running list of the user’s choices, the application displays only the current choices. Save the file as JDorm2.java.

**Solution(s):**
(JDorm.java) I first created the main JFrame application method, followed by JTextArea method which displays a default message listing all the available options. Users can select or deselect options like "Private Room," "Internet," or "Microwave" using the JCheckBox components created on lines 20 - 36. Each checkbox is linked to an ActionListener that updates the JTextArea to corresponding with user input. (JDorm2.java) The second JDorm project varies slightly; I created a JTextArea to show the selected options dynamically. Any previous selections are cleared when a new choice is made, ensuring that you can only see the current option.


# Inheritance & Interface
## [Inheritance.java](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/inheritance.java)
## [Inheritance2.java](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/inheritance2.java)

**Problem(s):**
(Inheritance.java) Create a parent class with at least one method and a few attributes. Implement at least two child classes that inherit from the parent class. Override at least one method in each child class to showcase polymorphism. Include comments throughout the code to explain the purpose and logic of each section.

(Inheritance2.java) Create an interface with at least one method declaration. Implement the interface in one of the child classes created in Program 1. Demonstrate how the interface method is implemented and used in the child class. Ensure the program shows how both inheritance and the interface can work together. Add detailed comments explaining how the interface interacts with the inheritance structure.

**Solution(s):**
(Inheritance.java) I created the parent class Plants first with a name attribute & a displayInfo() method to provide general plant information. The two child classes I created after, Flower & Tree, both inherit from Plants & then override the displayInfo() method to provide specific messages for their respective types. Lastly on lines 36 - 45 I wrote in a main class where I created instances of flowers & trees (in this case it was Lavandar & Apples) which are then called & displayed in the terminal. Overriding the methods demonstrates polymorphism, because the output depends on the object's type.

(Inheritance2.java) The second program I built uses the inheritance structure by first introducing an interface, Edible, which declares the eat() method. The two child classes I created after, Flower, Tree & Eat, all inherit from Plants & then override the displayInfo() method to provide specific messages for their respective types. The Tree class implements the interface, which adds functionality to describe edible parts of a tree like fruits or leaves; in this case apples. This approach shows how interfaces complement inheritance by adding behaviors without affecting hierarchy.


# JAVA JOURNAL, NOVEMBER 2024


# The Sublime Sandwich Shop
## [JSandwich.java](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/jsandwich.java)

**Problem:**
Design an application for the Sublime Sandwich Shop. The user makes sandwich order choices from list boxes, and the application displays the price. The user can choose from three main sandwich ingredients of your choice (for example, chicken) at three different prices. The user also can choose from three different bread types (for example, rye). Save the file as JSandwich.java.

**Solution:**
The Sublime Sandwich Shop now has a tool that helps you calculate the cost of a sandwich. It shows a window created on lines 5 – 10. The user may choose which main ingredient they like, along with the bread which was created using JLabel & JButton combo on lines 12 - 24. After the user makes their choices, an event listener waits for a button to be clicked which calculates the total & displays the total price (Lines 26 – 55). This only happens after the components are lastly added together which then ultimately display the price in the application window (Lines 57-70).


# JTV Show Synopsis Display
## [SmartTV](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/smarttv.java)
## [SmarterTV](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/smartertv.java)

**Problem(s):**
Write an application that allows a user to select one of at least five television shows to watch on demand. When the user selects a show, display a brief synopsis. Save the file as SmartTV.java. Change the JTVDownload application to include an editable combo box. Allow the user to type the name of a television show & display an appropriate error message if the desired show is not available. Save the file as SmarterTV.java.

**Solution(s):**
The SmartTV application allows users to select one of at least five television shows from a dropdown menu. When a show is selected, a brief synopsis of the show is displayed. The SmarterTV application builds upon the previous project by introducing an editable combo box so users can select either a show from the dropdown or type in a custom show's name. If the show that the user input isn’t on the list, an error message is displayed instead of the synopsis.


# Lambert's Vacation Rental Calculator
## [JVacationRental](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/jvacationrental.java)

**Problem:**
Write an application for Lambert’s Vacation Rentals. Use separate ButtonGroups to allow a client to select one of three locations, the number of bedrooms, & whether meals are included in the rental. Assume that the locations are parkside for $600 per week, poolside for $750 per week, or lakeside for $825 per week. Assume that the rentals have one, two, or three bedrooms & that each number of bedrooms greater than one adds $75 to the base price. Assume that if meals are added, the price is $200 more per rental. Save the file as JVacationRental.java.

**Solution:**
I used a Swing-based GUI application to calculate the cost of a vacation rental. First, I defined base prices for different locations, bedrooms, & optional meal services. The JFrame serves as the main window, containing radio buttons for selecting the rental location & number of bedrooms, along with a checkbox for including meals. A button may be clicked to calculate the total costs, which is displayed on a label.


# JBook Quote
## [JBook Quote](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/jbookquote)

**Problem(s):**
Write an application that displays a JFrame containing the opening sentence or two from your favorite book. Save the file as JBookQuote.java. Add a button to the frame in the JBookQuote program. When the user clicks the button, display the title of the book that contains the quote. Save the file as JBookQuote2.java.

**Solution(s):**
This new program creates a JFrame with a title, size & layout. It includes a label to display the opening sentence of a favorite book & another label for showing the book's title. This concludes the solution for the first part of the first question. For the second part, a button labeled "Show Book Title" is added & its position is set using setBounds. An ActionListener is attached to the button, which updates the second label to display the book's title when clicked. The setVisible(true) method makes the JFrame visible so the user can interact with it.


# JFrame Disable Button Problem
## [JFrame Disable Button](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/jframedisablebutton)

**Problem:**
Write an application that instantiates a JFrame that contains a JButton. Disable the JButton after the user clicks it. Then finally, save the file as JFrameDisableButton2.java. Modify the JFrameDisableButton program so that the JButton is not disabled until the user has clicked at least eight times. At that point, display a JLabel that indicates “That’s enough!” Save the file as JFrameDisableButton.java.

**Solution:**
In class we created a graphical user interface (GUI) window using Java Swing. The window includes a button labeled "Click Me" & an empty label below. When the button’s clicked, it disables itself & the label updates to display the message "That's enough!" The program uses an ActionListener to detect and respond to the button click. After one click, the button is permanently disabled, preventing further interactions. In the other, similar program, the user may click the button up to eight times.


# Book Problem
## [Books](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/books)

**Problem:**
Create an abstract class named `Book`. Include a `String` field for the Book’s title and a `double` field for the book’s price. Within the class, include a constructor that requires the book title, & add two get methods—one that returns the title & one that returns the price. Include an abstract method named `setPrice()`. Save the file as `Book.java`. Create two child classes of `Book`: `Fiction` & `NonFiction`. Each must include a `setPrice()` method that sets the price for all Fiction Books to $24.99 & for all NonFiction Books to $37.99. Write a constructor for each subclass, & include a call to `setPrice()` within each. Save the files as `Fiction.java` & `NonFiction.java`.

Write an application demonstrating that you can create both a Fiction & NonFiction Book, prompt the user for values, & display their fields. Save the file as `UseBook.java`. Write an application named `BookArray` in which you create an array that holds 10 Books, some Fiction & some NonFiction. Using a for loop, prompt the user for a title & whether the Book is fiction or nonfiction (F or N). Create the appropriate book type & store it in the array. If the user does not select F or N, re-prompt the user. In another for loop, display details about all 10 Books. Save the file as `BookArray.java`.

**Solution:**
This program manages books by creating an abstract class `Book` to hold common properties like title & price. Two child classes, `Fiction` & `NonFiction`, extend the `Book` class & set specific prices—$24.99 for fiction books & $37.99 for nonfiction books. The `UseBook` class creates individual fiction & nonfiction books by asking the user for their titles & then displaying the titles & prices. The `BookArray` class creates an array of 10 books. It prompts the user to specify each book’s title & whether it’s fiction or nonfiction, creates the appropriate type & then stores it in the array. Last but not least, the program then displays the details of all 10 books in the terminal.

---

# Phone Problem
## [Talk A Lot](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/talkalot)

**Problem:**
The Talk-A-Lot Cell Phone Company provides phone services for its customers. Create an abstract class named `PhoneCall` that includes a `String` field for a phone number & a `double` field for the price of the call. Also include a constructor that requires a phone number parameter & that sets the price to 0.0. Include a set method for the price. Also include three abstract get methods—one that returns the phone number, another that returns the price of the call, & a third that displays information about the call. Save the file as `PhoneCall.java`.
Create two child classes of `PhoneCall`: `IncomingPhoneCall` & `OutgoingPhoneCall`. The `IncomingPhoneCall` constructor passes its phone number parameter to its parent’s constructor & sets the price of the call to 2 cents. The method that displays the phone call information displays the phone number, the rate, & the price of the call (which is the same as the rate). The `OutgoingPhoneCall` class includes an additional field that holds the time of the call in minutes. The constructor requires both a phone number & the time. The price is 4 cents per minute, & the display method shows the details of the call, including the phone number, the rate per minute, the number of minutes, & the total price. Save the files as `IncomingPhoneCall.java` & `OutgoingPhoneCall.java`.
Write an application in which you declare a `PhoneCall` reference. Then continually prompt the user for a type of call until a sentinel value is entered. Create either an `IncomingPhoneCall` object or an `OutgoingPhoneCall` object & assign it to the `PhoneCall` reference. Then display the data for the object. Save the file as `DemoPhoneCalls.java`.

**Solution:**
The program models phone calls for the Talk-A-Lot Cell Phone Company by using an abstract class called `PhoneCall`, which stores a phone number & the price of a call. The `PhoneCall` class has a constructor to set the phone number & initialize the price to 0.0. It also defines an abstract method to display info. The `IncomingPhoneCall` class sets the price to 2 cents & displays the phone number, the rate, & the price. The `OutgoingPhoneCall` class requires both a phone number & the duration of the call in minutes, calculates the price at 4 cents per minute, & displays the phone number, rate, minutes, & total price. The `DemoPhoneCalls` program lets the user enter call types, phone numbers & call duration. Then it displays the data in the terminal & finally closes down.

---

## Division
## [Division](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/division.java)
## [InterDivision](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/interdivision.java)
## [DomesticDivision](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/domesticdivision.java)
## [UseDivision](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/usedivision.java)

**PROBLEM:** Create an abstract Division class with fields for a company’s division name & account number,
& an abstract display() method. Use a constructor in the superclass that requires values for both fields.
Save the file as Division.java. Create two subclasses named InternationalDivision & DomesticDivision. The
InternationalDivision subclass includes a field for the country in which the division is located &
a field for the language spoken; its constructor requires both. The DomesticDivision subclass includes
a field for the state in which the division is located; a value for this field is required by the constructor.
Save the files as InternationalDivision.java & DomesticDivision.java. Write an application named UseDivision
that creates a Division reference. Ask the user whether a DomesticDivision or InternationalDivision object
should be created. Prompt for appropriate values & assign a new subclass object to the Division reference.
Then display the details of the created object. Save the file as useDivision.java.

**SOLUTION:** The program we created in class models a system for managing organizational divisions, allowing for
two types: Domestic & International. The base class Division encapsulates common properties like divisionName
& accountNumber, while subclasses domesticDivision & interDivision add specific attributes like state,
country & language. The useDivision class facilitates user interaction through the scanner object to collect
user inputs to create & display the right division objects based on the type specified.

---

## Athlete
## [Athlete](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/athlete.java)
## [Machine](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/machine.java)
## [Runner](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/runner.java)
## [DemoRunners](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/demorunners.java)
## [PoliticalCandidate](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/politicalcandidate.java)

**PROBLEM:** Create an interface called Runner. The interface has an abstract method called run(). Save the file as
Runner.java. Create classes called Machine, Athlete, & PoliticalCandidate that all implement Runner. The run()
method displays a message describing the meaning of run to each class. Save the files as Machine.java, Athlete.java,
& PoliticalCandidate.java. Create an application that prompts the user for the type of object to create. Create it,
& display the message that describes run for the class. Save the file as DemoRunners.java.

**SOLUTION:** I created an interface Runner implemented by multiple classes (Machine, PoliticalCandidate & Athlete).
Based on user input via the scanner import, the program creates an instance of one of these classes & calls
the run method, which outputs a message specific to the selected type. This is to demonstrate how
different types can share the same interface.

---

## [Car](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/car.java)
## [Vehicle](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/vehicle.java)
## [ElectricCar](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/electriccar.java)
## [Electric](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/electric.java)

**PROBLEM:** Create a simple Java program that uses both inheritance & interfaces. Step 1: Create a Base Class.

<!-- ```java
public class Vehicle {
    protected String brand;
    public Vehicle(String brand) {
        this.brand = brand;
    }
    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}
// public class Car extends Vehicle { -->
<!-- private int numberOfDoors;
//     public Car(String brand, int numberOfDoors) {
//         super(brand); // Calls the constructor of Vehicle
//         this.numberOfDoors = numberOfDoors;
//     }
//     public void displayDetails() {
//         displayBrand(); // Calls the method from Vehicle
//         System.out.println("Number of Doors: " + numberOfDoors);
//     }
// }
// public interface Electric {
//     void chargeBattery();
// }
// public class ElectricCar extends Car implements Electric {
//     private int batteryCapacity;
//     public ElectricCar(String brand, int numberOfDoors, int batteryCapacity) {
//         super(brand, numberOfDoors);
//         this.batteryCapacity = batteryCapacity;
//     }
//     @Override
//     public void chargeBattery() {
//         System.out.println("Charging the battery with capacity: " + batteryCapacity + " kWh.");
//     }
//     @Override
//     public void displayDetails() {
//         super.displayDetails();
//         System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
//     }
// } -->

---

# Integer Store Problem
## [IntegerStore](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/integerstore.java)

**Problem:**
Write an application that stores nine integers in an array named `numbers`. Display the integers from first to last, & then display the integers from last to first. Save the file as `IntegerStore.java`.

**Solution:**
I started by initializing an array of nine integers. Next, it displays the integers in the array from the beginning to the end by iterating through the array from the first element to the last, printing each integer. After, it displays the integers in reverse order by iterating from the last element to the first. Each element is printed on the same line with spaces in between, & the output is separated into two sections with clear labels to show the different orders.

---

# Grader Problem
## [Grader](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/grader.java)

**Problem:**
Design & implement a simple Java program that uses a two-dimensional array to manage student grades across multiple subjects. The program should allow input of grades for several students & subjects, calculate each student's average grade, & display the highest & lowest grades in each subject. Include error handling for invalid inputs & provide a method to display a summary of student performance. Use a two-dimensional array to store & retrieve student grades. Apply array operations to calculate & display summary statistics. Practice handling user input & displaying organized output.

**Solution:**
This Java program, called `Grader`, collects grades for six students across four subjects, calculates the highest & lowest grades for each subject, & then displays these values. Using a 2D array, `studentGrades`, the program organizes student scores. Each row represents a student & each column represents a subject. After gathering user input, the program iterates over each subject to identify the highest & lowest grades recorded among all students for that subject. Finally, it prints out the highest & lowest grades per subject.

---

# Java Journal, October 2024

## [Car Care Choice](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/carcarechoice.java)

**PROBLEM:**
Write an application for Chapa’s Car Care Shop that shows a user a list of available services: oil change, tire rotation, battery check, or brake inspection. Allow the user to enter a string that corresponds to one of the options & display the option & its price as $25, $22, $15, or $5, accordingly. Display an error message if the user enters an invalid item. Save the file as CarCareChoice.java.

**SOLUTION:**
For the CarCareChoice project, I wrote a simple program that offers a list of car services like oil changes & brake checks, with each service having its own unique set price which is instantiated in the main method (lines 3 – 8). When the user opens the terminal, they are greeted with a welcome message, followed by asking the user to type in the name of a service from the list. The program then responds with the price for that specific service. If the user types something that isn’t already inside the list, an error message pops which asks them to pick a valid service.

---

## [Distance from Avg](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/distancefromaverage.java)

**PROBLEM:**
Allow a user to enter any number of double values up to 15. The user should enter 99999 to quit entering numbers. Display an error message if the user quits without entering any numbers; otherwise, display a count of the numbers entered, the arithmetic average of the numbers, & each entered value & its distance from the average. Save the file as DistanceFromAverage.java.

**SOLUTION:**
First, the Scanner object is imported to allow user input. Then the DistanceFromAverage class is declared, followed by variables being instantiated in the main method on lines 5 – 11. Upon opening the terminal for this program, the user is asked to enter up to 15 numbers, one by one. The user can stop entering numbers early by typing 99999, which exits the program completely. Then the program stores the numbers entered by the user, adds them up & calculates the average. If no numbers are entered, it shows an error message. If numbers are entered, it displays the count of numbers, the average, & how far each number is from the average.

---

## [Purchase](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/purchase.java)

**PROBLEM:**
Create a class named Purchase. Each Purchase contains an invoice number, amount of sale, & amount of sales tax. Include set methods for the invoice number & sale amount. Within the set method for the sale amount, calculate the sales tax as 5 percent of the sale amount. Also include a display method that displays a purchase’s details. Save the file as Purchase.java.

**SOLUTION:**
Inside the Purchase class I created, the program is designed to manage details about a particular purchase. It allows the user to set an invoice number & a sale amount. Next, it calculates a 5% tax based on the sale amount. After that, it prints out the invoice number, the sale amount, the tax & the total cost of the purchase sale.

---

## [Count by Five](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/countbyfives.java)

**PROBLEM:**
Write an application that includes final constants named START and STOP that are set to 5 & 500, respectively. The application counts by five from 5 through 500 inclusive, and it starts a new line after every multiple of 50 (50, 100, 150, and so on). Save the file as java. Then modify the CountByFives application so that the user enters the value to count by. Start each new line after 10 values have been displayed. Save the file as CountByFives.java.

**SOLUTION:**
This simple program counts numbers from 5 up to 500 based on the value input by the user. It first checks if the user input a valid integer before proceeding. If valid, it starts from 5 & increments by the user’s input until it reaches or exceeds 500. It also formats the output so that it starts a new line after every ten numbers per the instructions provided.

---

## [Even](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/even.java)

**PROBLEM:**
Write an application that asks a user to type an even number or the sentinel value 999 to stop. When the user types of an even number, display the message "Good job!" & then ask for another input. When the user types of an odd number, display an error message and then ask for another input. When the user types the sentinel value 999, end the program. Save the file as Even.java.

**SOLUTION:**
I created a class called Even & then asked users to enter an even number or type 999 to quit in the main method. Then on lines 15 – 23, I created a series of if-else statements to check if the user wants to exit the program, input a proper value or an incorrect one. If the user inputs 999, the program says "Goodbye." If another number is entered, it checks whether the number is even or odd. If it’s even, it congratulates the user; if it’s not, it displays an error message. Lastly, the scanner object is closed.

---

## [Ascending / Descending](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/ascendingdescending.java)

**PROBLEM:**
Write an application that asks a user to enter three integers. Display them in ascending and descending order. Save the file as AscendingDescending.java.

**SOLUTION:**
My newest Java program asks for three numbers as input from the user & arranges them in both ascending & descending order. From lines 23 – 50, I wrote a series of if-else statements to compare values & determine which one is the maximum (max), middle (mid) & minimum (min) number. Once the order is established, it displays the numbers in ascending order (from smallest to largest), then descending order (from largest to smallest).

---

## [Even Odd](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/evenodd.java)

**PROBLEM:**
Write an application that asks a user to enter an integer. Pass the integer to a method that determines whether the number is even and returns a Boolean value. Display a statement that indicates whether the integer is even or odd. Save the file as EvenOdd.java.

**SOLUTION:**
I used the Scanner class to accept user input from the console. The program then prompts the user to enter an integer & reads the input using the nextInt() method of the Scanner object. Once the integer is input, the program calls the isEven() method. Inside this method, it checks whether the number is divisible by 2 by using the modulus operator (%). If the remainder when divided by 2 is zero, the method returns true, otherwise, it returns false i.e. odd. The returned boolean value from the isEven() method is stored in the isEvenNumber variable.

---

## Java Journal, September 2024

### [Seasoned Employee](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/seasonedemployee.java)

**DIRECTIONS:**
Write a Java program to create a class called "Employee" with a name, salary, & hire date attributes, & a method to calculate years of service.

**SOLUTION:**
I designed this program like the other Employee.java project, except this time we’re looking to find the amount of years employed somewhere. So I used a new class name, SeasonedEmployee, & gave it three attributes: name, hireDate, & salary. The class includes a constructor that initializes the attributes, on lines 11 – 16. There is a method called totalYears that calculates the total years of service by subtracting the employee's hire year from the current year on lines 19 - 22. In the main method, user input is from the Scanner object to get the employee's name, hire year, & salary. Then, an instance of SeasonedEmployee is created, & the total years employed is calculated using the current year. Finally, the employee's details & the total years of service are displayed in the console.

---

# Minutes Conversion Problem

## [MinutesConversion.java](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/minutesconversion.java)

**Problem:**
Write a program that accepts an integer number of minutes from a user & converts it both to hours & days. For example, 6,000 minutes equals 100 hours & equals 4.167 days. Save the program as `MinutesConversion.java`.

**Solution:**
I defined a class named `MinutesConverter` along with importing the `Scanner` object on lines 1 - 3. The user is asked to input a random number of minutes on line 8. Then the minutes are converted into hours & days using division & multiplication. The results are printed within the console to display the number of hours & the number of days converted on lines 16 - 18. Last but not least, I closed the `Scanner` object.

---

# Traffic Light Problem

## [TrafficLight.java](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/trafficlight.java)

**Problem:**
Write a Java program to create a class called "TrafficLight" with attributes for color & duration & methods to change the color & check for red or green.

**Solution:**
First, I imported the `Scanner` object for user input. Then I defined a `TrafficLight` class with two attributes: color & duration. Next, I created the `changeColor` method which updates the color of the traffic light & automatically sets the duration based on the color: 60 seconds if the light is red & 180 seconds if it is green. The program uses a `Scanner` object to take user input from the console, asking the user for the color of the traffic light. After the user enters a color, the `changeColor` method is called to update the traffic light's state. Finally, the program prints the color & duration.

---

# Student Problem

## [Student.java](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/student.java)

**Problem:**
Write a Java program to create a class called "Student" with a name, grade, & course attributes, & methods to add & remove courses.

**Solution:**
My code defines a `Student` class to manage a student's name, grade, & a list of courses they’re enrolled in. It contains methods to add & remove courses from the list & to display the current courses located on lines 15 - 28. In the main method, an instance of the `Student` class is created to add two courses, it then displays the list of courses, removes one & finally displays the updated list again.

---

# Percentages Problem

## [Percentages.java](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/percentages.java)

**Problem:**
Create an application named `Percentages` whose main() method holds two double variables, & prompt the user for values. Pass both variables to a method named `computePercent()` that displays the two values & the value of the first number as a percentage of the second one. For example, if the numbers are 2.0 & 5.0, the method should display a statement similar to 2.0 is 40 percent of 5.0. Then call the method a second time, passing the values in reverse order. Save the application as `Percentages.java`.

**Solution:**
This program calculates & displays the percentage of one number in relation to another. It starts by prompting the user to input two decimal numbers on lines 8-12. After capturing the inputs, the program calls a method named `computePercent` twice: first to determine what percentage the first number is of the second & then again to find out what percentage the second number is of the first. The method performs the calculation by dividing the first number by the second & multiplying the result by 100 to express it as a percentage. It then outputs the results to the console, showing both the calculated percentage & the original numbers & then closes the scanner.

---

# Eggs Problem

## [Eggs.java](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/eggs.java)

**Problem:**
Meadowdale Dairy Farm sells organic brown eggs to local customers. It charges $3.25 for a dozen eggs or 45 cents for individual eggs that are not part of a dozen. Write a program that prompts a user for the number of eggs in the order & then display the amount owed with a full explanation. For example, a typical output might be You ordered 27 eggs. That’s 2 dozen at $3.25 per dozen & 3 loose eggs at 45 cents each for a total of $7.85. Save the program as `Eggs.java`.

**Solution:**
This program calculates the total cost of eggs based on user input. It begins by defining the price of a dozen eggs as $3.25 & the price of individual eggs as $0.45 on lines 5 - 9. It also defines that a dozen contains 12 eggs. Then the user is prompted to enter the total number of eggs they want to order. It calculates how many full dozens & leftover eggs the user has by dividing & finding the remainder of the total egg count. The total cost is calculated based on the number of dozens & leftover eggs. Finally, the program outputs a detailed explanation of the order & then closes the `Scanner` object.

---

# Employee Problem

## [Employee.java](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/employee.java)

**Problem:**
Write a Java program to create a class called "Employee" with a name, salary, & hire date attributes, & a method to calculate years of service.

**Solution:**
First, I imported the `Scanner` method on line 3. Then I defined an `Employee` class in Java that holds three pieces of information: an employee's name, job title, & salary on lines 5-9. The class includes a constructor that initializes these variables. In the main method starting on line 18, the program prompts the user to enter an employee's name, job title, & salary through the console. After, it creates an instance of the `Employee` class with the provided data. Finally, the program displays the employee's details (name, job title, & salary) back to the user & the `Scanner` is closed to prevent resource leaks.

---

# Even / Odd Problem

## [EvenOdd.java](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/evenodd.java)

**Problem:**
Write a program that accepts an integer from the user & determines if it is even or odd.

**Solution:**
I used the `Scanner` class to accept user input from the console. The program then prompts the user to enter an integer & reads the input using the `nextInt()` method of the `Scanner` object. Once the integer is input, the program calls the `isEven()` method. Inside this method, it checks whether the number is divisible by 2 by using the modulus operator (%). If the remainder when divided by 2 is zero, the method returns true, otherwise, it returns false (i.e., odd). The returned boolean value from the `isEven()` method is stored in the `isEvenNumber` variable.

---

# Quarts to Gallons Problem

## [QuartsToGallons.java](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/quartstogallons.java)

**Problem:**
Write a program to convert quarts to gallons, displaying how many full gallons & extra quarts are needed for a job requiring 18 quarts.

**Solution:**
I defined a constant `QUART_IN_GALLON`, which holds the value of quarts in one gallon (4). The program sets an initial value of `quartsNeeded` (18) & calculates the number of full gallons by dividing `quartsNeeded` by `QUART_IN_GALLON`. Then the program prints a message displaying how many full gallons & extra quarts are needed for a job requiring 18 quarts.

---

# Circle Calculator Problem

## [Circle.java](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/circle.java)

**Problem:**
Write a program that calculates the area & circumference of a circle, given the radius.

**Solution:**
First, I defined a class called `Circle`. The class provides a constructor that initializes the radius, along with getter & setter methods to access & modify the radius. It also includes methods to calculate the area & circumference of the circle. The area is calculated using the formula π * r² & the circumference is calculated using 2 * π * r. In the main method, an instance of `Circle` is created with an initial radius of 5 & its radius, area, & circumference are printed. After, the radius is updated to 7 & the updated attributes are displayed once more using the `System.out.println()` method.

---

# Person Data Problem

## [Person.java](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/Person.java)

**Problem:**
Write a program to store and display a person's name & age.

**Solution:**
This program defines a `Person` class that models a person with two attributes: name & age. The class includes a constructor that initializes these attributes, along with getter methods to retrieve someone’s name & age. The main method creates two instances of the `Person` class, `person1` & `person2`, & calls the `displayPersonInfo()` method for each.

---

# Rectangle Calculator

## [Rectangle.java](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/Rectangle.java)

**Problem:**
The Rectangle class defines a rectangle with width & height attributes. The program includes a constructor to initialize these attributes, & two methods to calculate the rectangle's area (`calculateArea()`) & perimeter (`calculatePerimeter()`). In the main method, an instance of `Rectangle` is created with a width of 5.0 & height of 3.0. Finally, the program calculates & displays the area & perimeter of the rectangle.

---

# Tables & Chairs

## [TablesAndChairs.java](https://github.com/n1t5ua5/pbsc/blob/main/javaprojects/tablesandchairs.java)

**Problem:**
In this simple Java program, the `TableAndChairs` class is designed to print a visual representation of a table & chairs. The program uses the `System.out.println()` method to print several lines of text that, when combined, form the shape of a table with chairs on either side. The output visually mimics the arrangement of chairs ("X") on the sides of a table ("XXXXXXXXXX") with legs ("X") on both ends.

---

# Dog Info

## [Dog.java](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/Dog.java)

**Problem:**
First, I defined a class that represents a dog with two attributes: name & breed. The class includes a constructor to initialize these attributes, as well as getter & setter methods to access & modify them. It also features a method to display the dog's details in a formatted manner. In the main method, two instances of the `Dog` class are created, representing different dogs. The program first prints their initial attributes, then updates their names & breeds using the setter methods. Finally, I printed the updated information.

---

# Song Lyrics

## [SongLyrics.java](https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/SongLyrics.java)

**Problem:**
`SongLyrics` is a program that prints four lines from the lyrics of the song "A World on Fire" by the band Within the Ruins. Each line is displayed using the `System.out.println()` method. Additionally, the program includes a link to the song on YouTube, allowing users to access the full track easily.

---

# Movie Quote Info

## [MovieQuoteInfo.java](https://github.com/n1t5ua5/pbsc/blob/main/javaprojects/moviequoteinfo.java)

**Problem:**
`MovieQuoteInfo` is another straightforward Java program that presents a series of quotes from various films. A public class is defined called `MovieQuoteInfo`. Then each quote is displayed along with the character who said it, the movie's title & its release year, all formatted into a single string for clarity within four individual print statements.
