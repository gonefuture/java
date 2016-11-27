package 读作;
public class Hello
{
	public static void main(String[] args)
	{
		System.out.println(getDuZuo("1000"));
	}

	private static String getDuZuo(String num)
	{
		String nums="零一二三四五六七八九十";
		String wei="十百千万亿";
		StringBuilder numStr=new StringBuilder(num);
		numStr.reverse();
		int len=numStr.length();
		StringBuilder result=new StringBuilder();
		
		for (int i=0;i < len;i++)
		{
			
			result.append(nums.charAt(Integer.parseInt(numStr.charAt(i) + "")));
			switch (i)
			{
				case 0:
					
				case 1:
					
				case 2:
					
				case 3:
					result.append(wei.charAt(i));
					break;

			}
		}
		if(result.charAt(0)=='零')
		{
			result.replace(0,1,"");
		}
		if (wei.indexOf(result.charAt(result.length()-1)+"")!=-1)
		{
			result.replace(result.length()-1,result.length(),"");
		}
		return result.reverse().toString();
	}
}
