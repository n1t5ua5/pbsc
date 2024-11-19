package divisionProject.src;
public abstract class Division {
    // Division class is created

    protected String divisionName;
    protected int accountNumber;
    // Name of the division & the account number associated with it

    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
        // Constructor to initialize common attributes of a division

    }

    public abstract void display();
    // Abstract method to be implemented by subclasses for displaying division details
}
