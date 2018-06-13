package xin.gonefuture.niuke._2017xiaozhao.Fibonacci;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/2 18:18.
 *  说明：
 */

import java.util.Scanner;

/**
 * <pre> </pre>
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isFibonacci(n);
    }

    static void isFibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i= 0; i<1000000; i++) {
            c = a+b;
            a = b;
            b = c;
            //System.out.println(a+"  "+b);
            if (n <= b) break;
        }

        System.out.println(Math.min(b-n,n-a));
    }
}
