package LoopsExercises.validate_email;

import java.util.*;

public class ValidateEmail {
    public static void main(String[] args) {

        boolean at = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you Email");
        String email = scanner.nextLine();

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                at = true;
            }
        }
        if (!at) {
            System.out.println("Incorrect Email");
        } else {
            System.out.println("Correct Email");
        }
    }
}
