import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        initializeBoard(board);
        playGame(board);
    }

    private static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static void playGame(char[][] board) {
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'X';
        boolean isGameFinished = false;

        while (!isGameFinished) {
            printBoard(board);
            int row, col;
            do {
                System.out.println("Player " + currentPlayer + ", enter a row (0, 1, or 2): ");
                row = scanner.nextInt();
                System.out.println("Player " + currentPlayer + ", enter a column (0, 1, or 2): ");
                col = scanner.nextInt();
            } while (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != '-');

            board[row][col] = currentPlayer;
            isGameFinished = checkForWinner(board);

            if (currentPlayer == 'X') {
                currentPlayer = 'O';
            } else {
                currentPlayer = 'X';
            }
        }
        scanner.close();
    }

    private static boolean checkForWinner(char[][] board) {
        // Check rows, columns, and diagonals for a winner
        // Implement logic here

        // Return true if there is a winner or the game is a tie
        // Otherwise, return false
        return false;
    }

    private static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}