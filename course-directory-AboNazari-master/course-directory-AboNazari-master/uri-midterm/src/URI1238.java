import java.util.Scanner;

public class URI1238 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            String s1 = in.next();
            String s2 = in.next();
            String combined = "";
            for (int i = 0; i < Math.max(s1.length(), s2.length()); i++) {
                if (i < s1.length()) {
                    combined += s1.charAt(i);
                }
                if (i < s2.length()) {
                    combined += s2.charAt(i);
                }
            }
            System.out.println(combined);
        }
    }
}
