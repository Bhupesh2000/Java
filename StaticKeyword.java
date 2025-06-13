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