package top.gonefuture.leetcode._2;

/**
 * @author gonefuture  gonefuture@qq.com
 * @version 1.00
 * Description: JavaLearn
 * @time 2018/7/27 16:51
 */

/**
 *
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


public class Solution {



    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        ListNode temp;

        a.append(l1.val);
        temp = l1;
        while ( temp.next != null) {
            a.append(l1.next.val);
            System.out.println("a: "+a);
            temp = temp.next;
        }

        b.append(l2.val);
        temp = l2;
        while ( temp.next != null) {
            b.append(l2.next.val);
            System.out.println("b: "+b);
            temp = temp.next;
        }


        int sum = Integer.valueOf(a.reverse().toString()) +
                Integer.valueOf(b.reverse().toString());

        String numStr = String.valueOf(sum);
        int index = numStr.length() -1;

        ListNode listNode = new ListNode(numStr.charAt(index));

        ListNode next = listNode;
        while (index-- >= 0) {
            next.next = new ListNode(index);
            next = next.next;
            System.out.println("index: " + index);
        }

        return listNode;

    }
}