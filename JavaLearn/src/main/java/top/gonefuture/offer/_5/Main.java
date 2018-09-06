package top.gonefuture.offer._5;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Stack;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/8/29 15:36
 * @version 1.00
 * Description: 从尾到头打印链表
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

        //printListReversingly_Iteratively(listNode);
        printListReversingly_recursively(listNode);
    }

    // 使用栈来保存
    private static void printListReversingly_Iteratively(ListNode listNode) {
        Stack<ListNode> stack = new Stack<>();

        while (listNode != null) {
            stack.push(listNode);
            listNode = listNode.next;
        }

        while (!stack.empty()) {
            listNode = stack.pop();
            System.out.println(listNode.key);
        }
    }

    // 使用递归
    private static void printListReversingly_recursively(ListNode listNode) {
        if (listNode != null) {
            if (listNode.next != null) {
                printListReversingly_recursively(listNode.next);
            }
            System.out.println(listNode.key);
        }
    }
}
