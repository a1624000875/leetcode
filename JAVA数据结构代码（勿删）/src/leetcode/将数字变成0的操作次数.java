package leetcode;

/**
 * @Author:daMao
 * @Date: Created in 0:31 2020/5/10
 */
public class 将数字变成0的操作次数 {
    public int numberOfSteps (int num) {
        int result = 0;
        while (num>0){
            if (num%2==0){
                num/=2;
            }else{
                num--;
            }
            result++;
        }
        return result;
    }
}
