package PildoraExercises;

public class Array_Random_Number {
    public static void main(String[] args) {
        //initialize array
        int[] random_numbers = new int[75];

        //create array
        for (int i = 0; i < random_numbers.length; i++) {
            random_numbers[i] = (int) (Math.random() * 100);
        }

        //traveling array
        for (int random_number : random_numbers) {
            System.out.println(random_number);
        }
    }
}
