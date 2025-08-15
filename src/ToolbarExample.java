import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolbarExample {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Toolbar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a toolbar
        JToolBar toolbar = new JToolBar();

        // Create buttons with icons (ensure you have these images)
        JButton button1 = new JButton(new ImageIcon("image1.png")); // Replace with your image path
        JButton button2 = new JButton(new ImageIcon("image2.png")); // Replace with your image path
        JButton button3 = new JButton(new ImageIcon("image3.png")); // Replace with your image path

        // Create a label to display the selected button
        JLabel label = new JLabel("Selected: None", SwingConstants.CENTER);

        // Action listener for buttons
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonName = "";
                JButton source = (JButton) e.getSource();

                if (source == button1) {
                    buttonName = "Button 1";
                } else if (source == button2) {
                    buttonName = "Button 2";
                } else if (source == button3) {
                    buttonName = "Button 3";
                }

                label.setText("Selected: " + buttonName);
                System.out.println("Selected: " + buttonName); // Console output
            }
        };

        // Add action listeners
        button1.addActionListener(actionListener);
        button2.addActionListener(actionListener);
        button3.addActionListener(actionListener);

        // Add buttons to the toolbar
        toolbar.add(button1);
        toolbar.add(button2);
        toolbar.add(button3);

        // Add components to the frame
        frame.getContentPane().add(toolbar, BorderLayout.NORTH);
        frame.getContentPane().add(label, BorderLayout.SOUTH);

        // Set frame visibility
        frame.setVisible(true);
    }
}