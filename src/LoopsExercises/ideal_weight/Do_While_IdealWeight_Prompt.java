package LoopsExercises.ideal_weight;

import javax.swing.*;

public class Do_While_IdealWeight_Prompt {
    public static void main(String[] args) {
        String gender = "";
        do {
            gender = JOptionPane.showInputDialog("Enter you gender (M / F)");
        } while (!gender.equalsIgnoreCase("m") && !gender.equalsIgnoreCase("f"));

        if (gender.equalsIgnoreCase("m")) {
            int height = Integer.parseInt(JOptionPane.showInputDialog("Enter you height in cm"));
            double weight = Math.pow(height, 2) * 0.0022;
            JOptionPane.showMessageDialog(null, "You ideal weight is: " + String.format("%.2f", weight) + " Kg for a male");
        } else {
            int height = Integer.parseInt(JOptionPane.showInputDialog("Enter you height in cm"));
            double weight = Math.pow(height, 2) * 0.0021;
            JOptionPane.showMessageDialog(null, "You ideal weight is: " + String.format("%.2f", weight) + " Kg for a female");
        }
    }
}
