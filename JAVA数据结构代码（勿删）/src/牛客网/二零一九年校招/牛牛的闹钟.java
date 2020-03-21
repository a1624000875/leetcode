package 牛客网.二零一九年校招;

import java.util.Scanner;

/**
 * 题目描述
 * 牛牛总是睡过头，所以他定了很多闹钟，只有在闹钟响的时候他才会醒过来并且决定起不起床。
 * 从他起床算起他需要X分钟到达教室，上课时间为当天的A时B分，请问他最晚可以什么时间起床
 * 输入描述:
 * 每个输入包含一个测试用例。
 * 每个测试用例的第一行包含一个正整数，表示闹钟的数量N(N<=100)。
 * 接下来的N行每行包含两个整数，表示这个闹钟响起的时间为Hi(0<=A<24)时Mi(0<=B<60)分。
 * 接下来的一行包含一个整数，表示从起床算起他需要X(0<=X<=100)分钟到达教室。
 * 接下来的一行包含两个整数，表示上课时间为A(0<=A<24)时B(0<=B<60)分。
 * 数据保证至少有一个闹钟可以让牛牛及时到达教室。
 * 输出描述:
 * 输出两个整数表示牛牛最晚起床时间。
 * 示例1
 * 输入
 * 3
 * 5 0
 * 6 0
 * 7 0
 * 59
 * 6 59
 * 输出
 * 6 0
 */
public class 牛牛的闹钟 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();     //N代表有几个闹钟
        int[] Hi = new int[N];      //Hi代表闹钟响起的时
        int[] Mi = new int[N];      //Mi代表闹钟响起的分
        for (int i = 0; i < N; i++) {
            Hi[i] = scanner.nextInt();
            Mi[i] = scanner.nextInt();
        }
        int X = scanner.nextInt();  //X代表从起床到教室的时间
        int A = scanner.nextInt();  //A代表上课时间的时
        int B = scanner.nextInt();  //B代表上课时间的分
        int getUpTime = 0;      //将起床时间转换位分
        int getToSchoolTime = A * 60 + B;   //将到校时间转换为分
        int resultTime = 0;     //最晚起床时间（分）

        for (int i = 0; i < N; i++) {
            getUpTime = Hi[i] * 60 + Mi[i];     //起床时间（分）
            if (getUpTime + X <= getToSchoolTime) {
                if (resultTime < getUpTime) {
                    resultTime = getUpTime;
                }
            }
        }
        int resultH = resultTime / 60;
        int resultM = resultTime - resultH * 60;
        System.out.println(resultH+" "+resultM);

    }


}
