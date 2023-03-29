import java.util.Scanner;

public class URI1437 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            sc.nextLine(); // read the newline character after n

            String commands = sc.nextLine();

            int direction = 0; // 0 = north, 1 = east, 2 = south, 3 = west

            for (int i = 0; i < n; i++) {
                if (commands.charAt(i) == 'D') {
                    direction++;
                } else {
                    direction--;
                }

                if (direction < 0) direction += 4;
                if (direction >= 4) direction -= 4;
            }

            if (direction == 0) {
                System.out.println("N");
            } else if (direction == 1) {
                System.out.println("L");
            } else if (direction == 2) {
                System.out.println("S");
            } else {
                System.out.println("O");
            }
        }

        sc.close();
    }
}