import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Integer Input
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        // Double input
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();
        
        // Boolean input
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // To consume leftover newline after numeric/boolean input
        scanner.nextLine();  

        // String input (single word)
        System.out.print("Enter your first name: ");
        String firstName = scanner.next();

        // To consume leftover newline after next()
        scanner.nextLine();

        // String input (entire line)
        System.out.print("Enter your full address: ");
        String address = scanner.nextLine();

        // Output
        System.out.println("\n--- Your Information ---");
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Student: " + isStudent);
        System.out.println("First Name: " + firstName);
        System.out.println("Address: " + address);

        scanner.close();

    }
}
