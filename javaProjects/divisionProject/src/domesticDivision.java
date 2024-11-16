package divisionProject.src;

public class domesticDivision extends divisionAbstract {

    private String state;

    public domesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display(){
        System.out.println("Domestic Division: ");
        System.out.println("Division Name: ");
        System.out.println("");
        System.out.println(state);
    }
}
