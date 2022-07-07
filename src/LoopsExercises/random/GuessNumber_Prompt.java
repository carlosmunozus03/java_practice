package LoopsExercises.random;

import javax.swing.*;

public class GuessNumber_Prompt {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100); //cast and store random number in a variable random
        int tries = 0;

        while (random <= 100) {
            tries++;
            int user_input = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 0 and 100"));
            if (user_input <= 100) {
                if (random < user_input) {
                    JOptionPane.showMessageDialog(null, "The number is lower");
                } else if (random > user_input) {
                    JOptionPane.showMessageDialog(null, "The number is higher");
                } else {
                    JOptionPane.showMessageDialog(null, "Correct the number is: " + random + " and you have archived it in: " + tries + " attempts");
                    JOptionPane.showMessageDialog(null, "Have a good one"); // nice bye message
                    break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Enter a valid number");
            }
        }

    }
}
