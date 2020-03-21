package 牛客网.二零一九年校招;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 题目描述
 * 今天上课，老师教了小易怎么计算加法和乘法，乘法的优先级大于加法，但是如果一个运算加了括号，那么它的优先级是最高的。例如：
 * 1+2*3=7
 * 1*(2+3)=5
 * 1*2*3=6
 * (1+2)*3=9
 * 现在小易希望你帮他计算给定3个数a，b，c，在它们中间添加"+"， "*"， "("， ")"符号，能够获得的最大值。
 * 输入描述:
 * 一行三个数a，b，c (1 <= a, b, c <= 10)
 * 输出描述:
 * 能够获得的最大值
 * 示例1
 * 输入
 * 1 2 3
 * 输出
 * 9
 */
public class 表达式求值 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        for (int i=0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }
        Arrays.toString(array);
        if (array[0]==1){
            System.out.println((array[0]+array[1])*array[2]);
        }else{
            System.out.println(array[0]*array[1]*array[2]);
        }
    }
}
