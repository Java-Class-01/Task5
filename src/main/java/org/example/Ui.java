package org.example;

import javax.swing.*;

public class Ui {
    private Logic logic;

    public Ui() {
        logic = new Logic(); // Will use Awab's class later
    }

    public void createAndShowGUI() {
        //Austin you will build the tabbed interface here
        JFrame frame = new JFrame("Simple Tabbed Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        // Placeholder content
        JLabel label = new JLabel("UI not implemented yet", SwingConstants.CENTER);
        frame.add(label);

        frame.setVisible(true);
    }
}

