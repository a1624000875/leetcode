package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author:daMao
 * @Date: Created in 23:47 2020/5/9
 */
public class 拥有最多糖果的孩子 {
    public static void main(String[] args) {
        int[] arrays = {2,3,5,1,3};
        System.out.println(kidsWithCandies(arrays, 3));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(100);
        int max = 0;
        for (int candie:candies){
            if (candie>max){
                max = candie;
            }
        }
        int finalMax = max;
        Arrays.stream(candies).forEach(candie->{
            if (candie + extraCandies >= finalMax) {
                result.add(true);
            } else {
                result.add(false);
            }
        });
        return result;
    }

}
