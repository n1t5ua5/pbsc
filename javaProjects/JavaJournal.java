public class JavaJournal {

}

// JAVA JOURNAL, SEPTEMBER 2024



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
$3.25 and the price of individual eggs as $0.45 on lines 5 - 9. It also defines that a dozen contains 12 eggs. Then the user is
prompted to enter the total number of eggs they want to order. It calculates how many full dozens & leftover eggs the user has
by dividing and finding the remainder of the total egg count. The total cost is calculated based on the number of dozens &
leftover eggs. Finally, the program outputs a detailed explanation of the order & then closes the Scanner object.
*/



/*
Employee: https://github.com/n1t5ua5/pbsc/blob/main/javaProjects/employee.java

DIRECTIONS: Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes,
and a method to calculate years of service.

SOLUTION: First, I imported the scanner method on line 3. Then I defined an Employee class in Java that holds three pieces of information:
an employee's name, job title, & salary on lines 5-9. The class includes a constructor that initializes these variables. In the
main method starting on line 18, the program prompts the user to enter an employee's name, job title, and salary through the
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
