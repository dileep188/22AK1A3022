import java.util.Scanner;

public class EvenLengthSubstring {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        try {
            // Prompt the user for input
            System.out.println("Enter a string:");
            // Read the input string
            String str = input.nextLine();

            // Generate and print all even-length substrings
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 2; j <= str.length(); j += 2) {
                    // Print the even-length substring
                    System.out.println(str.substring(i, j));
                }
            }
        } finally {
            // Close the Scanner to avoid resource leaks
            input.close();
        }
    }
}
