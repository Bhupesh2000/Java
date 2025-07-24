/*
==================== STATIC KEYWORD SUMMARY ====================

1. Static Variable:
   - Location: `static int count` in Counter class
   - Purpose: Shared among all instances of the class.
   - Example: All Counter objects increment the same `count`.

2. Static Method:
   - Location: `static int getCount()` in Counter class
   - Purpose: Can be accessed without creating an object.
   - Note: Can only access static members directly.

3. Private Constructor:
   - Location: `private MathUtils()`
   - Purpose: Prevents object creation; used in utility/helper classes.
   - Example: `new MathUtils()` is invalid from outside the class.

4. Static Utility Methods:
   - Location: `static int add(int a, int b)` and `multiply(int a, int b)`
   - Purpose: Can be called without an object. Useful for stateless operations.
   - Example: `MathUtils.add(2, 3);`

===============================================================
*/

class Counter{
    static int count = 0;

    Counter(){
        count ++;
    }

    public static int getCount(){
        return count;
    }
}

class MathUtils{
    // Class with private constructor, so that object creation is prevented.
    private MathUtils(){
        System.out.println("Private constructor called");
    }

    static int add(int a, int b){
        return a + b;
    }

    static int multiply(int a, int b){
        return a * b;
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        int count1 = Counter.getCount();
        Counter c2 = new Counter();
        int count2 = Counter.getCount();
        Counter c3 = new Counter();
        int count3 = Counter.getCount();

        System.out.println("Count 1:" + count1 + ", Count 2: " + count2 + ", Count 3: " + count3);


        // MathUtils m1 = new MathUtils(); // Not a valid case

        int additionResult = MathUtils.add(count2, count3);
        int multiplicationResult = MathUtils.multiply(count2, count3);

        System.out.println("Addition result: " + additionResult + ", Multiplication result: " + multiplicationResult);
    }
}