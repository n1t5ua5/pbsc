import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPhotoFrame {
    public static void main(String[] args) {
        // Create the main JFrame for the application
        JFrame frame = new JFrame("Paula's Portraits");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        // Create a JLabel to display instructions
        JLabel instructionsLabel = new JLabel("Please select subject & session location:");
        instructionsLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Create a JLabel to display the computed price
        JLabel priceLabel = new JLabel("Total Price: $0", SwingConstants.CENTER);
        priceLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // Create ButtonGroups for mutually exclusive options
        ButtonGroup subjectGroup = new ButtonGroup();
        ButtonGroup locationGroup = new ButtonGroup();

        // Create radio buttons for portrait subjects
        JRadioButton onePersonButton = new JRadioButton("One Person ($40)");
        JRadioButton twoOrMoreButton = new JRadioButton("Two or More People ($75)");
        JRadioButton petButton = new JRadioButton("Pet ($95)");
        subjectGroup.add(onePersonButton);
        subjectGroup.add(twoOrMoreButton);
        subjectGroup.add(petButton);

        // Create radio buttons for session locations
        JRadioButton studioButton = new JRadioButton("In-Studio ($0)");
        JRadioButton onLocationButton = new JRadioButton("On-Location (+$90)");
        locationGroup.add(studioButton);
        locationGroup.add(onLocationButton);

        // Create a JPanel to hold the subject options
        JPanel subjectPanel = new JPanel();
        subjectPanel.setBorder(BorderFactory.createTitledBorder("Select Subject"));
        subjectPanel.setLayout(new GridLayout(3, 1));
        subjectPanel.add(onePersonButton);
        subjectPanel.add(twoOrMoreButton);
        subjectPanel.add(petButton);

        // Create a JPanel to hold the location options
        JPanel locationPanel = new JPanel();
        locationPanel.setBorder(BorderFactory.createTitledBorder("Select Location"));
        locationPanel.setLayout(new GridLayout(2, 1));
        locationPanel.add(studioButton);
        locationPanel.add(onLocationButton);

        // Create a JPanel to organize options panels
        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(1, 2));
        optionsPanel.add(subjectPanel);
        optionsPanel.add(locationPanel);

        // ActionListener to compute and display the total price
        ActionListener computePrice = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totalPrice = 0;

                // Determine subject price
                if (onePersonButton.isSelected()) {
                    totalPrice += 40;
                } else if (twoOrMoreButton.isSelected()) {
                    totalPrice += 75;
                } else if (petButton.isSelected()) {
                    totalPrice += 95;
                }

                // Determine location price
                if (onLocationButton.isSelected()) {
                    totalPrice += 90;
                }

                // Update price label
                priceLabel.setText("Total Price: $" + totalPrice);
            }
        };

        // Add ActionListeners to radio buttons
        onePersonButton.addActionListener(computePrice);
        twoOrMoreButton.addActionListener(computePrice);
        petButton.addActionListener(computePrice);
        studioButton.addActionListener(computePrice);
        onLocationButton.addActionListener(computePrice);

        // Add components to the frame
        frame.add(instructionsLabel, BorderLayout.NORTH);
        frame.add(optionsPanel, BorderLayout.CENTER);
        frame.add(priceLabel, BorderLayout.SOUTH);

        // Make the frame visible
        frame.setVisible(true);
    }
}
