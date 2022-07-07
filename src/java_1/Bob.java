package java_1;

import java.util.*;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Hi this is Bob tell me something");
            String user_input = scanner.nextLine();

            if (user_input.endsWith("?")) {
                System.out.println("Sure");
            } else if (user_input.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (user_input.isBlank()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }

            Scanner user_continue = new Scanner(System.in);
            System.out.println("Do you want still talking (Y/N)");
            choice = user_continue.nextLine();
        } while (choice.equalsIgnoreCase("y"));
        System.out.println("Bye user");
    }
}
//Create a class named Bob with a main method for the following exercise.
//
//Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//He answers 'Whatever.' to anything else.
//Write the Java code necessary so that a user of your command line application can have a conversation with Bob.