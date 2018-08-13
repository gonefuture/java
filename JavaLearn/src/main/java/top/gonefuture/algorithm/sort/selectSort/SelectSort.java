package top.gonefuture.algorithm.sort.selectSort;

/**
 * @author gonefuture  gonefuture@qq.com
 * @version 1.00
 * Description: JavaLearn
 * @time 2018/8/8 12:26
 */
public class SelectSort {

    /*
     *  ## 3. 简单选择排序

常用于取序列中最大最小的几个数时。

(如果每次比较都交换，那么就是交换排序；如果每次比较完一个循环再交换，就是简单选择排序。)遍历整个序列，将最小的数放在最前面。遍历剩下的序列，将最小的数放在最前面。重复第二步，直到只剩下一个数。

代码实现：

1. 首先确定循环次数，并且记住当前数字和当前位置。
2. 将当前位置后面所有的数与当前数字进行对比，小数赋值给key，并记住小数的位置。
3. 比对完成后，将最小的值与第一个数的值交换。
4. 重复2、3步。
     */

    public void selectSort(int[]a){
        int len = a.length;
        for(int i=0;i<len;i++){ //循环次数
            int value=a[i];
            int position = i;   // 当前位置
            for(int j=i+1;j<len;j++){   //找到最小的值和位置
                if(a[j] < value){
                    value=a[j];
                    position=j;
                }
            }
            a[position]=a[i];   //进行交换
            a[i]=value;
        }
    }
}
