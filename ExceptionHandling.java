import java.util.Scanner;

// ✅ Main class (only one public class allowed per .java file)
public class ExceptionHandling {

    /*
    * ✅ CUSTOM EXCEPTION: InvalidMarkException
    *
    * This class defines a custom exception called InvalidMarkException.
    * It extends the built-in Exception class, which means it behaves like
    * any other Java exception but gives us a more descriptive name for clarity.
    *
    * 🔹 Why create a custom exception?
    *    - To clearly represent specific problems (like invalid marks)
    *    - To make code easier to understand and maintain
    *    - To separate business logic errors from generic exceptions
    *
    * 🔹 Breakdown of the code:
    *
    * public static class InvalidMarkException extends Exception {
    *     - This declares a custom class named InvalidMarkException.
    *     - It extends Exception, so it inherits behavior from Java’s base Exception class.
    *     - 'static' is used here because the class is nested inside another class (ExceptionHandling)
    *       and doesn't depend on an instance of the outer class.
    *
    * public InvalidMarkException(String message) {
    *     - This is the constructor.
    *     - It allows us to pass a custom error message when throwing the exception.
    *
    * super(message);
    *     - This passes the custom message to the parent Exception class.
    *     - Later, we can retrieve this message using e.getMessage() when we catch the exception.
    *
    * 🔹 Example Usage:
    *
    * // Throwing the exception:
    * if (mark < 0 || mark > 100) {
    *     throw new InvalidMarkException("Invalid mark found: " + mark);
    * }
    *
    * // Catching the exception:
    * catch (InvalidMarkException e) {
    *     System.out.println("Custom Exception: " + e.getMessage());
    * }
    *
    * This makes your code cleaner, more descriptive, and easier to debug.
    */
    // Declared as a static nested class since we cannot have multiple public classes in one file
    public static class InvalidMarkException extends Exception {
        public InvalidMarkException(String message) {
            super(message); // Call superclass constructor to store error message
        }
    }

    // ✅ Method to calculate average marks, with declared exception using `throws`
    // Demonstrates use of `throws` and `throw` for custom exception handling
    public static double calculateAverageMarks(int[] marks) throws InvalidMarkException {
        if (marks == null || marks.length == 0) {
            // `throw`: used to manually throw an exception
            throw new InvalidMarkException("Marks array is empty or null.");
        }

        int sum = 0;
        for (int mark : marks) {
            // Validate each mark; throw custom exception if invalid
            if (mark < 0 || mark > 100) {
                throw new InvalidMarkException("Invalid mark found: " + mark);
            }
            sum += mark;
        }

        return (double) sum / marks.length;
    }

    // ✅ Main method: handles input, calls logic, and demonstrates exception handling
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 🔹 Take number of subjects as input
            System.out.println("Enter the number of subjects:");
            int noOfSubjects = scanner.nextInt();

            // 🔹 Throwing built-in exception for invalid subject count
            if (noOfSubjects <= 0) {
                throw new ArithmeticException("Invalid number of Subjects: " + noOfSubjects);
            }

            int[] marks = new int[noOfSubjects];

            // 🔹 Input marks and validate using `if` and `throw`
            System.out.println("Enter " + noOfSubjects + " marks (0–100):");
            for (int i = 0; i < noOfSubjects; i++) {
                int number = scanner.nextInt();
                // `IllegalArgumentException` is an unchecked exception
                if (number < 0 || number > 100) {
                    throw new IllegalArgumentException("Invalid marks: " + number);
                }
                marks[i] = number;
            }

            // 🔹 Call method that throws a custom exception
            double avg = calculateAverageMarks(marks);
            System.out.println("Average Marks: " + avg);

            // 🔹 Simulate a NullPointerException (unchecked)
            String dummy = null;
            System.out.println("Length of dummy string: " + dummy.length());

        // ✅ Multiple `catch` blocks handle specific exception types

        // Catches a null reference (e.g., dummy string above)
        } catch (NullPointerException e) {
            System.out.println("Null pointer Error: " + e.getMessage());

        // Catches division by zero or invalid subject count
        } catch (ArithmeticException e) {
            System.out.println("Math Error: " + e.getMessage());

        // Catches bad user input for marks
        } catch (IllegalArgumentException e) {
            System.out.println("Input Error: " + e.getMessage());

        // Catches custom exception thrown from calculateAverageMarks
        } catch (InvalidMarkException e) {
            System.out.println("Custom Exception: " + e.getMessage());

        // ✅ `finally` block runs no matter what
        } finally {
            System.out.println("Exception Handling complete");
            scanner.close();  // Always close resources
        }
    }
}
