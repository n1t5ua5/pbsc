package divisionProject.src;
public class interDivision extends Division {
    private String country;
    private String language;
    public interDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }
    
    @Override
    public void display() {
        System.out.println("International Division: ");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
    }
}
