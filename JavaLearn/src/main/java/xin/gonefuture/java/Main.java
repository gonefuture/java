package xin.gonefuture.java;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main   {

    ConcurrentHashMap map;

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
        if (false){
            System.out.println("ffff");
        }

        new Main();
        System.out.println("cnt =" + cnt);


    }


    static{
        cnt /=3;
        System.out.println("最后的cnt =" + cnt);
    };


    public static void  main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("");


        PreparedStatement preparedStatement = connection.prepareStatement("");


        ThreadLocal<SimpleDateFormat> dateFormat = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));

    }





}



