import java.util.Scanner;

public class NumberClassification {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("The number should be a positive integer.");
            scanner.close();
            return;
        }
        
        int sum = 0;

        // Find the sum of divisors excluding the number itself
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        // Classification of the number
        if (sum > n) {
            System.out.println(n + " is Abundant");
        } else if (sum < n) {
            System.out.println(n + " is Deficient");
        } else {
            System.out.println(n + " is Perfect");
        }

        scanner.close();
    }
}
