package PildoraExercises;

public class Array_2Dimensions_2 {
    public static void main(String[] args) {
        // array 2D initialized int [][] vName=new int[4][5];

        int[][] array_2D = {
                {21, 25, 74, 84, 54},
                {15, 87, 62, 14, 33},
                {55, 58, 41, 77, 63},
                {32, 22, 20, 10, 63}
        };

        //forEach

        for (int[] oneD : array_2D) {
            System.out.println();
            for (int twoD : oneD) {
                System.out.print(twoD + " ");
            }
        }
    }
}
