import java.util.Scanner;

public class URI1253 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            String s = in.next();
            int shift = in.nextInt();
            String decoded = "";
            for (char c : s.toCharArray()) {
                decoded += (char)((c - 'A' - shift + 26) % 26 + 'A');
            }
            System.out.println(decoded);
        }
    }
}