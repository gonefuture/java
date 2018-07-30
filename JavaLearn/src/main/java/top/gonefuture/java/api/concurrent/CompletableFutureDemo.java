package top.gonefuture.java.api.concurrent;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2018/1/24 16:27.
 * 说明：
 */
public class CompletableFutureDemo {

    public static void main(String[] args) throws Exception {
        System.out.println("主线程开始 "+Thread.currentThread().getName());
        //ExecutorService es = new ScheduledThreadPoolExecutor(10);

        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("异步线程开始 "+Thread.currentThread().getName());
            int sum = 0;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int i=0; i<10000; i++) {
                sum += i;
            }
            System.out.println("异步线程开始返回值");
            return sum;
        });

        completableFuture.thenAcceptAsync(
            (x) -> {
                System.out.println("thenAcceptAsync方法的参数 "+x +" 线程 "+Thread.currentThread().getName());
            }
        );
        //future.join();

        //  主线程的延时
        //Thread.sleep(2000);

        System.out.println("获取future的值前");
       // System.out.println("completableFuture返回的值 "+completableFuture.get());
        System.out.println("获取futured的后");
        Thread.sleep(2000);



    }

}
