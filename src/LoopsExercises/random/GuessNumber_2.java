package LoopsExercises.random;

import java.util.*;

public class GuessNumber_2 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 15);
        int tries = 0;

        while (random < 16) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number between 0 and 15");
            int user_number = scanner.nextInt(); // store

            if (user_number >= 0 && user_number < 16) { // important! parameter
                tries++;
                if (random < user_number) {
                    System.out.println("The number is lower");
                } else if (random > user_number) {
                    System.out.println("The number is higher");
                } else {
                    System.out.println("Correct! the number is: " + random + " and you have archived it in: " + tries + " attempts");
                    break;
                }
            } else {
                System.out.println("Enter a valid number");
            }
        }
    }
}
