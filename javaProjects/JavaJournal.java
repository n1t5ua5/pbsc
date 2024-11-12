public class JavaJournal {

}

// JAVA JOURNAL, NOVEMBER 2024


/*
Integer Store: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/integerstore.java

PROBLEM: Write an application that stores nine integers in an array named numbers. Display the integers from first
to last, & then display the integers from last to first. Save the file as IntegerStore.java.

SOLUTION: I started by initializing an array of nine integers. Next, it displays the integers in the array from the beginning
to the end by iterating through the array from the first element to the last, printing each integer. After, it displays the
integers in reverse order by iterating from the last element to the first. Each element is printed on the same line with
spaces in between, & the output is separated into two sections with clear labels to show the different orders.
 */


/*
Grader: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/grader.java

PROBLEM: Design & implement a simple Java program that uses a two-dimensional array to manage student grades across
multiple subjects. The program should allow input of grades for several students & subjects, calculate each
student's average grade, & display the highest & lowest grades in each subject. Include error handling for
invalid inputs & provide a method to display a summary of student performance. Use a two-dimensional array
to store & retrieve student grades. Apply array operations to calculate & display summary statistics.
Practice handling user input & displaying organized output.

SOLUTION: This Java program, called Grader, collects grades for six students across four subjects, calculates the
highest & lowest grades for each subject, & then displays these values. Using a 2D array, studentGrades, the
program organizes student scores. Each row represents a student & each column represents a subject. After
gathering user input, the program iterates over each subject to identify the highest & lowest grades
recorded among all students for that subject. Finally, it prints out the highest &
lowest grades per subject.
 */


// JAVA JOURNAL, OCTOBER 2024


/*
Car Care Choice: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/carcarechoice.java

PROBLEM: Write an application for Chapa’s Car Care Shop that shows a user a list of available services: oil
change, tire rotation, battery check, or brake inspection. Allow the user to enter a string that corresponds
to one of the options & display the option & its price as $25, $22, $15, or $5, accordingly. Display
an error message if the user enters an invalid item. Save the file as CarCareChoice.java.

SOLUTION: For the CarCareChoice project, I wrote a simple program that offers a list of car services like
oil changes & brake checks, with each service having its own unique set price which is instantiated in
the main method (lines 3 – 8). When the user opens the terminal, they are greeted with a welcome
message, followed by asking the user to type in the name of a service from the list. The program
then responds with the price for that specific service. If the user types something that isn’t
already inside the list, an error message pops which asks them to pick a valid service.
*/


/*
Distance from Avg: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/distancefromaverage.java

PROBLEM: Allow a user to enter any number of double values up to 15. The user should enter 99999 to quit
entering numbers. Display an error message if the user quits without entering any numbers; otherwise,
display a count of the numbers entered, the arithmetic average of the numbers, & each entered value
& its distance from the average. Save the file as DistanceFromAverage.java.

SOLUTION: First, the Scanner object is imported to allow user input. Then the DistanceFromAverage class
is declared, followed by variables being instantiated in the main method on lines 5 – 11. Upon opening
the terminal for this program, the user is asked to enter up to 15 numbers, one by one. The user can
stop entering numbers early by typing 99999, which exits the program completely. Then the program
stores the numbers entered by the user, adds them up & calculates the average. If no numbers are
entered, it shows an error message. If numbers are entered, it displays the count of numbers,
the average, & how far each number is from the average.
*/


/*
Purchase: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/purchase.java

PROBLEM: Create a class named Purchase. Each Purchase contains an invoice number, amount of sale, &
amount of sales tax. Include set methods for the invoice number & sale amount. Within the set method
for the sale amount, calculate the sales tax as 5 percent of the sale amount. Also include a display
method that displays a purchase’s details. Save the file as Purchase.java.

SOLUTION: Inside the Purchase class I created, the program is designed to manage details about a
particular purchase. It allows the user to set an invoice number & a sale amount. Next, it
calculates a 5% tax based on the sale amount. After that, it prints out the invoice
number, the sale amount, the tax & the total cost of the purchase sale.
*/


/*
Count by Five: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/countbyfives.java

PROBLEM: Write an application that includes final constants named START and STOP that are set to 5 & 500, respectively.
The application counts by five from 5 through 500 inclusive, and it starts a new line after every multiple of
50 (50, 100, 150, and so on). Save the file as java. Then modify the CountByFives application so that the
user enters the value to count by. Start each new line after 10 values have been displayed.
Save thefile as CountByFives.java.

SOLUTION: This simple program counts numbers from 5 up to 500 based on the value input by the user. It first checks if the user
input a valid integer before proceeding. If valid, it starts from 5 & increments by the user’s input until it reaches or exceeds
500. It also formats the output so that it starts a new line after every ten numbers per the instructions provided.
*/


/*
Even: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/even.java

PROBLEM: Write an application that asks a user to type an even number or the sentinel value 999 to stop. When the user types
of an even number, display the message "Good job!" & then ask for another input. When the user types of an odd number,
display an error message and then ask for another input. When the user types the sentinel value 999, end the program.
Save the file as Even.java.

SOLUTION: I created a class called Even & then asked users to enter an even number or type 999 to quit in the main method.
Then on lines 15 – 23, I created a series of if-else statements to check if the user wants to exit the program, input a
proper value or an incorrect one. If the user inputs 999, the program says "Goodbye." If another number is entered,
it checks whether the number is even or odd. If it’s even, it congratulates the user; if it’s not, it displays
an error message. Lastly, the scanner object is closed.
*/


/*
Ascending / Descending: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/ascendingdescending.java

SOLUTION: Write an application that asks a user to enter three integers. Display them in ascending and descending order.
Save the file as AscendingDescending. java.

PROBLEM: My newest Java program ask for three numbers as input from the user & arranges them in both ascending & descending order.
From lines 23 – 50, I wrote a series of if-else statements to compare values &determine which one is the maximum (max), middle (mid)
& minimum (min) number. Once the order is established, it displays the numbers in ascending order (from smallest to largest), then
descending order (from largest to smallest).
*/


/*
Even Odd: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/evenodd.java

PROBLEM: Write an application that asks a user to enter an integer. Pass the integer to a method that determines whether the number
is even and returns a Boolean value. Display a statement that indicates whether the integer is even or odd. Save the file as EvenOdd.java.

SOLUTION: I used the Scanner class to accept user input from the console. The program then prompts the user to enter an integer & reads
the input using the nextInt() method of the Scanner object. Once the integer is input, the program calls the isEven() method.
Inside this method, it checks whether the number is divisible by 2 by using the modulus operator (%). If the remainder when
divided by 2 is zero, the method returns true, otherwise, it returns false i.e. odd. The returned boolean value from the
isEven() method is stored in the isEvenNumber variable.
*/


// JAVA JOURNAL, SEPTEMBER 2024

/*
Seasoned Employee: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/seasonedemployee.java

DIRECTIONS: Write a Java program to create a class called "Employee" with a name, salary, & hire
date attributes, & a method to calculate years of service.

SOLUTION: I designed this program like the other Employee.java project, except this time we’re looking to
find the amount of years employed somewhere. So I used a new class name, SeasonedEmployee, & gave it three
attributes: name, hireDate, & salary. The class includes a constructor that initializes the attributes, on
lines 11 – 16. There is a method called totalYears that calculates the total years of service by subtracting
the employee's hire year from the current year on lines 19 - 22. In the main method, user input is from the
Scanner object to get the employee's name, hire year, & salary. Then, an instance of SeasonedEmployee is
created, & the total years employed is calculated using the current year. Finally, the employee's details
& the total years of service are displayed in the console.
 */


/*
Minutes Conversion: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/minutesconversion.java

DIRECTIONS: Write a program that accepts an integer number of minutes from a user & converts it both
to hours & days. For example, 6,000 minutes equals 100 hours & equals 4.167 days. Save the
program as MinutesConversion.java.

SOLUTION: I defined a class named Minutes Converter along with importing the Scanner object on lines 1 - 3.
The user is asked to input a random number of minutes on line 8. Then the minutes are converted into hours
& days using division & multiplication. The results are printed within the console to display the number
of hours & the number of days converted on lines 16 - 18. Last but not least, I closed the Scanner object.
*/


/*
Traffic Light: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/trafficlight.java

DIRECTIONS: Write a Java program to create a class called "TrafficLight" with attributes for color & duration
& methods to change the color & check for red or green.

SOLUTION: First, I imported the scanner object for user input. Then I defined a TrafficLight class with two
attributes: color & duration. Next, I created the changeColor method which updates the color of the traffic
light & automatically sets the duration based on the color: 60 seconds if the light is red & 180 seconds
if it is green. The program uses a Scanner object to take user input from the console, asking the user
for the color of the traffic light. After the user enters a color, the changeColor method is called
to update the traffic light's state. Finally, the program prints the color & duration.
*/


/*
Student: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/student.java

DIRECTIONS: Write a Java program to create a class called "Student" with a name, grade, & course attributes,
& methods to add & remove courses.

SOLUTION: My code defines a Student class to manage a student's name, grade, & a list of courses they’re enrolled in.
It contains methods to add & remove courses from the list & to display the current courses located on lines 15 - 28.
In the main method, an instance of the Student class is created to add two courses, it then displays the list of
courses, removes one & finally displays the updated list again.
*/


/*
Percentages: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/percentages.java

DIRECTIONS: Create an application named Percentages whose main() method holds two double variables, & prompt the user for
values. Pass both variables to a method named computePercent() that displays the two values & the value of the first
number as a percentage of the second one. For example, if the numbers are 2.0 & 5.0, the method should display a
statement similar to 2.0 is 40 percent of 5.0. Then call the method a second time, passing the values in reverse
order. Save the application as Percentages.java.

SOLUTION: This program calculates & displays the percentage of one number in relation to another. It starts by prompting
the user to input two decimal numbers on lines 8-12. After capturing the inputs, the program calls a method named
computePercent twice: first to determine what percentage the first number is of the second & then again to find
out what percentage the second number is of the first. The method performs the calculation by dividing the first
number by the second & multiplying the result by 100 to express it as a percentage. It then outputs the results
to the console, showing both the calculated percentage & the original numbers & then closes the scanner.
*/


/*
Eggs: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/eggs.java

DIRECTIONS: Meadowdale Dairy Farm sells organic brown eggs to local customers. It charges $3.25 for a dozen eggs or 45 cents
for individual eggs that are not part of a dozen. Write a program that prompts a user for the number of eggs in the order &
then display the amount owed with a full explanation. For example, a typical output might be You ordered 27 eggs. That’s 2
dozen at $3.25 per dozen & 3 loose eggs at 45 cents each for a total of $7.85. Save the program as Eggs.java.

SOLUTION: This program calculates the total cost of eggs based on user input. It begins by defining the price of a dozen eggs as
$3.25 & the price of individual eggs as $0.45 on lines 5 - 9. It also defines that a dozen contains 12 eggs. Then the user is
prompted to enter the total number of eggs they want to order. It calculates how many full dozens & leftover eggs the user has
by dividing & finding the remainder of the total egg count. The total cost is calculated based on the number of dozens &
leftover eggs. Finally, the program outputs a detailed explanation of the order & then closes the Scanner object.
*/


/*
Employee: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/employee.java

DIRECTIONS: Write a Java program to create a class called "Employee" with a name, salary, & hire date attributes,
& a method to calculate years of service.

SOLUTION: First, I imported the scanner method on line 3. Then I defined an Employee class in Java that holds three pieces of information:
an employee's name, job title, & salary on lines 5-9. The class includes a constructor that initializes these variables. In the
main method starting on line 18, the program prompts the user to enter an employee's name, job title, & salary through the
console. After, it creates an instance of the Employee class with the provided data. Finally, the program displays the
employee's details (name, job title, & salary) back to the user & the Scanner is closed to prevent resource leaks.
*/


/*
Even / Odd: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/evenodd.java

I used the Scanner class to accept user input from the console. The program then prompts the user to enter an integer & reads
the input using the nextInt() method of the Scanner object. Once the integer is input, the program calls the isEven() method.
Inside this method, it checks whether the number is divisible by 2 by using the modulus operator (%). If the remainder when
divided by 2 is zero, the method returns true, otherwise, it returns false i.e. odd. The returned boolean value from the
isEven() method is stored in the isEvenNumber variable.
*/


/*
Quarts to Gallons: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/quartstogallons.java

I defined a constant QUART_IN_GALLON, which holds the value of quarts in one gallon (4). The program sets an
initial value of quartsNeeded (18) & calculates the number of full gallons by dividing quartsNeeded by QUART_IN_GALLON.
Then the program prints a message displaying how many full gallons & extra quarts are needed for a job requiring 18 quarts.
*/


/*
Circle Calculator: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/circle.java

First I defined a class called Circle. The class provides a constructor that initializes the radius, along with getter &
setter methods to access & modify the radius. It also includes methods to calculate the area & circumference of the circle.
The area is calculated using the formula π * r² & the circumference is calculated using 2 * π * r. In the main method,
an instance of Circle is created with an initial radius of 5 & its radius, area & circumference are printed. After,
the radius is updated to 7 & the updated attributes are displayed once more using the System.out.println() method.
*/


/*
Person Data: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/Person.java

This program defines a Person class that models a person with two attributes: name & age. The class includes
a constructor that initializes these attributes, along with getter methods to retrieve someone’s name & age.
The main method creates two instances of the Person class, person1 & person2, & calls the
displayPersonInfo() method for each.
*/


/*
Rectangle Calculator: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/Rectangle.java

The Rectangle class defines a rectangle with width & height attributes. The program includes a constructor
to initialize these attributes, & two methods to calculate the rectangle's area (calculateArea()) & perimeter
(calculatePerimeter()). In the main method, an instance of Rectangle is created with a width of 5.0 & height
of 3.0. Finally, the program calculates & displays the area & perimeter of the rectangle.
*/


/*
Tables & Chairs: https://github.com/n1t5ua5/pbsc/blob/main/javaprojects/tablesandchairs.java

In this simple Java program, the TableAndChairs class is designed to print a visual representation
of a table & chairs using. The program uses the System.out.println() method to print several lines
of text that, when combined, form the shape of a table with chairs on either side. The output visually
mimics the arrangement of chairs ("X") on the sides of a table ("XXXXXXXXXX") with legs ("X") on both ends.
*/


/*
Dog Info: github.com/n1t5ua5/pbsc/blob/main/javaProjects/Dog.java

First, I defined a class that represents a dog with two attributes: name & breed. The class includes a constructor to
initialize these attributes, as well as getter & setter methods to access & modify them. It also features a method
to display the dog's details in a formatted manner. In the main method, two instances of the Dog class are created,
representing different dogs. The program first prints their initial attributes, then updates their names & breeds
using the setter methods. Finally, I printed the updated information.
*/


/*
Song Lyrics: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/SongLyrics.java

SongLyrics, is a program that prints four lines from the lyrics of the song "A World on Fire" by the band Within the Ruins.
Each line is displayed using the System.out.println() method. Additionally, the program includes a link to the song on
YouTube, allowing users to access the full track easily.

*/


/*
Movie Quote Info: https://github.com/n1t5ua5/pbsc/blob/main/javaprojects/moviequoteinfo.java

MovieQuoteInfo is another straightforward Java program that presents a series of quotes from various films.
A public class is defined called MovieQuoteInfo. Then each quote is displayed along with the character who
said it, the movie's title & its release year, all formatted into a single string for clarity within four
individual print statements.

*/
