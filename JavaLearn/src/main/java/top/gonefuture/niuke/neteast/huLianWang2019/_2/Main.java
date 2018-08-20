package top.gonefuture.niuke.neteast.huLianWang2019._2;

import java.util.Scanner;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/8/13 9:45
 * @version 1.00
 * Description: JavaLearn
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            long[] heap = new long[n];
            long count = 0;
            for (int i=0; i<n; i++) {
                count += sc.nextLong();
                heap[i] = count;
            }
            int m = sc.nextInt();
            long[] qi = new long[m];
            for (int i =0; i<m; i++) {
                qi[i] = sc.nextLong();
            }

            for (int i =0; i<m; i++) {
               System.out.println(binSearch(qi[i],heap)+1);
            }
        }
        sc.close();
    }


    private static int binSearch(long q, long[] heap) {
        int mid = (heap.length)/2;
        if ( q == heap[mid] ) {
            return mid;
        }
        int start = 0;
        int end = heap.length -1;
        while (start <= end) {
            mid = (end - start) / 2 + start ;
            if (q < heap[mid] ) {
                end = mid - 1;
            } else if ( q > heap[mid] ) {
                start = mid +1;
            } else {
                return mid;
            }
        }
        return start;
    }



}
