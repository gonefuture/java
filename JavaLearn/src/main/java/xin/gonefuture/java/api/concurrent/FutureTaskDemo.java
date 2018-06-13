package xin.gonefuture.java.api.concurrent;

import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.function.Function;


/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/12/29 22:27.
 * 说明：
 */
class FutureTaskDemo {

    @Test
    void testCallable() {
        //  创建单线程的Executor
        ExecutorService executorService  = Executors.newSingleThreadExecutor();
        //  创建FutureTask并发任务
        FutureTask<String> futureTask = new FutureTask<String>(
                //  使用Callable接口作为构造参数
                () -> {
                    //  真正的任务在这里执行,这里的返回值类型为为String,可以为任意类型
                    System.out.println("这里是Callable的执行");
                    //Thread.sleep(10000);
                    return "这里是Callable异步返回的结果";
                }
        );

        //  执行任务
        executorService.execute(futureTask);
        try {
            System.out.println("主线程中,获取future结果前");
            System.out.println(futureTask.get());
            System.out.println("主线程中,获取future结果后");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            System.out.println("executorService结束");
            executorService.shutdown();
        }
    }


    @Test
    void testThreads() {

        System.out.println("主线程中,前");
        new Thread(
                () -> {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("新线程执行中");
                }
        ).start();

        System.out.println("主线程中,后");
    }


    Function<String,String>  func = (String str) -> {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(str);
        return "str";};

    @Test
    void testCallback() {
        System.out.println("========= 回调前");

        System.out.println("========= 回调后");
    }
}
