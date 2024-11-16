import java.util.Scanner;

public class DemoRunners {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Runner runner = null;
        System.out.print("Enter the type of Runner (Machine, Athlete, PoliticalCandidate): ");
        String type = scanner.nextLine();

        switch (type.toLowerCase()){
            case "machine":
                runner = new Machine();
                break;
            case "athelete":
                runner = new Athlete();
                break;
            case "politicalcandidate":
                runner = new PoliticalCandidate();
                break;
                Default:
                System.out.println("Invalid type entered.");
                break;
        }
        if(runner != null) {
            runner.run();
        }
        scanner.close();
    }
}
