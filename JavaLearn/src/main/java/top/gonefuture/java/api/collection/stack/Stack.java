package top.gonefuture.java.api.collection.stack;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/8/22 10:28
 * @version 1.00
 * Description: JavaLearn
 */
public interface Stack<T> {

    /**
     *  压出元素
     * @param v 元素
     */
    void push(T v);

    /**
     *  获取栈顶元素，但并不将其从栈顶移除。
     * @return  栈顶元素
     */
    T peek();

    /**
     *  移除并返回栈顶元素
     * @return 栈顶元素
     */
    T pop();

    /**
     *  判断栈是否为空
     * @return  是否为空
     */
    boolean empty();


    /**
     *  获取栈的大小
     * @return  栈的大小
     */
    long size();

    /**
     *  打印栈
     * @return  栈内容
     */
    String toString();


}
