package LoopsExercises.validate_email;

import java.util.*;

public class ValidationEmail_2 {
    public static void main(String[] args) {
        int at = 0;
        boolean dot = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you email");
        String email = scanner.nextLine();

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                at++;
            }
            if (email.charAt(i) == '.') {
                dot = true;
            }
        }
        if (at == 1 && dot) {
            System.out.println("Correct email");
        } else {
            System.out.println("Incorrect email");
        }
    }
}
//implement validation with @ and dot