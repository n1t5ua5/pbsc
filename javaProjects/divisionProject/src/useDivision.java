package divisionProject.src;
import java.util.Scanner;

public class useDivision {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Division division = null;
        // Declared Division object to be initialized


        System.out.print("Enter division type (Domestic/International): ");
        String divisionType = scanner.nextLine();
        // Asks user for type of division

        System.out.print("Enter division name: ");
        String divisionName = scanner.nextLine();
        // Asks user for division name

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        // Asks user for account number

        if (divisionType.equalsIgnoreCase("International")){
            System.out.print("Enter country: ");
            String country = scanner.nextLine();
             // Determine type of division & gather remaining data

            System.out.print("Enter language: ");
            String language = scanner.nextLine();

        division = new interDivision(divisionName, accountNumber, country, language);
        } else if (divisionType.equalsIgnoreCase("Domestic")) {
            System.out.print("Enter state: ");
            String state = scanner.nextLine();
            // Create inter division object

            division = new domesticDivision(divisionName, accountNumber, state);
        } else {
            System.out.print("Invalid division type entered.");
             // Handle invalid division type input
        }
        if(division != null) {
            division.display();
        }
        // If valid division was created, display details

        scanner.close();
        // Close scanner object
    }
}
