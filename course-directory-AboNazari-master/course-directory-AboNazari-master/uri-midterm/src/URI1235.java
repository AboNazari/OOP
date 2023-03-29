import java.util.Scanner;

public class URI1235 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline after the integer
        while (n-- > 0) {
            String line = scanner.nextLine();
            int mid = line.length() / 2;
            for (int i = mid - 1; i >= 0; i--) {
                System.out.print(line.charAt(i));
            }
            for (int i = line.length() - 1; i >= mid; i--) {
                System.out.print(line.charAt(i));
            }
            System.out.println();
        }
    }
}
