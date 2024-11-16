package divisionProject.src;
import java.util.Scanner;

public class useDivision {
    public static void main(String [] args) {
        Scanner scanner = new scanner(System.in);
        Division division = null;

        System.out.print("Enter division type (Domestic/International): ");
        String divisionType = scanner.nextLine();

        System.out.print("Enter division name: ");
        String.divisionName = scanner.nextLine();

        System.out.println("Enter account number: ");
        int accountNumber = scanner.nextInt();

        if (divisionType.equalsIgnoreCase("International")){
            System.out.print("Enter country: ");
            String country = scanner.nextLine();

            System.out.print("Enter language: ");
            String language = scanner.nextLine();
        }

        division = new interDivision(divisionName, accountNumber, country, language);
        } else if (divisionType.equalsIgnoreCase("Domestic")) {
            System.out.print("Enter state: ");
            String state = scanner.nextLine();

            division = new DomesticDivision(divisionName, accountNumber, state);
        } else {
            System.out.print("Invalid division type entered.");
        }
        if(division != null) {
            division.display();
        }

        scanner.close();
    }
}
