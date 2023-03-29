import java.util.Scanner;

public class URI1514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            // Read input
            int n = sc.nextInt();
            int m = sc.nextInt();

            // Check for end of input
            if (n == 0 && m == 0) {
                break;
            }

            int[][] matrix = new int[n][m];

            // Read matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            // Check characteristics
            boolean solvedAll = false;
            boolean solvedByOne = true;
            boolean solvedByAll = false;
            boolean solvedAtLeastOne = false;

            for (int j = 0; j < m; j++) {
                int sum = 0;
                boolean foundOne = false;

                for (int i = 0; i < n; i++) {
                    sum += matrix[i][j];
                    if (matrix[i][j] == 1) {
                        foundOne = true;
                    }
                }

                if (sum == n) {
                    solvedByAll = true;
                }

                if (sum >= 1) {
                    solvedAtLeastOne = true;
                }

                if (sum == n && !foundOne) {
                    solvedAll = true;
                }

                if (sum != 1) {
                    solvedByOne = false;
                }
            }

            int count = 0;

            if (!solvedAll) {
                count++;
            }

            if (solvedByOne && solvedAtLeastOne) {
                count++;
            }

            if (!solvedByAll) {
                count++;
            }

            if (solvedAtLeastOne) {
                count++;
            }

            System.out.println(count);
        }

        sc.close();
    }

}
