package xin.gonefuture.java;



import org.junit.Test;
import xin.gonefuture.java.grammar.EnumDemo.Sex;


import java.lang.reflect.Method;
import java.sql.SQLException;
import java.text.SimpleDateFormat;


import java.util.Collections;
import java.util.EnumMap;


import java.util.Set;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

import static xin.gonefuture.java.grammar.staticImport.Function.*;

public  class Main    {

    Throwable throwable;
    Set set;
    EnumMap<Sex,Integer> e;




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
    public static void  main(final String[] args) {

        for( Method m  : Main.class.getDeclaredMethods()) {
            m.getAnnotation(Test.class).expected();
        }


        BlockingDeque d;

        ReentrantLock f;
        ThreadLocal<SimpleDateFormat> dateFormat = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));

        System.out.println(add(1,2));

    }





}



