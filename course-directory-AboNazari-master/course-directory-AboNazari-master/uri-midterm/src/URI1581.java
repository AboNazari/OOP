import java.util.Scanner;
import java.util.HashSet;
public class URI1581{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            HashSet<String> languages = new HashSet<>();
            for (int j = 0; j < k; j++) {
                String language = sc.next();
                languages.add(language);
            }
            if (languages.size() == 1) {
                System.out.println(languages.iterator().next());
            } else {
                System.out.println("ingles");
            }
        }
    }
}