package PildoraExercises;

public class Array_1 {
    public static void main(String[] args) {

        // declaration and add individual value
        int[] my_array = new int[5];
        my_array[0] = 21;
        my_array[1] = 52;
        my_array[2] = 3;
        my_array[3] = 82;
        my_array[4] = -9;

        for (int i = 0; i < my_array.length; i++) {
            System.out.println("Index " + i + " = " + my_array[i]);
        }

        // declaration and initialized array
        int[] my_array_2 = {2, 41, 57, 8, 4, 9, 6, 6, 6, 5, 1, 21};
        for (int i = 0; i < my_array_2.length; i++) {
            System.out.println("Index " + i + " element " + my_array_2[i]);
        }
    }
}
