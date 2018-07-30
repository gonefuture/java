package top.gonefuture.niuke.wangyi_java.ti15;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/3 22:46.
 *  说明：
 */

/**
 * <pre> 用1*3的瓷砖密铺3*20的地板有几种方式？ </pre>
 */
public class Main {

    public static void main(String[] args) {
        int[] a = new int[20 + 5];
        a[0] = 1;
        a[1] = 1;
        a[2] = 1;
        a[3] = 2;
        a[4] = 3;
        for (int i = 5; i <= 20; i++) {
            a[i] = (a[i-3] << 1) + a[i-4] + a[i-5];
            System.out.println(i + "  " + a[i]);
        }
    }
}
