package PildoraExercises;

import java.util.Scanner;

public class Array_Prompt_2 {
    public static void main(String[] args) {
        //create a String array with 5 elements (implement array)
        String fruits[] = new String[5];

        //create a for loop than store the prompt user fruits (create array)
        for (int i = 0; i < fruits.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter fruit " + (i + 1));
            fruits[i] = scanner.nextLine(); //store
        }

        //create a for loop for show the user fruits in console (traverse array)
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
