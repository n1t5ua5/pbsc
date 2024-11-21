import java.util.Scanner;

public class DemoPhoneCalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Created scanner from import which allows user input

        System.out.println("Enter call type (Incoming/Outgoing):");
        String callType = scanner.nextLine();
        // User input for type of call (Incoming or Outgoing)

        System.out.println("Enter phone number:");
        String phoneNumber = scanner.nextLine();
        // User input for phone number

        if (callType.equals("Incoming")) {
            IncomingPhoneCall incomingCall = new IncomingPhoneCall(phoneNumber);
            incomingCall.displayInfo();
            // If statement which handles incoming call
        } else if (callType.equals("Outgoing")) {
            System.out.println("Enter call duration in minutes:");
            int minutes = scanner.nextInt();
            OutgoingPhoneCall outgoingCall = new OutgoingPhoneCall(phoneNumber, minutes);
            outgoingCall.displayInfo();
            // else if statement handling the outgoing call
        } else {
            System.out.println("Invalid call type.");
            // Else statements handles invalid call types (it's case sensitive)
        }

    scanner.close();
    // Closers scanner to prevent data leaks
    }
}
