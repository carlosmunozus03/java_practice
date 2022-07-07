package PildoraExercises;

import java.util.*;

public class Conditional_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one of the following conditions:\n 1: Square\n 2: Circle\n 3: Triangle\n 4: Rectangle");
        int user_input = scanner.nextInt();

        switch (user_input) {
            case 1:
                Scanner side = new Scanner(System.in);
                System.out.println("Enter a side value");
                int side_value = side.nextInt();
                System.out.printf("The area of square is: %.2f ", Math.pow(side_value, 2));
                break;
            case 2:
                Scanner radio = new Scanner(System.in); // enter radio value
                System.out.println("Enter a radio value");
                int radio_user = radio.nextInt(); // store radio value
                System.out.printf("The area of circle is: %.2f ", Math.PI * Math.pow(radio_user, 2)); // format output in 2 decimals
                break;
            case 3:
                Scanner base = new Scanner(System.in); // enter base value
                System.out.println("Enter a base value");
                int base_user = base.nextInt(); // store base value
                Scanner height = new Scanner(System.in); // enter height value
                System.out.println("Enter a height value");
                int height_user = height.nextInt(); // store user height
                System.out.println("The area of triangle is: " + Math.multiplyExact(height_user, base_user) / 2);
                break;
            case 4:
                Scanner length = new Scanner(System.in);
                System.out.println("Enter a length value");
                int length_user = length.nextInt();
                Scanner width = new Scanner(System.in);
                System.out.println("Enter a width value");
                int width_user = width.nextInt();
                System.out.println("The area of rectangle is: " + Math.multiplyExact(width_user, length_user));
                break;
            default:
                System.out.println("Enter one of the conditions above");
        }
    }
}
//make an application, which allows the user to choose between 4 options to calculate the area of different figures using switch statement