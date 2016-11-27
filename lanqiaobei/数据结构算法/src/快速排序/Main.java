package 快速排序;

import java.util.Arrays;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE=50000;
		int[] arr =new int[SIZE];
		Random rd=new Random();
		
		for(int i=0;i<SIZE;i++)
		{
			arr[i]=rd.nextInt(SIZE);
		}
		System.out.println(">>>开始排序"+SIZE+"个数，快排和冒泡比较<<<");
		
		int[] arr1=Arrays.copyOf(arr, SIZE);
		long t1=System.currentTimeMillis();
		quickSort(arr1, 0, arr1.length - 1);
		System.out.println("递归快排用时："+(System.currentTimeMillis()-t1));
		
		int[] arr2=Arrays.copyOf(arr, SIZE);
		long t2=System.currentTimeMillis();
		quickSort2(arr2, 0, arr2.length - 1);
		System.out.println("非递归快排用时："+(System.currentTimeMillis()-t2));
		
		int[] arr3=Arrays.copyOf(arr, SIZE);
		long t3=System.currentTimeMillis();
		Arrays.sort(arr3);
		System.out.println("Array.sort用时："+(System.currentTimeMillis()-t3));
		
		int[] arr4=Arrays.copyOf(arr, SIZE);
		long t4=System.currentTimeMillis();
		maopao(arr4);
		System.out.println("冒泡用时："+(System.currentTimeMillis()-t4));
		
//
//		for (int i : arr2) {
//			System.out.println(i);
//		}
	}

	/**
	 * 冒泡排序升序排序数组
	 * @param arr 要排序的数组
	 * 
	 */
	private static void maopao(int[] arr) {
		int t;
		boolean isChange=true;
		for(int i=0;i<arr.length&&isChange;i++)
		{
			isChange=false;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1]){
				t=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=t;
				isChange=true;
				}
			}
		}
	}
	
	/**
	 * 快速排序
	 * @param arr
	 * @param low
	 * @param high
	 */
	private static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pos = aSort(arr, low, high);
			quickSort(arr, low, pos - 1);
			quickSort(arr, pos + 1, high);
		}
	}
	/**
	 * 快速排序，非递归方式
	 * @param arr
	 * @param low
	 * @param high
	 */
	private static void quickSort2(int[] arr, int low, int high) {
		Stack<Integer> stack=new Stack<Integer>();
		
		if(low<high)
		{
			int pos=aSort(arr, low, high);//pos是基准点
			if(pos-1>low)
			{
				stack.push(low);
				stack.push(pos-1);
			}
			
			if(pos+1<high)
			{
				stack.push(pos+1);
				stack.push(high);
			}
			
			while(!stack.empty())
			{
				int tLow=stack.pop();
				int tHigh=stack.pop();
				pos=aSort(arr, tLow, tHigh);
				if(pos-1>low)
				{
					stack.push(tLow);
					stack.push(pos-1);
					
				}
				if(pos+1<tHigh)
				{
					stack.push(pos+1);
					stack.push(tHigh);
					
				}
			}
		}
	}
	/**
	 * @param arr
	 * @param a
	 * @param b
	 */
	private static void swap(int[] arr, int a, int b) {
		if (a != b) {
			int t = arr[a];
			arr[a] = arr[b];
			arr[b] = t;
		}
	}

	/**
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	private static int aSort(int[] arr, int low, int high) {
		int base = arr[low];// 从左边开始
		while (low < high) {
			while (low < high && arr[high] >= base) {
				high--;
			}
			swap(arr, low, high);

			while (low < high && arr[low] <= base) {
				low++;
			}
			swap(arr, low, high);
		}
		return low;

	}
}
