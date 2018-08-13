package top.gonefuture.niuke._2018xiaozhao._1;

import java.util.Scanner;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/8/9 18:56
 * @version 1.00
 * Description: JavaLearn
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] money = new int[n];
        for (int i=0; i<n; i++) {
            money[i] = sc.nextInt();
        }

        for (int m: money ) {
            System.out.printf("%.0f\n",tax(m));
        }


    }


    private static double tax(int m) {
        if (m <= 5000 )
            return 0;

        // 不超过3000
        if ((m -5000) <= 3000 ) {
            return ((m-5000)*0.03);
        }
        // 3000-12000
        if ((m -5000) > 3000 && (m- 5000) <=12000) {
            return ((3000*0.03 + (m-5000-3000)*0.1 ));
        }

        // 12000-25000
        if ((m -5000) > 12000 && (m- 5000) <=25000) {
            return (3000*0.03 + (12000-3000)*0.1 + (m-5000-12000)*0.2  );
        }

        // 25000-35000
        if ((m -5000) > 25000 && (m- 5000) <=35000) {
            return (3000*0.03 + (12000-3000)*0.1 + (25000-12000)*0.2 + (m-5000-25000)*0.25  );
        }


        // 35000-55000
        if ((m -5000) > 35000 && (m- 5000) <=55000) {
            return (3000*0.03 + (12000-3000)*0.1 + (25000-12000)*0.2 + (35000-25000)*0.25
            + (m-5000-35000)*0.3);
        }

        // 55000-80000
        if ((m -5000) > 55000 && (m- 5000) <=80000) {
            return (3000*0.03 + (12000-3000)*0.1 + (25000-12000)*0.2 + (35000-25000)*0.25
                    + (55000-35000)*0.3+ (m-5000-55000)*0.35 );
        }

        // 超过80000
        return  (3000*0.03 + (12000-3000)*0.1 + (25000-12000)*0.2 + (35000-25000)*0.25
                + (55000-35000)*0.3+ (80000-55000)*0.35 + (m-5000-80000)*0.45);

    }

}
