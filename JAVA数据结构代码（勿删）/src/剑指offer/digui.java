package 剑指offer;

import java.math.BigInteger;
import java.util.Scanner;

public class digui {
    int i = 0;

    BigInteger calculate(BigInteger n) {
        BigInteger a;
        if (n.equals(BigInteger.ONE))
            return BigInteger.ONE;
        else
            return n.multiply(calculate(n.subtract(BigInteger.ONE)));
    }

    public static void main(String[] args) {
        BigInteger n = new BigInteger(Integer.toString(1000));
        digui d = new digui();
        System.out.println("the result is " + d.calculate(n).toString());
    }
}
