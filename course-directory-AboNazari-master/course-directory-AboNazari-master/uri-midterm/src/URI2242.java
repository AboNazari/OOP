import java.util.Scanner;
import java.util.Stack;

public class URI2242 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String laugh = sc.next();

        String vowels = "aeiou";
        StringBuilder laughVowels = new StringBuilder();
        for (int i = 0; i < laugh.length(); i++) {
            if (vowels.indexOf(laugh.charAt(i)) != -1) {
                laughVowels.append(laugh.charAt(i));
            }
        }
        String laughVowelsStr = laughVowels.toString();
        String reversedLaughVowelsStr = laughVowels.reverse().toString();

        if (laughVowelsStr.equals(reversedLaughVowelsStr)) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}