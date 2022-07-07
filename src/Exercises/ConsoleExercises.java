package Exercises;

import java.util.*;

public class ConsoleExercises {
    public static void main(String[] args) {

        //using format whit 2 decimals %.2f
        double pi = 3.14159;
        System.out.format("%.2f\n", pi);
        System.out.println("Explore the Scanner Class.");

        //using Scanner Class
        Scanner user_input = new Scanner(System.in);
        System.out.println("Hello enter a integer number please"); // give the user instruction to do
        int user_number = user_input.nextInt(); // store the user number in a variable
        System.out.println("You enter the number: " + user_number); // show the user it's number in the console

        //request 3 words
        Scanner user_words = new Scanner(System.in);
        System.out.println("Now... please enter 1 word"); //
        String user_word_1 = user_words.next();
        System.out.println("Enter you second word");
        String user_word_2 = user_words.next();
        System.out.println("Finally enter you third word");
        String user_word_3 = user_words.next();
        System.out.printf("You enter this words:\n %s\n %s\n %s\n", user_word_1, user_word_2, user_word_3);

        //request a sentence
        Scanner user_sentence = new Scanner(System.in);
        System.out.println("Well done! how enter a sentence");
        String user_input_sentence = user_sentence.nextLine();
        System.out.println("You enter the following sentence: " + user_input_sentence);

        //Calculate the perimeter and area of the classrooms.
        Scanner perimeter = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Enter the length of the perimeter");
        String length = perimeter.nextLine();
        Integer.parseInt(length); //request using parseInt() method this change from String to Integer value
        System.out.println("Enter the width of the perimeter");
        String width = perimeter.nextLine();
        Integer.parseInt(width);
        System.out.println(" You enter this:\n Length: " + length + " Width: " + width);
        //Some mathematical operations to calculate area and perimeter
        int result_perimeter = Integer.parseInt(length) * 2 + Integer.parseInt(width) * 2;
        int result_area = Integer.parseInt(length) * Integer.parseInt(width);
        System.out.println("The perimeter is: " + result_perimeter);
        System.out.println("The area is: " + result_area);
    }
}