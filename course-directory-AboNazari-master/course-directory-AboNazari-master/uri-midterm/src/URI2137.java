import java.util.Scanner;
import java.util.Arrays;

public class URI2137 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String[] codes = new String[n];
            for (int i = 0; i < n; i++) {
                codes[i] = sc.next();
            }
            Arrays.sort(codes);
            for (String code : codes) {
                System.out.println(code);
            }
        }
    }
}