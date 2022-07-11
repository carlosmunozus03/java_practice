package PildoraExercises;

import javax.swing.*;

public class Array_Prompt {
    public static void main(String[] args) {
        String[] countries = new String[8];

        for (int i = 0; i < 8; i++) {
            countries[i] = JOptionPane.showInputDialog("Enter country " + (i + 1));
        }

        for (String country : countries) {
            System.out.println(country);
        }
    }
}
