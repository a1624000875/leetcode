package leetcode;

/**
 * @Author:daMao
 * @Date: Created in 0:35 2020/5/10
 */
public class 整数的各位积和之差 {
    public int subtractProductAndSum(int n) {
        String str = n+"";
        String[] split = str.split("");
        int ji=1,he =0;
        for (String s:split){
            ji *= Integer.parseInt(s);
            he += Integer.parseInt(s);
        }
        return ji-he;
    }
}
