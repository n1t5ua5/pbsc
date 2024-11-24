import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote2 extends JFrame {
    public JBookQuote2() {
        // Create JFrame
        setTitle("Book Quote with Title");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Add quote to the frame
        JLabel quote = new JLabel("<html> The opening sentence of my favorite book:<br> 'It was the best of times, it was the worst of times...'<html>");
        quote.setBounds(20, 20, 350, 100);
        add(quote);

        // Add button
        JButton button = new JButton("Show Book Title");
        button.setBounds(120, 100, 150, 30);
        add(button);

        // Add label for the book title
        JLabel title = new JLabel("");
        title.setBounds(120, 140, 250, 20);
        add(title);

        // Button ActionListener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                title.setText("A Tale of Two Cities by Charles Dickinson.");
            }
        });

        // set visibility
        setVisible(true);
    }

    public static void main(String[] args) {
            new JBookQuote2();
    }
}
