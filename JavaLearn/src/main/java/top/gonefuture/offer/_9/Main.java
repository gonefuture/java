package top.gonefuture.offer._9;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/8/30 12:27
 * @version 1.00
 * Description: JavaLearn
 */
public class Main {

    public static void main(String[] args) {

        fibonacci(2);
    }

    private static  long fibonacci(int n) {
        if (n == 1) {
            System.out.print(1);
            return 1;
        }

        if (n == 2) {
            System.out.print("1 1 ");
            return 1;
        }
        System.out.print("1 1 ");
        long a = 1;
        long b =1;
        long c = 0;
        for (int i=0; i< n;i++ ) {
            c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
        System.out.println();
        return c;
    }
}
