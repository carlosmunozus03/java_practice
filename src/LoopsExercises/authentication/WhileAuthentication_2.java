package LoopsExercises.authentication;

import java.util.*;

public class WhileAuthentication_2 {
    public static void main(String[] args) {
        //username and password
        String username = "Buddy";
        String password = "meow";

        while (username.equals(username) && password.equals(password)) {
            Scanner username_input = new Scanner(System.in);
            System.out.println("Enter username");
            String username_confirmation = username_input.nextLine();
            Scanner password_input = new Scanner(System.in);
            System.out.println("Enter password");
            String password_confirmation = password_input.nextLine();

            if (username.equals(username_confirmation) && password.equals(password_confirmation)) {
                System.out.println("Welcome user: " + username);
                break;
            } else if (!username.equals(username_confirmation)) {
                System.out.println("Username not valid");
            } else if (!password.equals(password_confirmation)) {
                System.out.println("Incorrect password");
            }
        }
    }
}
