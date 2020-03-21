package leetcode;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 */
public class 整数反转 {
    public static void main(String[] args) {
        int reverse = reverse(1534236469);
        System.out.println(reverse);
    }
    public static int reverse(int x) {
        String str = "";
        char[] chars = (x+"").toCharArray();
        if (chars[0]=='-'){
            str = "-";
            for (int i = chars.length-1;i>0;i--){
                str += chars[i];
            }
        }else{
            for (int i = chars.length-1;i>=0;i--){
                str += chars[i];
            }
        }
        int num = 0;
        try {
            num = Integer.parseInt(str);
        }catch (NumberFormatException e){
            return 0;
        }
        return num;
    }
}
