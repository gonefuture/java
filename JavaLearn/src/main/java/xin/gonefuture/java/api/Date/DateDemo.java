package xin.gonefuture.java.api.Date;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/5/16 17:06.
 *  说明：
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * <pre> </pre>
 */
public class DateDemo {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        Date pass = df.parse("2015-9-1");

        Calendar calendar = Calendar.getInstance();

        Date now = new Date();

        calendar.setTime(now);
        calendar.add(Calendar.DATE,-998);

        System.out.println("Calendar类: "+df.format(calendar.getTime()));

        System.out.println((now.getTime() - pass.getTime()) / (24*60*60*1000));

        System.out.println(LocalDateTime.now());



    }
}
