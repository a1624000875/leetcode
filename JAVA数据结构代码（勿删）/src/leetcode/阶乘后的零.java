package leetcode;

import java.math.BigInteger;

/**
 * 给定一个整数 n，返回 n! 结果尾数中零的数量。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 3
 * 输出: 0
 * 解释: 3! = 6, 尾数中没有零。
 * 示例 2:
 * <p>
 * 输入: 5
 * 输出: 1
 * 解释: 5! = 120, 尾数中有 1 个零.
 * 说明: 你算法的时间复杂度应为 O(log n) 。
 */
public class 阶乘后的零 {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(6995));
    }

    public static int trailingZeroes2(int n) {
        long num = 1;  //num是n的阶乘
        for (int i = n; i > 0; i--) {
            num *= i;
        }
        String str = num + "";
        int zero = 0;       //记录零的个数
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '0') {
                zero++;
            } else {
                break;
            }
        }
        return zero;
    }

    public static int trailingZeroes(int n) {
        BigInteger num = BigInteger.valueOf(1);     //大整数类型
        for (BigInteger i = BigInteger.ONE; i.compareTo(BigInteger.valueOf(n)) <= 0; i = i.add(BigInteger.ONE)) {
            num = num.multiply(i);
        }
        String str = num.toString();
        int zero = 0;       //记录零的个数
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '0') {
                zero++;
            } else {
                break;
            }
        }
        return zero;
    }
}
