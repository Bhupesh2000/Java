import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            if(i == 100) break;
            if(i % 3 == 0) continue;
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
