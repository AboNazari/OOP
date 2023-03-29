import java.util.Scanner;

public class URI1129 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while ((n = sc.nextInt()) != 0) {
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();
                int e = sc.nextInt();

                int blackCount = 0;
                int blackIndex = 0;
                if (a <= 127) {
                    blackCount++;
                    blackIndex = 1;
                }
                if (b <= 127) {
                    blackCount++;
                    blackIndex = 2;
                }
                if (c <= 127) {
                    blackCount++;
                    blackIndex = 3;
                }
                if (d <= 127) {
                    blackCount++;
                    blackIndex = 4;
                }
                if (e <= 127) {
                    blackCount++;
                    blackIndex = 5;
                }

                if (blackCount != 1) {
                    System.out.println("*");
                } else {
                    System.out.println((char) ('A' + blackIndex - 1));
                }
            }
        }

        sc.close();
    }
}
