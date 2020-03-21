package leetcode;
/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */

import java.math.BigInteger;
import java.util.Stack;

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }
public class 两数相加 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(8);
        l1.next=new ListNode(9);
        l1.next.next=new ListNode(9);

        ListNode l2 = new ListNode(2);
        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println(getNum(listNode));
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger num1 = getNum(l1);
        BigInteger num2 = getNum(l2);
        String[] str = ((num1.add(num2))+"").split("");
        ListNode listNode = new ListNode(Integer.parseInt(str[str.length-1]));
        ListNode temp = listNode;
        for (int i=str.length-2;i>=0;i--){
            temp.next = new ListNode(Integer.parseInt(str[i]));
            temp = temp.next;
        }
        return listNode;
    }

    public static BigInteger getNum(ListNode l1){
        Stack stack = new Stack();
        while (l1!=null){
            stack.push(l1.val);
            l1 = l1.next;
        }
        int length = stack.size();
        String str ="";
        for (int i =0;i<length;i++) {
            String temp = "";
            temp = stack.pop()+"";
            str += temp;
        }
        BigInteger num = new BigInteger(str);
        return num;
    }
}