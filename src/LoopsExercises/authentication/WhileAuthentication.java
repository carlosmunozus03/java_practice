package LoopsExercises.authentication;

import java.util.*;

public class WhileAuthentication {
    public static void main(String[] args) {
        // username
        String username = "Carlos123";
        String empty_user = "";

        //password
        String password = "Pa$w0rd";
        String empty_password = "";

        while (!username.equals(empty_user) && !password.equals(empty_password)) {
            //enter username
            Scanner username_input = new Scanner(System.in);
            System.out.println("Enter you username");
            String correct_username = username_input.nextLine(); //store

            //enter password
            Scanner password_input = new Scanner(System.in);
            System.out.println("Enter you password");
            String correct_password = password_input.nextLine(); //store

            if (username.equals(correct_username) && password.equals(correct_password)) {
                System.out.println("Welcome " + username + " nice to see you again!");
                break;
            } else if (!username.equals(correct_username)) {
                System.out.println("Enter valid username");
            } else if (!password.equals(correct_password)) {
                System.out.println("Incorrect password");
            }
        }
    }
}
