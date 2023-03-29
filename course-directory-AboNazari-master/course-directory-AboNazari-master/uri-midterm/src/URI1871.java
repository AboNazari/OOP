import java.util.Scanner;

public class URI1871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            if (m == 0 && n == 0) break;
            int sum = m + n;
            String result = Integer.toString(sum).replace("0", "");
            System.out.println(Integer.parseInt(result));
        }
    }
}