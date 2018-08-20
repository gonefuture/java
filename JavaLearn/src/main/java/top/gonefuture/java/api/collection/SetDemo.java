package top.gonefuture.java.api.collection;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/5/16 19:42.
 *  说明：
 */

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * <pre> </pre>
 */
public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> result = new HashSet<>();

        Set<Integer> setA = new HashSet<Integer>(){
            {
                add(1);
                add(2);
                add(18);
            }
        };

        Set<Integer> setB = new HashSet<Integer>(){
            {
                add(1);
                add(23);
                add(3);
            }
        };


        // 交集
        result.clear();
        result.addAll(setA);
        result.retainAll(setB);
        System.out.println(result);

        // 并集
        result.clear();
        result.addAll(setA);
        result.addAll(setB);
        System.out.println(result);

        // 差集
        result.clear();
        result.addAll(setA);
        result.removeAll(setB);
        System.out.println(result);


        System.out.println("==============");



    }
}

