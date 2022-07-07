package PildoraExercises;

import java.util.*;

public class WhileRandomNumber {
    public static void main(String[] args) {
        //Generate the random number and store in a variable as integer

        int random = (int) (Math.random() * 100); //cast from double to integer
        Scanner user_input = new Scanner(System.in);
        int number = 0;
        int tries = 0;

        while (random != number) {
            tries++; //reassigned variable
            System.out.println("Enter a number between 0 and 100");
            int user_number = user_input.nextInt(); //store

            if (random == user_number) {
                System.out.println("Correct, the number is: " + random + " and you have archived it in " + tries + " attempts");
                break;
            } else if (random < user_number) {
                System.out.println("The number is lower");
            } else if (random > user_number) {
                System.out.println("The number is higher");
            }
        }
    }
}
//create an application which generates a random number between 0 and 100 as integer. It must be able to tell if the number is higher or lower than the generated number, and it must show the number of tries.
