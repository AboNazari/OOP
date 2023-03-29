import java.util.Scanner;
import java.util.HashMap;

public class URI1873 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        HashMap<String, String[]> map = new HashMap<>();
        map.put("tesoura", new String[]{"papel", "lagarto"});
        map.put("papel", new String[]{"pedra", "spock"});
        map.put("pedra", new String[]{"lagarto", "tesoura"});
        map.put("lagarto", new String[]{"spock", "papel"});
        map.put("spock", new String[]{"tesoura", "pedra"});

        for (int i = 0; i < c; i++) {
            String rajesh = sc.next();
            String sheldon = sc.next();
            if (rajesh.equals(sheldon)) {
                System.out.println("empate");
            } else if (map.get(rajesh)[0].equals(sheldon) || map.get(rajesh)[1].equals(sheldon)) {
                System.out.println("rajesh");
            } else {
                System.out.println("sheldon");
            }
        }
    }
}