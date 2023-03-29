import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class URI1551 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String sentence = sc.nextLine();
            Set<Character> set = new HashSet<>();
            for (char c : sentence.toCharArray()) {
                if (Character.isLetter(c)) {
                    set.add(c);
                }
            }
            if (set.size() == 26) {
                System.out.println("frase completa");
            } else if (set.size() >= 13) {
                System.out.println("frase quase completa");
            } else {
                System.out.println("frase mal elaborada");
            }
        }
    }
}