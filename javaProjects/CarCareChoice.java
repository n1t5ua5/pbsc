import java.util.Scanner;
public class CarCareChoice {
    public static void main(String[] args) {
        // create a scanner object for user input
        Scanner input = new Scanner(System.in);
        // List of available services & their corresponding prices
        String[]services = {"oil change", "tire rotation", "battery check", "brake check"};
        int[] prices = {25, 22, 15, 5};
        // Display the available services
        System.out.println("Welcome to chapa's Car Care Shop!");
        System.out.println("Welcome to chapa's Car Care Shop!");
        for (String service : services) {
            System.out.println(service);
        }
            // Prompt the user to enter a service
            System.out.println("Please enter a service from the list: ");
            String userChoice = input.nextLine().toLowerCase();
            // Determine & display the price or show an error if the service is invalid
            boolean validChoice = false;
            for (int i = 0; i < services.length; i++) {
                if (userChoice.equals(services[i])) {
                    System.out.println("You have selected " + services[i] + "from the ");
                    System.out.println("The price is: $" + prices[i]);
                    validChoice = true;
                    break;
                }
            }
            // if the service is not valid; display an error message
            if (!validChoice) {
                System.out.println("Error: invalid service entered. Pleease select a valid option");
            }
        }
    }
