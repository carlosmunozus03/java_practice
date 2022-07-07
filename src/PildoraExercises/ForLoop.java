package PildoraExercises;

import javax.swing.*;

public class ForLoop {
    public static void main(String[] args) {

        boolean at = false;
        String email = JOptionPane.showInputDialog("Enter you email");
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                at = true;
            }
        }
        if (at) {
            System.out.println("Correct email");
        } else {
            System.out.println("Incorrect email");
        }
    }
}
//validate an email if it has @ character