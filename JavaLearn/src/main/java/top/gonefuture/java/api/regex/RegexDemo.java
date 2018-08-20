package top.gonefuture.java.api.regex;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.regex.Pattern;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/8/10 9:49
 * @version 1.00
 * Description: JavaLearn
 */
public class RegexDemo {



    public static void main(String[] args) {


        System.out.println(Pattern.compile("\\d+").matcher("4545").group(0));


    }
}
