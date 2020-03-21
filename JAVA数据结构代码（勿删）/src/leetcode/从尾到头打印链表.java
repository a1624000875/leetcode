package leetcode;

import java.util.Stack;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 示例 1：
 *class ListNode {
 *      int val;
 *      ListNode next;
 *      ListNode(int x) { val = x; }
 *  }
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 */
public class 从尾到头打印链表 {
    public static void main(String[] args) {
    }
    public static int[] reversePrint(ListNode head) {
        Stack stack = new Stack();
        ListNode listNode = head;
        int length = 0;
        while (listNode!=null){
            stack.push(listNode.val);
            listNode = listNode.next;
            length++;
        }
        int[] arr = new int[length];
        for (int i=0;i<arr.length;i++){
            arr[i] = (int) stack.pop();
        }
        return arr;
    }
}

