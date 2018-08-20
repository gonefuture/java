package xin.gonefuture.goalsOffer;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version : 2018/7/22 21:44.
 *  说明：
 */

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>  <title>数字中的重复数字</title></pre>
 */
public class Title3 {

    public static void main(String ... args) {
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        repeatNumbers(arr);
    }

    /*
     *     利用hashMap的方法
     */
    static void repeatNumbers(int[] arr) {
        Map map = new HashMap();
        for (int i : arr) {
            if (map.get(i) == null) {
                map.put(i,i);
            } else {
                System.out.println(i);
            }
        }

    }



}
