import java.math.BigInteger;
import java.security.InvalidParameterException;

public class Rational {
    int numerator;
    int denominator;

    MyCommonMath commonMath = new MyCommonMath();

    Rational(int num, int den) {
        if (den == 0) {
            throw new NumberFormatException("Denominator can't be Zero!");
        }
        int gcd = commonMath.gcd(num, den);

        numerator = num / gcd;
        denominator = den / gcd;
    }


    Rational add(Rational other) {
        int new_num = (this.numerator * other.denominator + other.numerator * this.denominator);
        int new_den = (this.denominator * other.denominator);
        return new Rational(new_num, new_den);
    }

    Rational subtract(Rational other) {
        int new_num = (this.numerator * other.denominator - other.numerator * this.denominator);
        int new_den = (this.denominator * other.denominator);
        return new Rational(new_num, new_den);
    }

    Rational divide(Rational other) {
        int new_num = (this.numerator * other.denominator);
        int new_den = (this.denominator * other.numerator);
        return new Rational(new_num, new_den);
    }

    Rational multiply(Rational other) {
        int new_num = (this.numerator * other.numerator);
        int new_den = (this.denominator * other.denominator);
        return new Rational(new_num, new_den);
    }

    int compareTo(Rational other) {
        return Integer.compare(this.numerator * other.denominator, this.denominator * other.numerator);
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return String.valueOf(numerator);
        }
        return String.valueOf(numerator) + "/" + String.valueOf(denominator);
    }

    static Rational parseRational(String a) {
        String[] t;
        t = a.split("/");
        if (t.length > 2) {
            throw new InvalidParameterException("The input is out of bound!");
        }
        int num = Integer.parseInt(t[0]);
        int den = 1;
        if (t.length > 1) {
            den = Integer.parseInt(t[1]);
        }
        return new Rational(num, den);
    }


}
