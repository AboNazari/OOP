import java.util.Scanner;

public class URI1383 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int k = 1; k <= n; k++) {
            int[][] matrix = new int[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("Instancia " + k);
            if (isSudokuSolution(matrix)) {
                System.out.println("SIM");
            } else {
                System.out.println("NAO");
            }
            System.out.println();
        }
    }

    public static boolean isSudokuSolution(int[][] matrix) {
        // Check rows
        for (int i = 0; i < 9; i++) {
            boolean[] present = new boolean[10];
            for (int j = 0; j < 9; j++) {
                if (present[matrix[i][j]]) return false;
                present[matrix[i][j]] = true;
            }
        }

        // Check columns
        for (int j = 0; j < 9; j++) {
            boolean[] present = new boolean[10];
            for (int i = 0; i < 9; i++) {
                if (present[matrix[i][j]]) return false;
                present[matrix[i][j]] = true;
            }
        }
// Check sub-matrices
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                boolean[] present = new boolean[10];
                for (int i = 3 * x; i < 3 * x + 3; i++) {
                    for (int j = 3 * y; j < 3 * y + 3; j++) {
                        if (present[matrix[i][j]]) return false;
                        present[matrix[i][j]] = true;
                    }
                }

            }
        }
        return true;
    }
}
