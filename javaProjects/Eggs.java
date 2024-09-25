import java.util.Scanner;

public class Eggs {

    public static void main(String[] args) {
        // constraints for the prices
        final double DOZEN_PRICE =  3.25;
        final double INDIVIDUAL_PRICE = 0.45;
        final int DOZEN_COUNT = 12;

        // Create a scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of eggs
        System.out.println("Enter the number of eggs for your order: ");

        int eggCount = input.nextInt();

        // Calculate the number of dozens & leftovers
        int dozens = eggCount / DOZEN_COUNT;
        int looseEggs = eggCount % DOZEN_COUNT;

        // Calculate the total cost
        double totalCost = (dozens * DOZEN_PRICE)*(looseEggs * INDIVIDUAL_PRICE);

        // Output the full explainations of the order & total price
        System.out.printf("You ordered %d eggs.%n", eggCount);
        System.out.printf("That's %d loose eggs at $%.2f per donzen ", dozens, DOZEN_PRICE);
        System.out.printf("And %d loose eggs at %.2f cents each.%n", looseEggs, INDIVIDUAL_PRICE);
        System.out.printf("For a total of $%.2f.%n ", totalCost);

        // Close imported scanner
        input.close();

    }

}
