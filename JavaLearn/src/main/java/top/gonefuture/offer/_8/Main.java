package top.gonefuture.offer._8;

import java.util.Arrays;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/8/29 18:07
 * @version 1.00
 * Description: 旋转数组的最小数字
 */
public class Main {

    public static void main(String[] args) {
        int[] numbers = {2, 2, 3, 4, 5};
        System.out.println(min(numbers,numbers.length));
    }

    private static int min(int[] numbers, int length) {
        if (numbers == null || length <=0 )
            throw new IllegalArgumentException("Invalid parameters");
        int left = 0;
        int right = length-1;
        int mid = left;
        // 当左边的元素大于小于右边的元素时，
        while (numbers[left] >= numbers[right]) {
            //System.out.println(Arrays.toString(numbers));
            if (right - left == 1) {
                mid = right;
                break;
            }

            // 取中间的元素的坐标
            mid = (left + right) / 2;
            // 如果下标为left, right和mid指向的三个数字相等，
            // 则只能顺序查找
            if (numbers[left] == numbers[right] &&
                    numbers[mid] == numbers[left])
                return MinInOrder(numbers, left,right);



            if ( numbers[mid] >= numbers[left] )
                left = mid;
            else if ( numbers[mid] <= numbers[right])
                right = mid;
        }
        return numbers[mid];
    }


    private static int MinInOrder(int[] numbers, int left, int right) {
        int result = numbers[left];
        for (int i =left+1; i<=right; ++i) {
            if (result > numbers[i])
                result = numbers[i];
        }
        return result;
    }

}
