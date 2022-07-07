package LoopsExercises.authentication;

import java.util.*;

public class WhileUsername {
    public static void main(String[] args) {
        String username = "Carlos";
        String key = "";

        while (!username.equals(key)) {
            Scanner username_input = new Scanner(System.in); // initialize Scanner
            System.out.println("Enter you username");  // ask
            String correct_username = username_input.nextLine(); // store answer

            if (correct_username.equals(username)) {
                System.out.println("Correct username welcome " + username);
                break;
            } else {
                System.out.println("Incorrect username");
            }
        }
    }
}
