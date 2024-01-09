import java.util.Scanner;

public class TestTriangleRightUp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for number of rows (X)
        System.out.print("Enter the number of rows (X): ");
        int rows = scanner.nextInt();

        // Input for number of columns (Y)
        System.out.print("Enter the number of columns (Y): ");
        int columns = scanner.nextInt();

        // Using nested loops to print rows and columns with right-handed triangle
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Check if the current position is within the bounds of the triangle
                if (j >= columns - i - 1 && i < columns) {
                    System.out.print("# "); // Print '#' for the triangle
                } else {
                    System.out.print("* "); // Print '*' for the rest of the matrix
                }
            }
            System.out.println(); // New line at the end of each row
        }
    }
}
