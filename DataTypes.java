// Day 2
public class DataTypes {
    public static void main(String[] args) {
        // Integer types
        byte smallNumber = 100;
        short shortNumber = 30000;
        int intNumber = 1000000;
        long longNumber = 12345678900L;

        // Floating-point types
        float floatNumber = 3.14f;
        double doubleNumber = 3.14159265359;

        // Character type
        char grade = 'A';

        // Boolean type
        boolean isPassed = true;

        // Constant (unchangeable)
        final double PI = 3.14159;

        // variable without initialising
        int x;
        // System.out.println("without initialising " + x); -> will give error.
        // Java won't store garbage value
        x = 5;

        // Output
        System.out.println("byte value: " + smallNumber);
        System.out.println("short value: " + shortNumber);
        System.out.println("int value: " + intNumber);
        System.out.println("long value: " + longNumber);
        System.out.println("float value: " + floatNumber);
        System.out.println("double value: " + doubleNumber);
        System.out.println("char value: " + grade);
        System.out.println("boolean value: " + isPassed);
        System.out.println("constant PI: " + PI);
        System.out.println("without initialising " + x);
    }    
}
