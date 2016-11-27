package 求大数的阶乘;

import java.math.BigInteger;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger os;
		long t=System.currentTimeMillis();
		factorial(100);
		System.out.println();
		System.out.println(System.currentTimeMillis()-t);
	}


	/**
	 * @param n
	 * 计算阶乘
	 * 
	 */
	private static void  factorial(int n) {
		final int MAX=3000;
		int arr[]=new int[MAX];
		Arrays.fill(arr, 0);
		arr[0]=1;
		int s;

		//===============核心代码==================
		for (int i = 2; i <=n; i++) {
			int c=0;
			for (int j = 0; j < MAX; j++) {
			 s=arr[j]*i+c;
				arr[j]=s%10;
				c=s/10;
			}
		}
		//===================================
		int k;
		for( k=MAX-1;k>=0;k--)
			if(arr[k]!=0)break;
		for(int i=k;i>=0;i--)
		{
			System.out.print(arr[i]);
			if(i%30==0)
				System.out.println();
		}
	}
}
