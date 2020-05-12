package leetcode;

/**
 * @Author:daMao
 * @Date: Created in 0:27 2020/5/10
 */
public class 猜数字 {
    public int game(int[] guess, int[] answer) {
        int result =0 ;
        for (int i=0;i<3;i++){
            if (guess[i]==answer[i])
                result++;
        }
        return result;
    }
}
