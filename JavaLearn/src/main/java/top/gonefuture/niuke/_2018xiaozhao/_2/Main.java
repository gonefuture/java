package top.gonefuture.niuke._2018xiaozhao._2;

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
        String[] passwords = new String[n];
        for (int i=0; i<n; i++) {
            passwords[i] = sc.next();
        }

        for (String password : passwords) {
            if (check(password)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }


    }

    private static boolean check(String password ) {
        if (password.length() <8) {
            return false;
        }

       return false;

    }
}
