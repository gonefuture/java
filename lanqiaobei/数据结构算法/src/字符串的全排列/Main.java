package 字符串的全排列;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chs="abcd".toCharArray();
		pailie(chs, 0,chs.length);
	}

	static int count=0;
	private static void pailie(char[] chs,int begin,int end)
	{
		if(begin==end-1)
		{
			count++;
			System.out.println(chs);
		}
		else
		{
			for(int i=begin;i<end;i++)
			{
				swap(chs, begin, i);
				pailie(chs, begin+1, end);
				swap(chs, begin, i);
			}
		}
	}
	
	private static void swap(char[] chs ,int a,int b)
	{
		char temp=chs[a];
		chs[a]=chs[b];
		chs[b]=temp;
	}
}
