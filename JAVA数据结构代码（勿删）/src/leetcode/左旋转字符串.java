package leetcode;

/**
 * @Author:daMao
 * @Date: Created in 0:19 2020/5/10
 */
public class 左旋转字符串 {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n)+s.substring(0,n);
    }

}
