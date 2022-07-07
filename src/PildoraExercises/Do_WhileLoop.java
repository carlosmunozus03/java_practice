package PildoraExercises;

import javax.swing.*;

public class Do_WhileLoop {
    public static void main(String[] args) {
        String gender = "";
        do {
            gender = JOptionPane.showInputDialog("Enter you genre (M/F)");
        } while (!gender.equalsIgnoreCase("m") && !gender.equalsIgnoreCase("f"));
        if (gender.equalsIgnoreCase("m")) {
            int height = Integer.parseInt(JOptionPane.showInputDialog("Enter you height in cm"));
            int ideal = height - 110;
            JOptionPane.showMessageDialog(null, "You ideal weight is: " + ideal + " Kg for male");
        } else {
            int height = Integer.parseInt(JOptionPane.showInputDialog("Enter you height in cm"));
            int ideal = height - 120;
            JOptionPane.showMessageDialog(null, "You ideal weight is: " + ideal + " Kg for female");
        }
    }
}
//make an application that calculates the ideal weight according to the user's gender using do while loop