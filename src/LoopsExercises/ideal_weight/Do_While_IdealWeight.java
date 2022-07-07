package LoopsExercises.ideal_weight;

import java.util.*;

public class Do_While_IdealWeight {
    public static void main(String[] args) {
        String gender = "";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter you gender (M / F)");
            gender = scanner.nextLine();
        } while (!gender.equalsIgnoreCase("M") && !gender.equalsIgnoreCase("F"));
        if (gender.equalsIgnoreCase("M")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter you height in cm");
            int height = scanner.nextInt();
            double ideal_weight = Math.pow(height, 2) * 0.0022;
            System.out.printf("Ideal weight for male is: %.2f Kg", ideal_weight);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter you height in cm");
            int height = scanner.nextInt();
            double ideal_weight = Math.pow(height, 2) * 0.0021;
            System.out.printf("Ideal weight for female is: %.2f Kg", ideal_weight);
        }
    }
}
