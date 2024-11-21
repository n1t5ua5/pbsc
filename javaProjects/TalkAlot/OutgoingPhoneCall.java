public class OutgoingPhoneCall extends PhoneCall {
    int callMinutes;
    // Duration of minutes from call is stored

    public OutgoingPhoneCall(String phoneNumber, int callMinutes) {
        super(phoneNumber);
        this.callMinutes = callMinutes;
        this.price = 0.04 * callMinutes;
        // Constructor sets phone number, call minutes & calculates the price

    }

    @Override
    public void displayInfo() {
        System.out.println("Outgoing Call: ");
        System.out.println("PhoneNumber: " + phoneNumber);
        System.out.println("Minutes: " + callMinutes);
        System.out.println("Total Price: $" + price);
        // Method displaying details (number, minutes & price) of outgoing call

    }
}
