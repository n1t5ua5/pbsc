import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDorm2 {
    public static void main(String[] args) {
        // Create the main JFrame for the application
        JFrame frame = new JFrame("Dorm Options");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        // Create a JTextArea to display the current choices
        JTextArea textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        textArea.setText("No options have been selected.");
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Create checkboxes for dormitory options
        JCheckBox privateRoomBox = new JCheckBox("Private Room");
        JCheckBox internetBox = new JCheckBox("Internet");
        JCheckBox cableTVBox = new JCheckBox("Cable");
        JCheckBox microwaveBox = new JCheckBox("Microwave");
        JCheckBox refrigeratorBox = new JCheckBox("Refrigerator");
        JCheckBox animalFriendlyBox = new JCheckBox("Animal Friendly");

        // Create a JPanel to hold the checkboxes
        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(6, 1));
        optionsPanel.add(privateRoomBox);
        optionsPanel.add(internetBox);
        optionsPanel.add(cableTVBox);
        optionsPanel.add(microwaveBox);
        optionsPanel.add(refrigeratorBox);
        optionsPanel.add(animalFriendlyBox);

        // ActionListener to update the JTextArea with current choices
        ActionListener updateTextArea = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder currentSelections = new StringBuilder();

                if (privateRoomBox.isSelected()) {
                    currentSelections.append("- Private Room\n");
                }
                if (internetBox.isSelected()) {
                    currentSelections.append("- Internet\n");
                }
                if (cableTVBox.isSelected()) {
                    currentSelections.append("- Cable\n");
                }
                if (microwaveBox.isSelected()) {
                    currentSelections.append("- Microwave\n");
                }
                if (refrigeratorBox.isSelected()) {
                    currentSelections.append("- Refrigerator\n");
                }
                if (animalFriendlyBox.isSelected()) {
                    currentSelections.append("- Animal Friendly\n");
                }

                // Update the JTextArea with current choices or a default message
                if (currentSelections.length() == 0) {
                    textArea.setText("No options have been selected.");
                } else {
                    textArea.setText("Currently selected options:\n" + currentSelections.toString());
                }
            }
        };

        // Add ActionListeners to each checkbox
        privateRoomBox.addActionListener(updateTextArea);
        internetBox.addActionListener(updateTextArea);
        cableTVBox.addActionListener(updateTextArea);
        microwaveBox.addActionListener(updateTextArea);
        refrigeratorBox.addActionListener(updateTextArea);
        animalFriendlyBox.addActionListener(updateTextArea);

        // Add components to the frame
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(optionsPanel, BorderLayout.SOUTH);

        // Make the frame visible
        frame.setVisible(true);
    }
}
