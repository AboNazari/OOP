import java.util.Scanner;

public class URI1273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean first = true;
        while (true) {
            int N = sc.nextInt();
            if (N == 0) {
                break;
            }
            if (first) {
                first = false;
            } else {
                System.out.println();
            }
            String[] terms = new String[N];
            sc.nextLine();

            for (int i = 0; i < N; i++) {
                String term = sc.nextLine();
                terms[i] = term;
            }

            int longTerm = terms[0].length();
            for (int j = 1; j < N; j++) {
                if (terms[j].length() > longTerm)
                    longTerm = terms[j].length();
            }

            for (int k = 0; k < N; k++) {
                int multiplier = longTerm - terms[k].length();
                String sb = " ".repeat(Math.max(0, multiplier)) +
                        terms[k];
                System.out.println(sb);
            }
        }
    }
}