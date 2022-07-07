package java_1;

public class Method_Recursion {

    //count down
    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }


    //exponent
    public static long getPower(int base, int exponent) {
        long result = 1;

        for (int i = 0; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    //Can use this recursion if we don't want to use a for loop
    public static long getPower_2(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent - 1);
    }

    public static void main(String[] args) {
        count(5);
        getPower(5, 2);
        getPower_2(5, 2);
    }
}
