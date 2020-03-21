package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 找出数组中重复的数字。
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
 * 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * 示例 1：
 *
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 */
public class 数组中重复的数字 {

    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        System.out.println(findRepeatNumber2(nums));
    }
    public static int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            set.add(nums[i]);
            if (set.size()<i+1){
                return nums[i];
            }
        }
        return 0;
    }
    public static int findRepeatNumber2(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i:nums){
            arr[i]++;
            if (arr[i]>1){
                return i;
            }
        }
        return 0;
    }
}
