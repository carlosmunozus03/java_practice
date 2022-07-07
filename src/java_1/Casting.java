package java_1;

public class Casting {
    public static void main(String[] args) {
        //implicit conversions
        byte bytePrecision = 12;
        short shortPrecision = bytePrecision;
        int intPrecision = shortPrecision;
        long longPrecision = intPrecision;
        System.out.println("Implicit casting from int to long = " + longPrecision);

        //explicit conversions
        int explicitInt = 23;
        short explicitShort = (short) explicitInt;
        byte explicitByte = (byte) explicitShort;
        System.out.println("Explicit casting from int to byte = " + explicitByte);

        //explicit conversions decimals
        double explicitDouble = 45.67;
        float explicitFloat = (float) explicitDouble;
        System.out.println("Explicit casting from double to float = " + explicitDouble);

        //Explicit convert
        double pi = 3.1415;
        int castPi = (int) pi;
        System.out.println("Explicit casting from double to int = " + castPi);
    }
}
