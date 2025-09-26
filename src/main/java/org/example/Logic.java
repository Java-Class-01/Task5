package org.example;

import javax.swing.*;

public class Logic {

    // Clear two text fields
    public void clearFields(JTextField f1, JTextField f2) {
        if (f1 != null) f1.setText("");
        if (f2 != null) f2.setText("");
    }

    // Add two numbers safely
    public int addNumbers(String a, String b) {
        try {
            int x = Integer.parseInt(a.trim());
            int y = Integer.parseInt(b.trim());
            return x + y;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    // Clear a JTextArea
    public void clearTextArea(JTextArea area) {
        if (area != null) area.setText("");
    }

    // Simple string processing (example: reverse text)
    public String processText(String input) {
        if (input == null) return "";
        return new StringBuilder(input).reverse().toString();
    }
}
