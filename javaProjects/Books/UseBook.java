import java.util.Scanner;
public class UseBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the title of Fiction book: ");
        String fictionTitle = scanner.nextLine();
        String fictionBook = new Fiction(fictionTitle);
        // Ask user for fiction book title, then a fiction book is created

        System.out.print("Enter the title of the Non-Fiction book: ");
        String nonFictionTitle = scanner.nextLine();
        NonFiction nonFictionBook = new NonFiction(NonFictionTitle);
        // Ask user for Non-Fiction book title, then a Non-Fiction book is created

        System.out.println("\nFiction Book:");
        System.out.println("Title: " + fictionBook.getTitle());
        System.out.println("Price: $" + fictionBook.getPrice());
        // Fiction book details are displayed

        System.out.println("\nNonFiction Book:");
        System.out.println("Title: " + nonFictionBook.getTitle());
        System.out.println("Price: $" + nonFictionBook.getPrice());
        // Non-Fiction book details are displayed

        scanner.close();
        // Close scanner object
    }
}
