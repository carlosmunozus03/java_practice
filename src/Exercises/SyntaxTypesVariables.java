package Exercises;

public class SyntaxTypesVariables {
    public static void main(String[] args) {
        int myFavoriteNumber = 42;
        String myString = "Favorite String";
        long myNumber;
        myNumber = (long) 3.1415; //casting
        myNumber = 123L;
        myNumber = 123;
        myNumber = (long) 3.14; //casting
        System.out.println(myNumber);
        System.out.println("The max value for Integer is = " + Integer.MAX_VALUE);
    }
}
