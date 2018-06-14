package xin.gonefuture.java.api.concurrent;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/14 16:02.
 *  说明：
 */


import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <pre> </pre>
 */
public class SubmitDemo {
    private static int init = 10;
    // 这个所是对整个类有效的.如果要对对象有用的话,要注意去掉`static`关键字
    private static Lock lock = new ReentrantLock();


    public static void main(String[] args) {

      //testSubmit();
        testLock();

    }


    private static void testLock() {
        Callable<Integer> task = () -> {
            try {
                System.out.println(lock.tryLock());
                Thread.sleep(100);
                init += 10;
                System.out.println(Thread.currentThread().getName() + "  init的值是: " + init
                        + " 当前时间: " + LocalDateTime.now()
                );
            } finally {
                lock.unlock();
            }
            return init;
        };


        ExecutorService es = Executors.newFixedThreadPool(10);
        for (int i=0; i<10;i++) {
            es.submit(task);
        }

        es.shutdown();
    }




    static void testSubmit() {
        Callable<Integer> task = () -> {
            synchronized(SubmitDemo.class) {
                init += 10;
                System.out.println(Thread.currentThread().getName() + "  init的值是: " + init
                        + " 当前时间: " + LocalDateTime.now()
                );
            }
            return init;
        };


        ExecutorService es = Executors.newFixedThreadPool(10);
        for (int i=0; i<10;i++) {
            es.submit(task);
        }

        es.shutdown();

    }




}
