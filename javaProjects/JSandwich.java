import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JSandwich {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sublime Sandwich Shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);
        // First I created window for Sublime Sandwich Shop app

        JLabel ingredientLabel = new JLabel("Please choose main ingredient:");
        String[] ingredients = {"Tofu ($3)", "Seitan ($4)", "Tempeh ($5)"};
        JComboBox<String> ingredientBox = new JComboBox<>(ingredients);
        // Then I created a label & dropdown (combo) to select main ingredient

        JLabel breadLabel = new JLabel("Next, please choose bread type:");
        String[] breads = {"Whole Wheat ($1)", "Multigrain ($1)", "Sourdough ($1)"};
        JComboBox<String> breadBox = new JComboBox<>(breads);
        // Next I created a label & dropdown so user can select which bread they want

        JButton calculateButton = new JButton("Calculate Price");
        JLabel totalLabel = new JLabel("Total Price: $0");
        // After I created a label with a button to show calculated price

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ingredientCost = 0;
                int breadCost = 0;
                // Action listener waits for the calculate button to be clicked

                if (ingredientBox.getSelectedItem().toString().contains("Tofu")) {
                    ingredientCost = 3;
                } else if (ingredientBox.getSelectedItem().toString().contains("Seitan")) {
                    ingredientCost = 4;
                } else if (ingredientBox.getSelectedItem().toString().contains("Tempeh")) {
                    ingredientCost = 5;
                    // If, else if & else logic performed to get ingredient price based on user input
                }

                if (breadBox.getSelectedItem().toString().contains("Whole Wheat")) {
                    breadCost = 1;
                } else if (breadBox.getSelectedItem().toString().contains("Multigrain")) {
                    breadCost = 1;
                } else if (breadBox.getSelectedItem().toString().contains("Sourdough")) {
                    breadCost = 1;
                    // Same logic is performed except with bread type, not main ingredient
                }

                int totalPrice = ingredientCost + breadCost;
                totalLabel.setText("Total Price: $" + totalPrice);
                // Total price is calculated & displayed on label
            }
        });

        JPanel panel = new JPanel();
        panel.add(ingredientLabel);
        panel.add(ingredientBox);
        panel.add(breadLabel);
        panel.add(breadBox);
        panel.add(calculateButton);
        panel.add(totalLabel);
        // Created panel to hold store J components

        frame.add(panel);
        frame.setVisible(true);
        // Lastly, panel is added to frame & displayed
    }
}
