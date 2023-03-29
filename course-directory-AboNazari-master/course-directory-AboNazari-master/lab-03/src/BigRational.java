import java.math.BigInteger;
import java.security.InvalidParameterException;

public class BigRational {
    BigInteger numerator;
    BigInteger denominator;

    BigRational(BigInteger num, BigInteger den) {
        if (den.equals(new BigInteger("0"))) {
            throw new NumberFormatException("Denominator can't be Zero!");
        }
        BigInteger gcd = num.gcd(den);
        numerator = num.divide(gcd);
        denominator = den.divide(gcd);
    }

    BigRational add(BigRational other) {
        BigInteger new_num = (this.numerator.multiply(other.denominator).add(other.numerator.multiply(this.denominator)));
        BigInteger new_den = (this.denominator.multiply(other.denominator));
        return new BigRational(new_num, new_den);
    }

    BigRational subtract(BigRational other) {
        BigInteger new_num = (this.numerator.multiply(other.denominator).subtract(other.numerator.multiply(this.denominator)));
        BigInteger new_den = (this.denominator.multiply(other.denominator));
        return new BigRational(new_num, new_den);
    }

    BigRational multiply(BigRational other) {
        BigInteger new_num = (this.numerator.multiply(other.numerator));
        BigInteger new_den = (this.denominator.multiply(other.denominator));
        return new BigRational(new_num, new_den);
    }

    BigRational divide(BigRational other) {
        BigInteger new_num = (this.numerator.multiply(other.denominator));
        BigInteger new_den = (this.denominator.multiply(other.numerator));
        return new BigRational(new_num, new_den);
    }

    int compareTo(BigRational other) {
        return (this.numerator.multiply(other.denominator).compareTo(this.denominator.multiply(other.numerator)));
    }

    @Override
    public String toString() {
        if (denominator.equals(new BigInteger("1")) ) {
            return String.valueOf(numerator);
        }
        return String.valueOf(numerator) + "/" + String.valueOf(denominator);
    }
    static BigRational parseBigRational(String a) {
        String[] t;
        t = a.split("/");
        if (t.length > 2) {
            throw new InvalidParameterException("The input is out of bound!");
        }
        BigInteger num = new BigInteger(t[0]);
        BigInteger den = BigInteger.ONE;
        if (t.length > 1) {
            den = new BigInteger(t[1]);
        }
        return new BigRational(num, den);
    }

}
