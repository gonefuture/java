package top.gonefuture.niuke.pat.t1;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/21 16:00.
 *  说明：
 */


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <pre> </pre>
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> result = new ArrayList<>();

        for (int i=0; i<n; i++) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = sc.nextBigInteger();
            if (a.add(b).compareTo(c) >0) {
                result.add("Case #"+(i+1)+": true");
            } else {
                result.add("Case #"+(i+1)+": false");
            }

        }

        for (String s : result) {
            System.out.println(s);
        }
    }


}
