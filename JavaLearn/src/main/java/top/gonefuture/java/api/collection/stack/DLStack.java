package top.gonefuture.java.api.collection.stack;

import java.util.LinkedList;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/8/22 10:41
 * @version 1.00
 * Description: JavaLearn
 */
public class DLStack implements Stack<Integer> {

    private LinkedList<Integer> storage = new LinkedList<>();


    /**
     * 压出元素
     *
     * @param v 元素
     */
    @Override
    public void push(Integer v) {
        storage.addFirst(v);
    }

    /**
     * 获取栈顶元素，但并不将其从栈顶移除。
     *
     * @return 栈顶元素
     */
    @Override
    public Integer peek() {
        return storage.getFirst();
    }

    /**
     * 移除并返回栈顶元素
     *
     * @return 栈顶元素
     */
    @Override
    public Integer pop() {
        return storage.removeFirst();
    }

    /**
     * 判断栈是否为空
     *
     * @return 是否为空
     */
    @Override
    public boolean empty() {
        return storage.isEmpty();
    }

    /**
     * 获取栈的大小
     *
     * @return 栈的大小
     */
    @Override
    public long size() {
        return storage.size();
    }

   public String toString(){
        return storage.toString();
    }
}
