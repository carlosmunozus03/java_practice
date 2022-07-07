package Exercises;

public class StringExercises {
    public static void main(String[] args) {

        String string = "We don't need no";
        String education = "education";
        String control = "thought control";
        String check = "Check \"this\" out!, \"s inside of \"s"; //Check "this" out!, "s inside of "s!
        String windows = "In windows, the main drive is usually C:\\"; //In windows, the main drive is usually C:\
        String lines = "I can do backslashes \\, double backlashes \\\\,\n and the amazing triple backlashes \\\\\\!";//I can do backslashes \, double backslashes \\,
        //and the amazing triple backslash \\\!

        System.out.println(string.concat(" " + education));
        System.out.println(string + " " + control);
        System.out.println(check);
        System.out.println(windows);
        System.out.println(lines);
    }
}
