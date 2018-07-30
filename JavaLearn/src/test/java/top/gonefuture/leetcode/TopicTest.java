package top.gonefuture.leetcode;




import static org.junit.Assert.*;
import org.junit.Test;
import top.gonefuture.leetcode._2.ListNode;
import top.gonefuture.leetcode._2.Solution;

/**
 * @author gonefuture  gonefuture@qq.com
 * @version 1.00
 * Description: JavaLearn
 * @time 2018/7/27 17:21
 */

/**You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Example:

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 Explanation: 342 + 465 = 807.
 */
public class TopicTest {

    @Test
    public void test_2() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next = new ListNode(3);


        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next = new ListNode(4);

        Solution solution = new Solution();
        ListNode listNode = solution.addTwoNumbers(l1, l2);

        System.out.println(listNode.val);
        assertEquals(listNode.val, 7);

        System.out.println(listNode.next.val);
        assertEquals(listNode.next.val,0);

        System.out.println(listNode.next.next.val);
        assertEquals(listNode.next.next.val,8);





    }

}
