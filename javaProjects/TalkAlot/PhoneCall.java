public abstract class PhoneCall {
    String phoneNumber;
    double price;
    // Phone number & price of call is stored

    public PhoneCall(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.price = 0.0;
        // Constructor initializes phone number & sets price to 0
    }

    public abstract void displayInfo();
    // Abstract method displays call info
}
