import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        // Declare and initialize the matrix
        int[][] matrix = new int[rows][columns];

        // Fill the matrix with user input
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Input the number to search for
        System.out.print("Enter the number to search for: ");
        int x = sc.nextInt();

        // Search for the number and print indices
        boolean found = false;
        System.out.println("Indices where " + x + " occurs:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("(" + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        // If the number is not found
        if (!found) {
            System.out.println(x + " is not found in the matrix.");
        }

        // Close the scanner
        sc.close();
    }
}
