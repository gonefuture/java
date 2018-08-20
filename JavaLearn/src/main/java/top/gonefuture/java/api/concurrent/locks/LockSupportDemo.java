package top.gonefuture.java.api.concurrent.locks;

import java.util.concurrent.locks.LockSupport;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/8/14 15:34
 * @version 1.00
 * Description: JavaLearn
 */
public class LockSupportDemo {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        LockSupport.unpark(thread);//释放许可
        //LockSupport.park();// 获取许可
        System.out.println("b");

    }
}
