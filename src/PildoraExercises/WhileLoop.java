package PildoraExercises;

import java.util.*;

public class WhileLoop {
    public static void main(String[] args) {
        String user_password = "User123";
        String password = ""; // empty string to compare with the user_password

        while (!user_password.equals(password)) { // while user_password and password are not equal join the buckle!
            Scanner key = new Scanner(System.in);  // initialized input (can use jOptionPane.showInputDialog() method too)
            System.out.println("Enter you password");
            String user_key = key.nextLine();  // store the user_key input

            if (!user_key.equals(user_password)) {
                System.out.println("Incorrect password");
            } else {
                System.out.println("Correct password");
                break;
            }
        }
    }
}
//Create a program that prompts a user for a password using a while loop