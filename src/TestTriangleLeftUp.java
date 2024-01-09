import java.util.Scanner;
// Program to draw triangle # inside a grid of matrix
public class TestTriangleLeftUp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for number of rows (X)
        System.out.print("Enter the number of rows (X): ");
        int rows = scanner.nextInt();

        // Input for number of columns (Y)
        System.out.print("Enter the number of columns (Y): ");
        int columns = scanner.nextInt();

        // Calculate the maximum height of the triangle
        int maxTriangleHeight = Math.min(rows, columns);

        // Using nested loops to print rows and columns with triangle
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Check if the current position is within the bounds of the triangle
                if (j <= i && i < maxTriangleHeight) {
                    System.out.print("# "); // Print '#' for the triangle
                } else {
                    System.out.print("* "); // Print '*' for the rectangle
                }
            }
            System.out.println(); // New line at the end of each row
        }
    }
}
