import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] input = new int[n];

        for(int i = 0; i < n; i++){
            int a = scanner.nextInt();
            input[i] = a;
        }

        int sum = 0, maxValue = Integer.MIN_VALUE;

        for(int i = 0; i < n; i ++){
            sum += input[i];
            if(input[i] > maxValue) maxValue = input[i];
        }

        double avg = sum / n;

        System.out.println("Sum : " + sum);
        System.out.println("Average : " + avg);
        System.out.println("MaxValue : " + maxValue);


        scanner.close();
    }
}
