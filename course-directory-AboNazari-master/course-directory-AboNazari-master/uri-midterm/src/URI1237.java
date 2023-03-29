import java.util.Scanner;

public class URI1237 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int maxLen = 0;
            int[][] dp = new int[s1.length() + 1][s2.length() + 1];
            for (int i = 1; i <= s1.length(); i++) {
                for (int j = 1; j <= s2.length(); j++) {
                    if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                        maxLen = Math.max(maxLen, dp[i][j]);
                    }
                }
            }
            System.out.println(maxLen);
        }
    }
}