import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton2 extends JFrame {
    private int clickCount = 0; // Track the number of clicks

    public JFrameDisableButton2() {
        super();
        setTitle("JFrame Disable Button 2");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        // create JButton
        JButton button = new JButton("Click Me");
        button.setBounds(100, 50, 100, 30);

        JLabel label = new JLabel("");
        label.setBounds(90, 80, 150, 20);

        // Add ActionListener to Disable the button after a click
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                clickCount++;
                if (clickCount >=8){
                    button.setEnabled(false);
                    label.setText("That's enough!");
                }
            }
        });
        // Add button to JFrame
        add(button);
        add(label);

        // Set JFrame visibility
        setVisible(true);
    }
    public static void main(String[] args) {
        new JFrameDisableButton2();

    }
}
