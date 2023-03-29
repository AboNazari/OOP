import java.util.*;
import java.math.*;

public class URI1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int d = sc.nextInt();
            BigInteger n = sc.nextBigInteger();

            if (d == 0 && n.equals(BigInteger.ZERO)) {
                break;
            }

            BigInteger ten = BigInteger.TEN;
            BigInteger sum = BigInteger.ZERO;
            BigInteger factor = BigInteger.ONE;

            while (n.compareTo(BigInteger.ZERO) > 0) {
                BigInteger digit = n.mod(ten);

                if (digit.intValue() != d) {
                    sum = sum.add(factor.multiply(digit));
                    factor = factor.multiply(ten);
                }

                n = n.divide(ten);
            }

            System.out.println(sum);
        }

        sc.close();
    }
}
