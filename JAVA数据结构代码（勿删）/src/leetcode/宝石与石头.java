package leetcode;

import java.util.Arrays;

/**
 * @Author:daMao
 * @Date: Created in 0:40 2020/5/10
 */
public class 宝石与石头 {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        int [] indexMap = new int[58];
        for (char s:S.toCharArray()){
            indexMap[s-'A']++;
        }
        for (char j:J.toCharArray()){
            result +=   indexMap[j-'A'];
        }
        return result;
    }
}
