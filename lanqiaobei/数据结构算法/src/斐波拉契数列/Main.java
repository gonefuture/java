package 斐波拉契数列;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fib(1000));
	}
	
	private static BigInteger fib(int num) {
		BigInteger[] arr=new  BigInteger[num+1];
		arr[0]=new BigInteger("0");
		arr[1]=new BigInteger("1");
		for(int i=2;i<=num;i++)
		{
			arr[i]=arr[i-1].add(arr[i-2]);
		}
		return arr[num];
	}

}
