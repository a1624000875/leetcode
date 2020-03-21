package leetcode;


/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * 示例 1：
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 */
public class 替换空格 {
    public static void main(String[] args) {
        String s = replaceSpace("We are happy.");
        System.out.println(s);
    }
    public static String replaceSpace(String s) {
        String[] strArr = s.split("");
        String result = "";
        for (String str:strArr){
            if (str.equals(" ")){
                str = "%20";
            }
            result += str;
        }
        return result;
    }
}
