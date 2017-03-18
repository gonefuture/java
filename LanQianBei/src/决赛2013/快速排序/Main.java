package 决赛2013.快速排序;

import java.util.Arrays;

public class Main {
    static int[] x = {1,4,45,7,3};
	public static void main(String[] args) {
		f(x,0,4);
		System.out.println(Arrays.toString(x));
		for(int i=0; i<=x.length-1;i++){
			System.out.print(x[i]+"  ");
		}
		
	}
	static void f(int[] x, int left, int right) {
		if(left >= right) return;
		
		int key = x[(left+right)/2];
		
		int li = left;
		int ri = right;
		while(li<=ri){
			while(x[ri]>key) ri--;
			while(x[li]<key) li++;
			
			if(li <= ri){    //填空位置
				int t = x[li];
				x[li] = x[ri];
				x[ri] = t;
				li++;
				ri--;
			}	
		}
		
		if(li < right) f(x, li, right);
		if(ri > left) f(x, left, ri);
	}
}
/**
 * 标题：快速排序

    快速排序算法是典型的分治思想的运用。它使用某个key把全部元素分成两组，其中一组的元素不大于另一组。
    然后对这两组再次进行递归排序。
    以下代码实现了快速排序。请仔细阅读代码，填写缺少代码的部分。
static void f(int[] x, int left, int right)
{
	if(left >= right) return;
	
	int key = x[(left+right)/2];
	
	int li = left;
	int ri = right;
	while(li<=ri){
		while(x[ri]>key) ri--;
		while(x[li]<key) li++;
		
		if(________________){    //填空位置
			int t = x[li];
			x[li] = x[ri];
			x[ri] = t;
			li++;
			ri--;
		}	
	}
	
	if(li < right) f(x, li, right);
	if(ri > left) f(x, left, ri);
}
 */
