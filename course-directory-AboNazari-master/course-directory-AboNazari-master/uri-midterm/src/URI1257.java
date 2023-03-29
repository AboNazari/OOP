import java.util.Scanner;

public class URI1257{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int hash = 0;
            for (int j = 0; j < l; j++) {
                String input = sc.next();
                for (int k = 0; k < input.length(); k++) {
                    hash += (input.charAt(k)- 'A')  + j + k;
                }
            }
            System.out.println(hash);
        }
    }
}