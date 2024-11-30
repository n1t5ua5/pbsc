import javax.swing.*;

public class JVacationRentalSwing {
    public static void main(String[] args) {
        int parksidePrice = 600, poolsidePrice = 750, lakesidePrice = 825;
        int extraBedroomCost = 75, mealsCost = 200;
        // Initialized the base prices

        JFrame frame = new JFrame("Lambert's Vacation Rental Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        // Created the frame for the application

        ButtonGroup locationGroup = new ButtonGroup();
        JRadioButton parkside = new JRadioButton("Parkside ($600)");
        JRadioButton poolside = new JRadioButton("Poolside ($750)");
        JRadioButton lakeside = new JRadioButton("Lakeside ($825)");
        locationGroup.add(parkside);
        locationGroup.add(poolside);
        locationGroup.add(lakeside);
        // First button for locations is created

        ButtonGroup bedroomGroup = new ButtonGroup();
        JRadioButton oneBedroom = new JRadioButton("1 Bedroom");
        JRadioButton twoBedrooms = new JRadioButton("2 Bedrooms (+$75)");
        JRadioButton threeBedrooms = new JRadioButton("3 Bedrooms (+$150)");
        bedroomGroup.add(oneBedroom);
        bedroomGroup.add(twoBedrooms);
        bedroomGroup.add(threeBedrooms);
        // Next a second button is made for bedroom selection

        JCheckBox mealsCheckbox = new JCheckBox("Include meals (+$200)");
        // A meals included checkbox is the third button

        JLabel totalCostLabel = new JLabel("Total rental cost: ");
        JButton calculateButton = new JButton("Calculate Total Cost");
        // The total cost button is included afterwards

        frame.add(new JLabel("Select a location:"));
        frame.add(parkside);
        frame.add(poolside);
        frame.add(lakeside);
        frame.add(new JLabel("Select bedrooms:"));
        frame.add(oneBedroom);
        frame.add(twoBedrooms);
        frame.add(threeBedrooms);
        frame.add(mealsCheckbox);
        frame.add(calculateButton);
        frame.add(totalCostLabel);
        // Components are then added to the frame

        calculateButton.addActionListener(e -> {
            int locationPrice = parkside.isSelected() ? parksidePrice :
                                poolside.isSelected() ? poolsidePrice :
                                lakeside.isSelected() ? lakesidePrice : 0;

            int bedroomCost = twoBedrooms.isSelected() ? extraBedroomCost :
                              threeBedrooms.isSelected() ? extraBedroomCost * 2 : 0;

            int totalCost = locationPrice + bedroomCost + (mealsCheckbox.isSelected() ? mealsCost : 0);
            totalCostLabel.setText("Total rental cost: $" + totalCost);
            // Finally the button actions are all calculated together
        });

        frame.setVisible(true);
        // The application frame is displayed
    }
}
