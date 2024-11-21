public class IncomingPhoneCall extends PhoneCall {

    public IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        this.price = 0.2;
        // Constructor sets price to 2 cents

    }

    @Override
    public void displayInfo() {
        System.out.println("Incoming Call: ");
        System.out.println("PhoneNumber: " + phoneNumber);
        System.out.println("Price: $" + price);
        // Method displaying details of incoming call (phone number & price)
    }
}
