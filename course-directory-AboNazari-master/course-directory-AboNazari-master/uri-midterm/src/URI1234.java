import java.util.*;

public class URI1234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String sentence = sc.nextLine();

            boolean upperCase = true;
            for (int i = 0; i < sentence.length(); i++) {
                char c = sentence.charAt(i);
                if (c == ' ') {
                    System.out.print(c);
                } else {
                    if (upperCase) {
                        System.out.print(Character.toUpperCase(c));
                    } else {
                        System.out.print(Character.toLowerCase(c));
                    }
                    upperCase = !upperCase;
                }
            }
            System.out.println();
        }

        sc.close();
    }
}