package top.gonefuture.java.api.Date;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/23 20:24.
 *  说明：
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

/**
 * <pre> </pre>
 */
public class DateTest {

    HashMap hashMap;

    public static void main(String[] args) throws ParseException {


        Calendar calendar = Calendar.getInstance();
        String s = "20180505";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = sdf.parse(s);
        calendar.setTime(date);
        System.out.println(date);
        System.out.println(calendar.getTime());
        System.out.println(sdf.format(calendar.getTime()));
    }






}
