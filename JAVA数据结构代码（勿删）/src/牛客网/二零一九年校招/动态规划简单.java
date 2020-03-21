package 牛客网.二零一九年校招;

/**
 * 题目描述
 * 众所周知，牛妹非常喜欢吃蛋糕。
 * 第一天牛妹吃掉蛋糕总数三分之一多一个，第二天又将剩下的蛋糕吃掉三分之一多一个，以后每天吃掉前一天剩下的三分之一多一个，
 * 到第n天准备吃的时候只剩下一个蛋糕。
 * 牛妹想知道第一天开始吃的时候蛋糕一共有多少呢？
 *
 * 示例1
 * 输入
 * 2
 * 输出
 * 3
 * 示例2
 * 输入
 * 4
 * 输出
 * 10
 * 备注:
 * 0<n< 30
 */
public class 动态规划简单 {
    public static void main(String[] args) {
        System.out.println(cakeNumber(2));
    }

    /**
     *
     * @param n int整型 只剩下一只蛋糕的时候是在第n天发生的．
     * @return int整型
     */
    public static int cakeNumber (int n) {
        if(n == 1) {
            return 1;
        }
        int result = 1;
        for(int i = 2; i <= n; i++) {
            result = (result + 1)*3/2;
        }
        return result;
    }
}
