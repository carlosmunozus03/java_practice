package LoopsExercises.validate_email;

import javax.swing.*;

public class ValidateEmail_Prompt {
    public static void main(String[] args) {

        boolean at = false;

        String email = JOptionPane.showInputDialog("Enter you email");
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                at = true;
            }
        }
        if (at) {
            JOptionPane.showMessageDialog(null, "Correct email");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect email");
        }
    }
}
//validate email it should have @
