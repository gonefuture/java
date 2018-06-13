package xin.gonefuture.niuke.wangyi_java.ti2;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/3 18:49.
 *  说明：
 */

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
        int m = sc.nextInt();
        List<Integer>  di = new ArrayList<>(n);
        List<Integer>  pi = new ArrayList<>(n);
        List<Integer>  ai = new ArrayList<>(m);

        for (int i=0;i<n;i++) {
            di.add(sc.nextInt());
            pi.add(sc.nextInt());
        }

        for (int i=0;i<m;i++) {
            ai.add(sc.nextInt());
        }

        for (Integer  a : ai) {
            int a_max = 0;
            for (int i=0;i<n;i++) {
                if (pi.get(i)> a_max && a >= di.get(i)) {
                    a_max = pi.get(i);
                }
            }
            System.out.println(a_max);
        }

    }
}
