package top.gonefuture.offer._17;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/9/6 12:24
 * @version 1.00
 * Description: 合并后两个排序的链表
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
        ListNode listNode1 = new ListNode();
        ListNode listNode2 = new ListNode();
        ListNode node1 = listNode1;
        ListNode node2 = listNode2;
        for (int i=0; i<9; i++) {
            node1.key = i;
            // 填充号第9个节点后就结束。
            if (i==8)
                break;
            node1.next = new ListNode();
            node1 = node1.next;
        }
        for (int j=0; j<9; j++) {
            node2.key = j;
            // 填充号第9个节点后就结束。
            if (j == 8)
                break;
            node2.next = new ListNode();
            node2 = node2.next;
        }


        System.out.println(listNode1);
        System.out.println(listNode2);
        System.out.println("============");

        ListNode result =merge(listNode1, listNode2);

        while (result != null) {
            System.out.println(result.key);
            result = result.next;
        }
    }


    private static ListNode merge(ListNode head1, ListNode head2) {
        if (head1 == null)
            return head2;
        else if (head2 == null)
            return head1;
        ListNode mergedHead = null;

        if (head1.key < head2.key) {
            mergedHead = head1;
            mergedHead.next = merge(head1.next, head2);
        } else {
            mergedHead = head2;
            mergedHead.next = merge(head1, head2.next);
        }
        return mergedHead;
    }
}
