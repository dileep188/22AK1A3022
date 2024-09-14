import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println(number + (isArmstrong(number) ? " is " : " is not ") + "an Armstrong number.");
    }

    public static boolean isArmstrong(int number) {
        int sum = 0, temp = number, digits = Integer.toString(number).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == number;
    }
}