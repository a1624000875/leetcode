package 华为机试;

import java.util.Scanner;

/**
 * 题目描述
 * 计算字符串最后一个单词的长度，单词以空格隔开。
 * 输入描述:
 * 一行字符串，非空，长度小于5000。
 *
 * 输出描述:
 * 整数N，最后一个单词的长度。
 *
 * 示例1
 * 输入
 * hello world
 * 输出
 * 5
 */
public class 字符串最后一个单词的长度 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strArrays = str.split("");
        int length = strArrays.length - 1;
        boolean flag = false;
        for (; length > 0; length--) {
            if (strArrays[length].equals(" ")) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println(strArrays.length-length-1);
        }else{
            System.out.println(strArrays.length);
        }
    }
}
