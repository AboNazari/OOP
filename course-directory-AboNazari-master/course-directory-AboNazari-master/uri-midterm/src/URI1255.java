

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class URI1255 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().toLowerCase();
            Map<Character, Integer> letterCounts = new HashMap<>();
            for (char c : line.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (letterCounts.containsKey(c)) {
                        letterCounts.put(c, letterCounts.get(c) + 1);
                    } else {
                        letterCounts.put(c, 1);
                    }
                }
            }
            int maxCount = 0;
            for (int count : letterCounts.values()) {
                maxCount = Math.max(maxCount, count);
            }
            for (char c = 'a'; c <= 'z'; c++) {
                if (letterCounts.containsKey(c) && letterCounts.get(c) == maxCount) {
                    System.out.print(c);
                }
            }
             System.out.println();
        }
    }
}