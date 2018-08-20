package top.gonefuture.java;



import org.junit.Test;
import top.gonefuture.java.grammar.EnumDemo.Sex;


import java.lang.reflect.Method;
import java.sql.SQLException;
import java.text.SimpleDateFormat;


import java.util.*;


import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

import static top.gonefuture.java.grammar.staticImport.Function.*;

public  class Main    {

    Throwable throwable;
    HashMap hasp;

    Set set;
    EnumMap<Sex,Integer> e;
    Future f;




    ConcurrentHashMap map;


    {
        try {
            clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    static int cnt = 6;
    {
        System.out.println(super.getClass().getName());
        System.out.println(this.getClass().getName());
    }
    static{
        cnt += 9;
        System.out.println("前面的cnt =" + cnt);
    }

    public static void IntegerTest(String[] args) {
        Integer a = 5;
        Integer b = 2 ;
        Integer c = 3;
        System.out.println(a ==(b+c));
        System.out.println(a.equals(b+c));

        new Main();
        System.out.println("cnt =" + cnt);


    }


    static{
        cnt /=3;
        System.out.println("最后的cnt =" + cnt);

    }

    /**
     *
     * @param args
     * @throws SQLException hhg
     */
    public static void  main(final String[] args) throws InterruptedException {

        for( Method m  : Main.class.getDeclaredMethods()) {
            m.getAnnotation(Test.class).expected();
        }

        Executors.newCachedThreadPool().submit(()-> {System.out.println("aaaaaaaa"); });

        Thread.sleep(3000);
        ThreadLocal<SimpleDateFormat> dateFormat = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));

        System.out.println(add(1,2));

    }





}



