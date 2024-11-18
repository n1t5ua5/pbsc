import java.util.Scanner;
// Main class to demonstrate the functionality of different types of runners.
public class DemoRunners {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Runner runner = null;
        System.out.print("Enter the type of Runner (Machine, Athlete, PoliticalCandidate): ");
        String type = scanner.nextLine();
        // Prompts the user to enter the type of runner
        // Determine the type of runner based on the user's input
        switch (type.toLowerCase()){
            case "machine":
                runner = new Machine();
                break;
            case "athlete":
                runner = new Athlete();
                break;
            case "politicalcandidate":
                runner = new PoliticalCandidate();
                break;
            default:
                System.out.println("Invalid type entered.");
                break;
                // Create machine, athlete & pol. candidate instance, then handle invalid input
        }
        if(runner != null) {
            runner.run();
            // If a valid Runner object was created, call its run method
        }
        scanner.close();
    }
}
