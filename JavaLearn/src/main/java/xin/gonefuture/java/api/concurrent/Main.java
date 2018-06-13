package xin.gonefuture.java.api.concurrent;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.function.Function;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/12/29 22:52.
 * 说明：
 */
public class Main {

    static Function<String,String> func = (String str) -> {

        new Thread(
                () -> {
                    System.out.println("回调的新线程  :"+str);
                }
        ).start();
        Integer i = Integer.MAX_VALUE;
        ArrayList<Integer> longArrayList = new ArrayList<>();
        for (;i>0;i--) {
           // longArrayList.add(i);
        }

        System.out.println("回调中  :"+str);
        return "str";};

    public static void main(String[] args) {

        System.out.println("========= 回调前");
        test(func);
        System.out.println("========= 回调后");

    }

    static void test(Function<String,String> func) {
        func.apply("这是回调");
    }


}
