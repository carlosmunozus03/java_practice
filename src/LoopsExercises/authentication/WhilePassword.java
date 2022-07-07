package LoopsExercises.authentication;

import java.util.*;

public class WhilePassword {
    public static void main(String[] args) {
        String password = "Pa$w0rd";
        String key = "";

        while (!password.equals(key)) {
            Scanner user_password = new Scanner(System.in);
            System.out.println("Enter your password");
            String correct_password = user_password.nextLine();

            if (!correct_password.equals(password)) {
                System.out.println("Incorrect password");
            } else {
                System.out.println("Correct password welcome!");
                break;
            }
        }
    }
}
