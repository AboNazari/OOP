import java.util.Scanner;

public class URI1607{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String a = sc.next();
            String b = sc.next();
            int operations = 0;
            for (int j = 0; j < a.length(); j++) {
                int diff = b.charAt(j) - a.charAt(j);
                if (diff < 0) diff += 26;
                operations += diff;
            }
            System.out.println(operations);
        }
    }
}