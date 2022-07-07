package Exercises;

public class MethodsExercises {
    //Addition
    public static int add(int number_1, int number_2) {
        int result = Math.addExact(number_1, number_2);
        return result;
    }

    //Subtraction
    public static int subtraction(int number_1, int number_2) {
        int result = Math.subtractExact(number_1, number_2);
        return result;
    }

    //Multiplication
    public static int multiplication(int number_1, int number_2) {
        int result = Math.multiplyExact(number_1, number_2);
        return result;
    }

    //Division
    public static int division(int number_1, int number_2) {
        int result = Math.floorDiv(number_1, number_2);
        return result;
    }

    //Module
    public static int module(int number_1, int number_2) {
        int result = number_1 % number_2;
        return result;
    }

    //Call all methods
    public static void main(String[] args) {

        System.out.println("The result of addition method is: " + add(15, 5));
        System.out.println("The result of subtraction method is: " + subtraction(15, 4));
        System.out.println("The result of multiplication method is: " + multiplication(5, 6));
        System.out.println("The result of division method is: " + division(8, 2));
        System.out.println("The result of module method is: " + module(4, 3));
    }
}
