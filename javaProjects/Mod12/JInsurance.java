import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JInsurance {
    public static void main (String[] args) {
        JFrame frame = new JFrame("Insurance Options");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        // Created a new main JFrame application

        ButtonGroup insuranceGroup = new ButtonGroup();
        JRadioButton hmoButton = new JRadioButton("HMO($200/Month)");
        JRadioButton ppoButton = new JRadioButton("PPO($600/Month)");
        insuranceGroup.add(hmoButton);
        insuranceGroup.add(ppoButton);
        // Create a ButtonGroup for the insurance type (HMMO or PPO)

        JCheckBox dentalBox = new JCheckBox("Dental Insurance($75/Month)");
        JCheckBox visionBox = new JCheckBox("Vision Insurance($20/Month)");
        // Create JCheckBoxes for dental & vision coverage

        JTextField displayField = new JTextField(30);
        displayField.setEditable(false);
        // Create JTextField to displaye selected options & prices

        ActionListener updateField = e -> {
            StringBuilder displayText = new StringBuilder();
            int totalCost = 0;
            // Add ActionListeners to insurance options
                if (hmoButton.isSelected()){
                    displayText.append("HMO ($200/month)\n");
                    totalCost += 200;
                } else if (ppoButton.isSelected()){
                    displayText.append("PPO($600/month)\n");
                    totalCost += 600;
                }
                // Check HMO or PPO selection
                if (dentalBox.isSelected()){
                    displayText.append("Dental ($75/month)\n");
                    totalCost += 75;
                }
                if (visionBox.isSelected()) {
                    displayText.append("Vision Insurance($20/Month)\n");
                    totalCost += 20;
                }
                // Check Dental & Vision option
                if(displayText.length() > 0) {
                    displayText.append("Total Cost: $").append(totalCost).append("/month");
                    displayField.setText(displayText.toString());
                } else {
                    displayField.setText("");
                }
                // Update display field
        };

        hmoButton.addActionListener(updateField);
        ppoButton.addActionListener(updateField);
        dentalBox.addActionListener(updateField);
        visionBox.addActionListener(updateField);
        // ActionListeners are updated

        frame.add(new JLabel("Selected Insurance Options:"));
        frame.add(hmoButton);
        frame.add(ppoButton);
        frame.add(dentalBox);
        frame.add(visionBox);
        frame.add(displayField);
        frame.setVisible(true);
        // Frames display selected options
    }
}
