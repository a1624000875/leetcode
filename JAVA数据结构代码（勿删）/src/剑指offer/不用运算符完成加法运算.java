package 剑指offer;

import java.math.BigInteger;

public class 不用运算符完成加法运算 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        BigInteger bigInteger1 = new BigInteger(num1+"");
        BigInteger bigInteger2 = new BigInteger(num2+"");
        BigInteger integer = bigInteger1.add(bigInteger2);
        int  num3 = integer.intValue();
        System.out.println(num3);

    }
}
