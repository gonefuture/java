package top.gonefuture.niuke.wangyi_java.ti8;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/3 19:55.
 *  说明：
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * <pre> </pre>
 */
public class Test {
    static int a;
    int b;
    static int c;

    public int aMethod() {
        a++;
        return a;
    }

    public int bMethod() {
        b++;
        return b;
    }

    public static int cMethod() {
        c++;
        return c;
    }

    public static void main(String args[]) {
        Test test1 = new Test();
        test1.aMethod();
        System.out.println(test1.aMethod());
        Test test2 = new Test();
        test2.bMethod();
        System.out.println(test2.bMethod());
        Test test3 = new Test();
        test3.cMethod();
        System.out.println(test3.cMethod());

    }
}