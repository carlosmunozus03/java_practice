package java_1;

import java.util.*;

public class ConsoleIO_Input {
    public static void main(String[] args) {

        //Scanner class as input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        System.out.println("You enter this sentence: " + sentence);
    }
}
