public class Occurances{
    public static void main(String[] args) {
        String str = "Hello World";
        int[] count = new int[256]; // ASCII size

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + ": " + count[i]);
            }
        }
    }
}