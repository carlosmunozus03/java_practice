package Exercises;

import java.util.*;

public class ConsoleExercises_Bonus {
    public static void main(String[] args) {

        //you can reformat the code for accept decimals numbers

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a length of the perimeter of the classroom");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the perimeter of the classroom");
        double width = scanner.nextDouble();
        System.out.println("Enter the height of the perimeter of the classroom");
        double height = scanner.nextDouble();
        System.out.println("You enter length: " + length + " width: " + width + " height: " + height);
        //some mathematical operations
        double perimeter = length * 2 + width * 2;
        double area = length * width;
        double volume = length * height * width;
        System.out.println("\nLet me calculate...");
        System.out.format("Perimeter: %.2f \n", perimeter);
        System.out.format("Area: %.2f \n", area);
        System.out.format("Volume: %.2f \n", volume);
        scanner.useDelimiter("\n");
    }
}
//can use Double.parseDouble() to transform String to double