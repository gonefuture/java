package 九数分三组;

public class Main {


	//九数分三组
	//
	//1~9的数字可以组成3个3位数，设为：A,B,C, 
	//现在要求满足如下关系：
	//B = 2 * A
	//C = 3 * A
	//
	//请你写出A的所有可能答案，数字间用空格分开，数字按升序排列。
	//
	//注意：只提交A的值，严格按照格式要求输出。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		san();
		System.out.println(isRepeat(121, 456, 789));
	}

	private static void san() {
		int b,c;
		for(int a=111;a<=333;a++)
		{
			b=2*a;
			c=3*b;
			if(!isRepeat(a, b, c)
			&&!isXiangTong(a)&&!isXiangTong(b)&&!isXiangTong(c)
			&&!isContainsZero(a,b,c))
			{
				System.out.println(a);
			}
			
		}
	}
	private static boolean isRepeat(int a,int b,int c)
	{
		String sa=String.valueOf(a);
		String sb=String.valueOf(b);
		String sc=String.valueOf(c);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					if(sa.charAt(i)==sb.charAt(j)
							||sa.charAt(i)==sc.charAt(k)
							||sb.charAt(j)==sc.charAt(k))
					{
						return true;
					}
				}
			}
		}
		
		return false;
		
	}
	private static boolean isXiangTong(int num) {
		int bai=(num/10/10);
		int shi=(num/10%10);
		int ge=(num%10);
		if(bai!=shi&&bai!=ge&&shi!=ge)
			return false;
		else
		   return true;
				
	}
	private static boolean isContainsZero(int a,int b,int c) {
		String sa=String.valueOf(a);
		String sb=String.valueOf(b);
		String sc=String.valueOf(c);
		return (sa.indexOf("0")!=-1)&&(sb.indexOf("0")!=-1)&&(sc.indexOf("0")!=-1);
	}
	
}
