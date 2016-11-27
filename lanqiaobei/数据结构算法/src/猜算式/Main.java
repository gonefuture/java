package 猜算式;

import java.util.LinkedList;
import java.util.List;

public class Main {

	private static int count=0;
	private static List<String> list=new LinkedList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6,7,8,9};
		pailie(arr, 0, arr.length);
		System.out.println(count);
	}

	private static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	private static void pailie(int[] arr,int begin,int end)
	{
		if(begin==end-1)
		{
			if((arr[0]*10+arr[1])*(arr[2]*10+arr[3])
					==(arr[4]*10+arr[5])*(arr[6]*100+arr[7]*10+arr[8]))
			{
				
				String temp=(arr[4]*10+arr[5])+"x"+(arr[6]*100+arr[7]*10+arr[8]);
				if(!list.contains(temp)){
					count++;
					list.add(temp);
					System.out.println((arr[0]*10+arr[1])+"x"+(arr[2]*10+arr[3])+"="+(arr[4]*10+arr[5])+"x"+(arr[6]*100+arr[7]*10+arr[8]));
				}
				
			}
		}else {
			for (int i = begin; i < end; i++) {
				swap(arr, begin, i);
				pailie(arr, begin+1, end);
				swap(arr, begin, i);
			}
		}
	}
}
//看下面的算式：
//□□ x □□ = □□ x □□□
//它表示：两个两位数相乘等于一个两位数乘以一个三位数。
//如果没有限定条件，这样的例子很多。
//但目前的限定是：这9个方块，表示1~9的9个数字，不包含0。
//该算式中1至9的每个数字出现且只出现一次！
//比如：
//46 x 79 = 23 x 158
//54 x 69 = 27 x 138
//54 x 93 = 27 x 186
//.....
//请编程，输出所有可能的情况！
//注意：
//左边的两个乘数交换算同一方案，不要重复输出！
//不同方案的输出顺序不重要
