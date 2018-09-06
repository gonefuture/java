package top.gonefuture.offer._15;


import java.util.List;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/8/30 17:43
 * @version 1.00
 * Description: 链表中倒数第K个元素
 *  只遍历一次
 *
 *  举一反三:
 *  当我们用一个指针遍历表不能解决问题的时候，可以尝试用两个指针来遍历链表。可以让其中一个指针遍历的
 *  速度快一些（比如一次在链表上两部），或者让先在链表上走若干步。
 *
 *
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


        System.out.println(findKthToTail(listNode,3));


    }

    /*
        两个指针，第一个指针到达k-1处时，第二个指针出发，到第一个指针到达尾部时，第二个指针恰好到达倒数k处。
     */
    private static ListNode findKthToTail(ListNode listNode, int k) {
        if (listNode == null || k == 0) {
            return null;
        }
        // 第一个指针
        ListNode head = listNode;
        // 第二个指针
        ListNode behind = null;

        for (int i=0; i< k-1; ++i) {
            if (head.next != null) {
                head = head.next;
            } else {
                return null;
            }
        }

        behind = listNode;
        while (head.next != null) {
            head = head.next;
            behind = behind.next;
        }
        return behind;
    }
}
