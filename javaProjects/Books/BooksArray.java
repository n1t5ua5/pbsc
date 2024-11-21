import java.util.Scanner;
public class BooksArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[10];
        // Create scanner to allow user input & an array which holds 10 objects

        for (int i = 0; i < books.length; i++) {
            System.out.print("Enter the title of book " + (i + 1) + ": ");
            String title = scanner.nextLine();
            // For loop gets the title of the book from user input

            System.out.print("Is the book fiction on NonFiction? (F/N): ");
            String type = scanner.nextLine().toUpperCase();
            // Next the book type is input (Fiction or NonFiction)

            if (type.equals("F")) {
                books[i] = new Fiction(title);
                // Checks for type & creates Fiction object
            } else if (type.equals("N")) {
                books[i] = new NonFiction(title);
                // Else if statements creates NonFiction object
            } else {
                System.out.println("Invalid input. Try again.");
                i--;
                // Else statement handles invalid user input
            }
        }

        for (int i = 0; i < books.length; i++) {
            System.out.println("\nBook " + (i + 1) + ":");
            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Price: $" + books[i].getPrice());
            // For loop displays info about each bool; title & price
        }

        scanner.close();
        // Close scanner object to prevent data leaks
    }
}
