package java_1;

public class Method_Overloading {

    public static void sayHello(int times) {
        for (int i = 0; i < times; i++) {
            sayHello();
        }
    }

    public static void sayHello() {
        System.out.println("Hello world!");
    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void sayHello(String greeting, String name) {
        System.out.println(greeting + " " + name + "!");
    }

    public static void main(String[] args) {
        sayHello();
    }
}
