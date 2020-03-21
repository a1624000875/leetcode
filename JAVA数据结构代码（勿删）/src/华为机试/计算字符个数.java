package 华为机试;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 题目描述
 * 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 * <p>
 * 输入描述:
 * 第一行输入一个有字母和数字以及空格组成的字符串，第二行输入一个字符。
 * <p>
 * 输出描述:
 * 输出输入字符串中含有该字符的个数。
 * <p>
 * 示例1
 * 输入
 * ABCDEF
 * A
 * 输出
 * 1
 */
public class 计算字符个数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String ch = scanner.next();
        String[] strArrays = str.split("");
        int sum = 0;
        for (int i = 0; i < strArrays.length; i++) {
            if (strArrays[i].equals(ch.toUpperCase()) || strArrays[i].equals(ch.toLowerCase())){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
