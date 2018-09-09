package top.gonefuture.offer._16;

import java.util.List;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/9/6 11:27
 * @version 1.00
 * Description: 反转链表
 */

class ListNode {
    int key = -1;
    ListNode next;

    @Override
    public String toString() {
        return "ListNode{" +
                "key=" + key +
                ", next=" + next +
                '}';
    }
}

public class Main {


    public static void main(String[] args) {

        ListNode listNode = new ListNode();
        ListNode node = listNode;
        for (int i=0; i<9; i++) {
            node.key = i;
            // 填充号第9个节点后就结束。
            if (i==8)
                break;
            node.next = new ListNode();
            node = node.next;
        }

        System.out.println(listNode);

        System.out.println(reverseList(listNode));

     }




    private static ListNode reverseList(ListNode head) {
        ListNode reversedHead  = null;
        ListNode node = head;
        ListNode prev = null;
        while (node != null) {
            ListNode next = node.next;
            if (next == null)
                reversedHead = node;
            node.next = prev;
            prev = node;
            node = next;
        }
        return reversedHead;
    }
}
