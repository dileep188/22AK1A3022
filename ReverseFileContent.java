import java.io.*;

public class ReverseFileContent {
    public static void main(String[] args) throws IOException {
        String fileName = "sample.txt";
        int n = 50;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 1; i <= 10; i++) writer.write("Line " + i + ": Sample line.\n");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)))
{
          char[] buffer = new char[n];
            int charsRead = reader.read(buffer, 0, n);
            System.out.println(new StringBuilder(new String(buffer, 0, charsRead)).reverse());
}
}
}
