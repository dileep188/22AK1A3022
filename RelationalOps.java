import java.util.Scanner;

public class RelationalOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 10-digit integer: ");
        long num1 = sc.nextLong(), num2 = num1 + 1;

        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 >= num2: " + (num1 >= num2));
        System.out.println("num1 <= num2: " + (num1 <=num2));
}
}