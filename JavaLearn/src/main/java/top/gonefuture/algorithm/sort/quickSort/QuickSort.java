package top.gonefuture.algorithm.sort.quickSort;
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
    private static  int partition(int[] arr, int low, int high) {
        // 定义高和低两个数
        int i= low, j = high;
        // 已最低位的数为基准
        int temp = arr[low];
        //
        while (i != j) {
            while(j>i && arr[j]>=temp)
                j--;

            //
            arr[i] = arr[j];

            while(i<j && arr[i]<=temp )
                i++;
            arr[j]=arr[i];
        }
        arr[i] = temp;
        return i;
    }


    private static void quickSort(int[] arr, int low, int high) {
        // 确保低位索引始终小于高位索引
        if (low < high) {
            int i = partition(arr, low, high);
            // 从低位找
            quickSort(arr,low,i-1);
            // 从高位找
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




    public void quickSort2(int[]a,int start,int end){
        if(start < end){
            int baseNum=a[start];//选基准值
            int midNum;//记录中间值
            int i = start;
            int j = end;
            do{
                while((a[i]<baseNum)&&i<end){
                    i++;
                }
                while((a[j]>baseNum)&&j>start){
                    j--;
                }
                if(i<=j){
                    midNum=a[i];
                    a[i]=a[j];
                    a[j]=midNum;
                    i++;
                    j--;
                }
            }while(i<=j);
            if(start<j){
                quickSort(a,start,j);
            }
            if(end>i){
                quickSort(a,i,end);
            }
        }
    }
}
