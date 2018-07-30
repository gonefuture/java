package top.gonefuture.java.algorithm.sort.quickSort;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/29 17:20.
 *  说明：
 */


import java.util.Arrays;

/**
 * <pre> </pre>
 */
public class QuickSort {

    /**
     *   获取基准
     */
    static public int partition(int[] arr, int low, int high) {
        int i= low, j = high;
        int temp = arr[low];
        while (i != j) {
            while(j>i&&arr[j]>=temp)
                j--;
            arr[i]=arr[j];
            while(i<j&&arr[i]<=temp )
                i++;
            arr[j]=arr[i];
        }
        arr[i] = temp;
        return i;
    }

    static void quickSort(int[] arr, int low, int high) {
        int i;
        if (low < high) {
            i = partition(arr, low, high);
            quickSort(arr,low,i-1);
            quickSort(arr, i+1,high);
        }
    }



    public static void main(String[] args) {
        int n = 0;
        int[] arr  = {2, 5, 45, 5, 1, 6, 8, 10 };
        System.out.println("排序前: "+Arrays.toString(arr));
        quickSort(arr,0, arr.length-1);
        System.out.println("排序后: "+Arrays.toString(arr));

    }
}
