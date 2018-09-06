package top.gonefuture.offer._7;

import top.gonefuture.java.api.collection.stack.Stack;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/8/29 16:49
 * @version 1.00
 * Description: 两个栈实现队列
 */

class DoubleStackQueue<E> {
    Stack<E> stack1;
    Stack<E> stack2;

    public void appendTail(E e) {
        stack1.push(e);
    }

    public E deleteHead() {
        return null;
    }


}
public class Main {

    public static void main(String[] args) {

    }


}
