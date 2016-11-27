package 大数;
import java.math.*;
import java.util.*;
import java.io.*;
public class Big
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);

		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			BigInteger hex=scan.nextBigInteger(16);
			System.out.println(hex.toString(8));
			
		}
	}
}
