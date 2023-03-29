import java.util.Scanner;

public class URI1168 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String num = sc.next();
            int leds = 0;
            for (int j = 0; j < num.length(); j++) {
                switch (num.charAt(j)) {
                    case '0':
                    case '6':
                    case '9':
                        leds += 6;
                        break;
                    case '1':
                        leds += 2;
                        break;
                    case '2':
                    case '3':
                    case '5':
                        leds += 5;
                        break;
                    case '4':
                        leds += 4;
                        break;
                    case '7':
                        leds += 3;
                        break;
                    case '8':
                        leds += 7;
                        break;
                }
            }
            System.out.println(leds + " leds");
        }
    }
}
