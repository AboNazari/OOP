public class MyCommonMath {
    int gcd(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else if (a < 0) {
            a = -a;
        } else if (b < 0) {
            b = -b;
        }
        int t;
        if (a < b) {
            t = a;
            a = b;
            b = t;
        }
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        return a;
    }


}
