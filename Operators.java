// Day 3
public class Operators {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int sum = a + b;
        int diff = a - b;
        int multi = a * b;
        int quotient = a / b;
        int rem = a % b;
        int large = (a > b) ? a : b;

        System.out.println("Sum : " + sum);
        System.out.println("Differnece " + diff);
        System.out.println("Multiplication " + multi);
        System.out.println("Division " + quotient);
        System.out.println("Remainder " + rem);
        System.out.println("Larger " + large);
    }    
}
