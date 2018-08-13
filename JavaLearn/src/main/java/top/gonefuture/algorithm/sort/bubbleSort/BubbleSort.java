package top.gonefuture.algorithm.sort.bubbleSort;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/8/8 15:27
 * @version 1.00
 * Description: JavaLearn
 */
public class BubbleSort {


    public void bubbleSort(int []a){
        int len=a.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i-1;j++){//注意第二重循环的条件
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }



}
