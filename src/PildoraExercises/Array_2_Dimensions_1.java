package PildoraExercises;

public class Array_2_Dimensions_1 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][5]; //initialized

        //added values
        matrix[0][0] = 12;
        matrix[0][1] = 14;
        matrix[0][2] = 11;
        matrix[0][3] = 20;
        matrix[0][4] = 22;

        matrix[1][0] = 36;
        matrix[1][1] = 23;
        matrix[1][2] = 45;
        matrix[1][3] = 27;
        matrix[1][4] = 44;

        matrix[2][0] = 99;
        matrix[2][1] = 87;
        matrix[2][2] = 55;
        matrix[2][3] = 23;
        matrix[2][4] = 36;

        matrix[3][0] = 75;
        matrix[3][1] = 10;
        matrix[3][2] = 31;
        matrix[3][3] = 82;
        matrix[3][4] = 64;

        //for in for

        for (int i = 0; i < 4; i++) { // iterate the first dimension
            System.out.println(); // print as a "table"
            for (int j = 0; j < 5; j++) { //iterate the second dimension
                System.out.print(matrix[i][j] + " ");
            }
        }

    }
}
