package 牛客网.二零一九年校招;

import java.util.Scanner;

/**
 * 题目描述
 * 平面内有n个矩形, 第i个矩形的左下角坐标为(x1[i], y1[i]), 右上角坐标为(x2[i], y2[i])。
 * <p>
 * 如果两个或者多个矩形有公共区域则认为它们是相互重叠的(不考虑边界和角落)。
 * <p>
 * 请你计算出平面内重叠矩形数量最多的地方,有多少个矩形相互重叠。
 * <p>
 * 输入描述:
 * 输入包括五行。
 * 第一行包括一个整数n(2 <= n <= 50), 表示矩形的个数。
 * 第二行包括n个整数x1[i](-10^9 <= x1[i] <= 10^9),表示左下角的横坐标。
 * 第三行包括n个整数y1[i](-10^9 <= y1[i] <= 10^9),表示左下角的纵坐标。
 * 第四行包括n个整数x2[i](-10^9 <= x2[i] <= 10^9),表示右上角的横坐标。
 * 第五行包括n个整数y2[i](-10^9 <= y2[i] <= 10^9),表示右上角的纵坐标。
 * 输出描述:
 * 输出一个正整数, 表示最多的地方有多少个矩形相互重叠,如果矩形都不互相重叠,输出1。
 * 示例1
 * 输入
 * 2
 * 0 90
 * 0 90
 * 100 200
 * 100 200
 * 复制
 * 2
 */
public class 矩形重叠 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x1 = new int[n];  //左下角的横坐标
        int[] y1 = new int[n];  //左下角纵坐标
        int[] x2 = new int[n];  //右上角的横坐标
        int[] y2 = new int[n];  //右上角的纵坐标
        for (int i = 0; i < n; i++) {
            x1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            y1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            x2[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            y2[i] = scanner.nextInt();
        }
        int count = 0;  //count每次比较表示矩形重叠的数量
        int result = 0; //最终结果
        for (int x : x1) {
            for (int y : y1) {
                for (int i = 0; i < n; i++) {
                    if (x >= x1[i] && x < x2[i] && y >= y1[i] && y < y2[i]) {
                        count++;
                    }
                }
                if (count > result) {
                    result = count;
                }
                count = 0;
            }
        }
        System.out.println(result);
    }
}

