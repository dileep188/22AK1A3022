import java.util.Scanner;

public class MatrixOperations {

    // Method for addition, subtraction, and multiplication
    public static int[][] operateMatrices(int[][] matrix1, int[][] matrix2, char operation) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (operation == '+') {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                } else if (operation == '-') {
                    result[i][j] = matrix1[i][j] - matrix2[i][j];
                } else if (operation == '*') {
                    for (int k = 0; k < cols; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        }
        return result;
    }

    // Method to find the trace of a matrix
    public static int traceMatrix(int[][] matrix) {
        int trace = 0;
        for (int i = 0; i < matrix.length; i++) {
            trace += matrix[i][i];
        }
        return trace;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the matrices:");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix1[i][j] = scanner.nextInt();

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix2[i][j] = scanner.nextInt();

        System.out.println("Matrix Addition:");
        printMatrix(operateMatrices(matrix1, matrix2, '+'));

        System.out.println("Matrix Subtraction:");
        printMatrix(operateMatrices(matrix1, matrix2, '-'));

        if (rows == cols) {
            System.out.println("Matrix Multiplication:");
            printMatrix(operateMatrices(matrix1, matrix2, '*'));

            System.out.println("Trace of the first matrix: " + traceMatrix(matrix1));
        } else {
            System.out.println("Multiplication and Trace only possible for square matrices.");
        }

        scanner.close();
    }
}