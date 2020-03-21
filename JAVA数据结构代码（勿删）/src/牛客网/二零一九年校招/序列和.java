package com.hgc.test;

import java.util.Scanner;

/**
 * 给出一个正整数N和长度L，找出一段长度大于等于L的连续非负整数，他们的和恰好为N。答案可能有多个，我我们需要找出长度最小的那个。
 * 例如 N = 18 L = 2：
 * 5 + 6 + 7 = 18
 * 3 + 4 + 5 + 6 = 18
 * 都是满足要求的，但是我们输出更短的 5 6 7
 * 输入描述:
 * 输入数据包括一行： 两个正整数N(1 ≤ N ≤ 1000000000),L(2 ≤ L ≤ 100)
 * 输出描述:
 * 从小到大输出这段连续非负整数，以空格分隔，行末无空格。如果没有这样的序列或者找出的序列长度大于100，则输出No
 * 示例1
 * 输入
 * 18 2
 * 输出
 * 5 6 7
 */
public class 序列和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        double a1=0;
        boolean flag = false;
        for (int i = L; i <= 100; i++) {
           a1 = (2*N+i-i*i)/(2*i*1.0);
           if (a1==(int)a1){
               L = i;
               flag = true;
               break;
           }
        }
        if (!flag){
            System.out.println("No");
            return;
        }
        int result = (int)a1;
        for (int i=0;i<L;i++){
            if (i==L-1){
                System.out.println(result);
                break;
            }
            System.out.print(result++ +" ");
        }
    }
}
