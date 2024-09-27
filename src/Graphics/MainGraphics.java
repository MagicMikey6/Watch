package Graphics;

import javax.swing.*;

public class MainGraphics {
    int number123 = 0;

    public void openWindow() {
        JFrame window = new JFrame("Watch - 1.0"); // Create it with a name
        JButton add1 = new JButton("Add 1"); // Add 1 button
        JButton add10 = new JButton("Add 10"); // Add 10 button
        JButton add100 = new JButton("Add 100"); // Add 100 button
        JButton add1000 = new JButton("Add 1,000"); // Add 1,000 button
        JLabel counter = new JLabel(); // Create new read-only text

        // Buttons
        add1.setBounds(350,150,80,30); //Set size and position
        add1.addActionListener(e -> {
                // Update counter
                number123 += 1;
                counter.setText(Integer.toString(number123));
            });

        add10.setBounds(350,190,80,30); //Set size and position
        add10.addActionListener(e -> {
            // Update counter
            number123 += 10;
            counter.setText(Integer.toString(number123));
        });

        add100.setBounds(350,230,80,30); //Set size and position
        add100.addActionListener(e -> {
            // Update counter
            number123 += 100;
            counter.setText(Integer.toString(number123));
        });

        add1000.setBounds(350,270,100,30); //Set size and position
        add1000.addActionListener(e -> {
            // Update counter
            number123 += 1000;
            counter.setText(Integer.toString(number123));
        });

        // Add the buttons
        window.add(add1);
        window.add(add10);
        window.add(add100);
        window.add(add1000);

        // Text
        counter.setBounds(350,120,80,30); // Set size and position
        counter.setText(Integer.toString(number123)); // Set to 0
        window.add(counter); // Add the label

        // Window
        window.setLayout(null); // Set the layout
        window.setSize(800, 500); // Set the size
        window.setLocationRelativeTo(null); // Open in center
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on Close

        window.setVisible(true); // Open the window
    }
}
