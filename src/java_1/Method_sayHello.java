package java_1;

public class Method_sayHello {

    public static void sayHello(String greeting, String name) {
        System.out.printf("%s %s!", greeting, name);
    }

    public static int returnThree() {
        return 3;
    }

    public static String shout(String s) {
        return s.toUpperCase() + "!!!";
    }


    public static void main(String[] args) {
        sayHello("Morning", "User");
        returnThree();
        shout("silence");
    }
}
