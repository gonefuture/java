package top.gonefuture.offer._12;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/8/30 16:03
 * @version 1.00
 * Description: 打印1到最大的n位数
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();

        BigInteger i = BigInteger.ONE;

        for (;i.compareTo(n)<=0;i=i.add(BigInteger.ONE)) {
            System.out.println(i);
        }

        System.out.println();
    }

}
