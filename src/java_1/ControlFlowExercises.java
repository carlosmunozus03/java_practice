package java_1;

import java.util.*;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }


//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 10);


//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);


//        long i = 2L;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1_000_000);


//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }


//        for (long i = 2L; i < 1_000_000; i *= i) {
//            System.out.println(i);
//        }


        //FizzBuzz
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }


        //Display a table of powers.

//        Scanner scanner = new Scanner(System.in);
//        String answer;
//
//        do {
//
//            System.out.println("What number do you like to grow up to?");
//            int user_number = scanner.nextInt();
//            System.out.println("");
//            System.out.println("Here is the Table");
//            System.out.println("");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for (int i = 1; i <= user_number; i++) {
//                System.out.println(i + "      | " + (int) (Math.pow(i, 2)) + "       |" + "  " + (int) (Math.pow(i, 3)));
//            }
//
//            //ask if the user want to continue
//            Scanner question = new Scanner(System.in);
//            System.out.println("Do you wnt to continue (Y/N)");
//            answer = question.nextLine(); //resigned value
//
//        } while (answer.equalsIgnoreCase("y"));
//        System.out.println("Bye bye");


        //Convert given number grades into letter grades.

        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Enter a numerical grade between 0 and 100");
            int user_number = scanner.nextInt();

            if (user_number == 99 || user_number == 100) {
                System.out.println("Grade is: A+");
            } else if (user_number < 99 && user_number > 87) {
                System.out.println("Grade is: A");
            } else if (user_number < 88 && user_number > 79) {
                System.out.println("Grade is: B");
            } else if (user_number < 80 && user_number > 66) {
                System.out.println("Grade is: C");
            } else if (user_number < 67 && user_number > 59) {
                System.out.println("Grade is: D");
            } else {
                System.out.println("Grade is: F");
            }

            Scanner question = new Scanner(System.in);
            System.out.println("Do you want to continue (Y/N)");
            choice = question.nextLine();

        } while (choice.equalsIgnoreCase("y"));
        System.out.println("Bye User");

    }
}
