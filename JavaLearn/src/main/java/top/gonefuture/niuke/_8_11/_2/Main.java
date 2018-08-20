package top.gonefuture.niuke._8_11._2;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version : 2018/8/11 16:33.
 *  说明：
 */

import java.util.Scanner;

/**
 * <pre> </pre>
 */
public class Main {

    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++ ) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] q =  new int[m];
        for (int i=0; i<m; i++ ) {
            q[i] = sc.nextInt();
        }

        for (int i=0; i<m; i++ ) {
            System.out.println(find(q[i],a));
        }
    }


    private static int find(int qi, int a[]) {
        int index = 1;
        int temp = 0;
        for (int ai :a ) {
            temp += ai;
            if(qi <= temp) {
                return index;
            }
            index++;
        }
        // 不属于任何一堆
        return 0;
    }

}
