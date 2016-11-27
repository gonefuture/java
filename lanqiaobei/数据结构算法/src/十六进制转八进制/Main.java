package 十六进制转八进制;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		new Main().systemScanner();
	}
	public void systemScanner()
	{
		Scanner jin = new Scanner(System.in);
		while (jin.hasNext())
		{
			int length = jin.nextInt();
			for (int i = 0; i < length; i++)
			{
				String strTmp=jin.next();
				tranform(strTmp.toCharArray(), strTmp.length());
			}
		}
	}
	/*
	 * 3位16进制等价于4位8进制
	 */
	int[] stack=new int[40000];
	public void tranform(char[] str, int length)
	{
		
		int top = -1;
		for (int i = length - 1; i >= 0; i -= 3)//从右往左把16进制数每3个分段
		{
			int sum = 0;
			//循环段内的每个字符
			for (int j = 0; j < 3 && i - j >= 0; j++)
			{
				int tmp = str[i - j] >= '0' && str[i - j] <= '9' ? str[i - j] - '0'
					: str[i - j] - 'A' + 10;//在段中，从右往左。把16进制转成10进制
					System.out.println(i+","+j+","+tmp);
				sum += (tmp << (4 * j));
				System.out.println("sum:"+sum);
				
			}
			stack[++top] = sum;
		}
		while (stack[top] == 0)
		{
			top--;
		}
		for (int i=top;i >= 0;i--)
		{
			String str1=Integer.toOctalString(stack[i]);
			if (i != top && str1.length() < 4)
			{
			
				for (int y=0;y < 4 - str1.length();y++)
					System.out.print("0");
			}
			System.out.print(str1);
		}
		System.out.println();

	}
}
