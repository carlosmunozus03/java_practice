package LoopsExercises.random;

import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {
        // guess a number between 0 and 100

        int random = (int) (Math.random() * 100);
        int tries = 0;

        while (random < 101) {
            tries++;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number between 0 and 100");
            int user_number = scanner.nextInt(); // store

            if (user_number <= 100) {
                if (random < user_number) {
                    System.out.println("The number is lower");
                } else if (random > user_number) {
                    System.out.println("The number is higher");
                } else {
                    System.out.println("Correct the number is: " + random + " and you have archived in: " + tries + " attempts");
                    break;
                }
            } else {
                System.out.println("Enter a valid number");
            }
        }
    }
}
