package top.gonefuture.offer._3;

/*
 * @author gonefuture  gonefuture@qq.com
 * time 2018/8/29 10:06
 * @version 1.00
 * Description:
 */

import java.util.Arrays;

/**
 * 题目:在二维数组中的查找
 *
 */
public class Main {
    public static void main(String[] args) {
        int m[][] = new int[3][];
        int n = 0;
        for (int i=0; i<3; i++) {
            int[] c = new int[3];
            for (int j=0; j<3; j++) {
                c[j] = ++n;
            }
            m[i] = c;
        }

        System.out.println(Arrays.deepToString(m));

        System.out.println(find(m, 3, 3, 0));


    }

    private static boolean find(int[][] matrix, int rows, int columns, int number ) {
        boolean found = false;
        // 检验矩阵是否为空
        if (matrix != null && rows >0 && columns >0) {
            int row = 0;
            int column = columns -1;
            while (row < rows && column >=0) {
                if (matrix[row][ column] == number) {
                    found = true;
                    break;
                } else if (matrix[row][column] >number) {
                    -- column;
                } else {
                    ++ row;
                }
            }
        }
        return found;
    }
}
