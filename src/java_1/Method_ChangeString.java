package java_1;

public class Method_ChangeString {
    public static void changeString(String s) {
        s = "Wub a lub a dub dub";
    }

    public static void main(String[] args) {
        String changeMe = "hello There!";

        changeString(changeMe);

        System.out.println(changeMe);
    }
}
