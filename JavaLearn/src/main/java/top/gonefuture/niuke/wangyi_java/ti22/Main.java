package top.gonefuture.niuke.wangyi_java.ti22;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/3 22:00.
 *  说明：
 */

import java.util.Scanner;

/**
 * <pre>
 * 牛牛以前在老师那里得到了一个正整数数对(x, y), 牛牛忘记他们具体是多少了。
 *
 * 但是牛牛记得老师告诉过他x和y均不大于n, 并且x除以y的余数大于等于k。
 * 牛牛希望你能帮他计算一共有多少个可能的数对。</pre>
 */
public class Main {

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int x=1; x<n; x++) {
            for (int y=1;y<n;y++) {
                if (x%y >= k ) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
