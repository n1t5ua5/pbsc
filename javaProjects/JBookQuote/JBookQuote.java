import javax.swing.*;

public class JBookQuote extends JFrame {
    public JBookQuote() {
        // Create JFrame
        setTitle("Book Quote");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Add quote to the frame
        JLabel quote = new JLabel("<html>The opening sentence of my favorite book:<br>'It was the best of times, it was the worst of times...'<html>");
        quote.setBounds(20, 20, 350, 100);
        add(quote);

        // set visibility
        setVisible(true);
    }

    public static void main(String[] args) {
        new JBookQuote();
    }
}
