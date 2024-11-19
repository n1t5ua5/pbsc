package divisionProject.src;
public class domesticDivision extends Division {
    private String state;
    // State where division is located

    public domesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber); // Call to parent class constructor
        this.state = state;
        // Constructor to initialize domestic division's details
    }

    @Override
    public void display(){
        System.out.println("Domestic Division:");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        // Override display method to show details specific to Domestic Division
    }
}
