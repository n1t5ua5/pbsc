import javax.swing.*;
import java.util.HashMap;

public class SmartTV {
    public static void main(String[] args) {
        HashMap<String, String> tvShows = new HashMap<>();
        tvShows.put("The Rings of Power", "The epic prequel to the fantasy story of the Lord of the Rings.");
        tvShows.put("South Park", "A witty, cartoon about four boys growing up together in a rural, Colorado town.");
        tvShows.put("Seinfeld", "Four friends living in the same neighborhood in New York City star in a show about 'nothing'.");
        tvShows.put("Golazo", "The latest breakdown of things happening in professional soccer from all around the globe.");
        tvShows.put("Ren & Stimpy", "The cartoon misadventures of two friends; a cat named Stimpy & a dog named Ren.");
        // First I created a map of TV shows with their synopses

        JFrame frame = new JFrame("Smart TV - On Demand");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        // Next I created the JFrame to generic dimensions

        JLabel label = new JLabel("Select a TV Show:");
        JComboBox<String> comboBox = new JComboBox<>(tvShows.keySet().toArray(new String[0]));
        JTextArea synopsisArea = new JTextArea(3, 30);
        synopsisArea.setEditable(false);
        JButton showButton = new JButton("Show Synopsis");
        // The components were created afterwards

        showButton.addActionListener(e -> {
            String selectedShow = (String) comboBox.getSelectedItem();
            synopsisArea.setText(tvShows.get(selectedShow));
            // The action listener waits to retrieve the synopsis once clicked
        });

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(comboBox);
        panel.add(showButton);
        panel.add(new JScrollPane(synopsisArea));
        frame.add(panel);
        // The components are then added to the frame

        frame.setVisible(true);
        // Finally, the frame displays the application
    }
}
