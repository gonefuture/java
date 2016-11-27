package ASCII码排序;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		String ss[]=new String[n];
		for(int i=0;i<n;i++)
		{
			ss[i]=scanner.next();
		}
		for(int i=0;i<n;i++)
		{
			sort(ss[i]);
		}
	}
	private static void sort(String str) {
		char[] chs=str.toCharArray();
		Arrays.sort(chs);
		for(int i=0;i<chs.length;i++)
		System.out.print(chs[i]+" ");
		System.out.println();
	}
	
}
