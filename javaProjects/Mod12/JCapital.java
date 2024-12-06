import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class JCapital {
    public static void main (String[] args) {
        // Create a HashMap to Store countries & their capitals
        HashMap<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("United States", "Washington, D.C.");
        countryCapitals.put("Canada", "Ottowa");
        countryCapitals.put("Republic of Ireland", "Dublin");
        countryCapitals.put("Mexico", "Mexico City");
        countryCapitals.put("Egypt", "Cairo");
        countryCapitals.put("India", "New Dehli");
        countryCapitals.put("Colombia", "Bogota");
        // create the main JFrame
        JFrame frame = new JFrame("Country Capitals");
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Create a JComboBox for the list of countries
        JComboBox<String> countryList = new JComboBox<>(countryCapitals.keySet().toArray(new String [0]));
        // Create a JLbale to display the capital city
        JLabel capitalLabel = new JLabel("Select a country to see its capital.", JLabel.CENTER);
        capitalLabel.setFont(new Font ("Arial", Font.BOLD, 14));
        
        // Add an ActionListener to update the Label when a country is selected
        countryList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String selectedCountry = (String)
                    countryList.getSelectedItem();
                String capital = countryCapitals.get(selectedCountry);
                capitalLabel.setText("Capital of "+ selectedCountry + ": " + capital);
            }
        });

        // Add components to the frame
        frame.add (countryList, BorderLayout.NORTH);
        frame.add (capitalLabel, BorderLayout.CENTER);

        // Make the frame visible
        frame.setVisible(true);
    }
}
