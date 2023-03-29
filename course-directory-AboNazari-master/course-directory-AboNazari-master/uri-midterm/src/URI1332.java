import java.util.*;

public class URI1332 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline after the integer
        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            int len = word.length();
            if (len == 3) {
                if (word.charAt(0) == 'o' && word.charAt(1) == 'n' ||
                        word.charAt(0) == 'o' && word.charAt(2) == 'e' ||
                        word.charAt(1) == 'n' && word.charAt(2) == 'e') {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            } else if (len == 5) {
                System.out.println(3);
            }
        }
        sc.close();
    }
}