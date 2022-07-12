package PildoraExercises;

public class Array_2D_Salary {
    public static void main(String[] args) {
        //make an application that shows a table of the salary of an employee that increases by 10% annually

        double accumulated; // declared
        double interest_rate = 0.10; // 10%

        double[][] salary = new double[6][5];

        for (int i = 0; i < 6; i++) {
            salary[i][0] = 10_000; // fixed base salary at 10_000
            accumulated = 10_000; // initialized

            for (int j = 1; j < 5; j++) { // start with j = 1 'cause we fixed the base salary below
                accumulated += (accumulated * interest_rate); // accumulate interest rate
                salary[i][j] = accumulated;
            }
            interest_rate = interest_rate + 0.01; // increase 10% each year
        }
        for (int z = 0; z < 6; z++) {
            System.out.println();
            for (int h = 0; h < 5; h++) {
                System.out.printf("%.2f ", salary[z][h]); // format for show 2 decimals
                System.out.print(" "); // show as a table
            }
        }
    }
}
