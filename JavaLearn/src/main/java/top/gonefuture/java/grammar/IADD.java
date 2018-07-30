package top.gonefuture.java.grammar;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/5/17 10:50.
 *  说明：
 */

/**
 * <pre> </pre>
 */
public class IADD {
    static {
        int result = 100;
        int i = 0;
        i = i++;
        System.out.println("i = i++ 后的值: " + i);
        result = i++;
        System.out.println("result: " + result);
        System.out.println("i: " + i);
    }


    static {
        System.out.println("====================================");
        int i = 0;
        i = ++i;
        System.out.println("i = ++i 后的值: " + i);
    }
    public static void main(String[] args) {

    }
}
