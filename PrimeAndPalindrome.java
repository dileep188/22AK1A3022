import java.util.Scanner;

public class PrimeAndPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (isPrime(n)) {
            System.out.println(nextPalindrome(n));
        } else {
            System.out.println("Not prime");
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) if (n % i == 0 || n % (i + 2) == 0) return false;
        return true;
    }

    static int nextPalindrome(int n) {
        while (true) if (isPalindrome(++n)) return n;
    }

    static boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
