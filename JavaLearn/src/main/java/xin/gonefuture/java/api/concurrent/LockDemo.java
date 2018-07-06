package xin.gonefuture.java.api.concurrent;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/10 17:07.
 *  说明：
 */

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <pre> </pre>
 */
public class LockDemo {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        Thread t = new Thread("test");

        Callable<Integer> a = () -> {

            return 10;
        };
    }
}
