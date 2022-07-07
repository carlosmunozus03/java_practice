package java_1;

public class Arithmetic {
    public static void main(String[] args) {
        //declaration and initialization
        int myNumber = 12 + 12 * 2;
        System.out.println("myNumber: " + myNumber);
        myNumber += 9;
        System.out.println("myNumber = " + myNumber);
        // equivalent to
        myNumber = myNumber + 9;
        System.out.println("myNumber: " + myNumber);
    }
}
