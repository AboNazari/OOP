import java.util.*;

public class URI1241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String a = sc.next();
            String b = sc.next();

            if (a.endsWith(b)) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
        }
        sc.close();
    }
}
