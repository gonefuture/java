package top.gonefuture.java.api.concurrent.synchronizer;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CountdownLatchDemo {



    // Simple framework for timing concurrent execution
    private static long time(Executor executor, int concurrency, final Runnable action) throws InterruptedException {
        final CountDownLatch  ready = new CountDownLatch(concurrency);
        final CountDownLatch start = new CountDownLatch(1);
        final CountDownLatch done  = new CountDownLatch(concurrency);

        for (int i=0; i<concurrency; i++) {
            executor.execute( () -> {
                ready.countDown();
                try {
                    start.await();
                    action.run();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    done.countDown();
                }
            });
        }

        ready.await();
        long startNanos = System.nanoTime()/1000;
        start.countDown();
        done.await();
        return System.nanoTime()/1000 - startNanos;
    }


    public static void main(String... args) throws InterruptedException {
        Runnable action = () -> {
            System.out.println(Thread.currentThread() +" 在努力工作");
        };
        long time = time(Executors.newCachedThreadPool(),6, action);
        System.out.println("总共花费的时间" + time);



    }

}
