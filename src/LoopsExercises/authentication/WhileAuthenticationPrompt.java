package LoopsExercises.authentication;

import javax.swing.*;

public class WhileAuthenticationPrompt {
    public static void main(String[] args) {
        //username
        String username = "Carlos";

        //password
        String password = "pass123";

        while (username.equals(username) && password.equals(password)) {
            String username_input = JOptionPane.showInputDialog("Enter username");
            String password_input = JOptionPane.showInputDialog("Enter password");

            if (username.equals(username_input) && password.equals(password_input)) {
                JOptionPane.showMessageDialog(null, "Welcome " + username + " !");
                break;
            } else if (!username.equals(username_input)) {
                JOptionPane.showMessageDialog(null, "Enter a correct username");
            } else if (!password.equals(password_input)) {
                JOptionPane.showMessageDialog(null, "Incorrect password");
            }
        }
    }
}
