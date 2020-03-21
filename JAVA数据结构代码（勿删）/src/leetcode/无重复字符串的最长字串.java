package leetcode;


import java.util.ArrayList;

import java.util.HashSet;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class 无重复字符串的最长字串 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring2("bbbbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) {
            return 1;
        }
        HashSet<Character> hashSet = new HashSet();
        int length = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j < chars.length; j++) {
                if (!hashSet.contains(chars[j])) {
                    hashSet.add(chars[j]);
                } else {
                    if (length < hashSet.size()) {
                        length = hashSet.size();
                    }
                    hashSet = new HashSet();
                    break;
                }
            }
        }
        return length;
    }

    public static int lengthOfLongestSubstring2(String s) {
        int length = s.length();
        if (length < 1) return 0;
        int maxLen = 1;
        for (int head = 0, tail = 1; tail < s.length(); tail++) {
            char c = s.charAt(tail);
            int index = s.indexOf(c, head);
            if (index < tail) {
                head += (index - head + 1);
            }
            int len = tail - head + 1;
            maxLen = len > maxLen ? len : maxLen;
        }
        return maxLen;
    }
}
