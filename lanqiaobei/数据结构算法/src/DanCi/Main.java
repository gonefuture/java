package DanCi;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println(getWordCount2(" 6666222ggg Write yu6h hhhh6799uuhggg    "));
		//System.out.println(getWordCount2("yyyyy hhh hh6hhh"));
	}
	
	public static int getWordCount2(String str)
	{
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==' '&&Character.isLetter(str.charAt(i+1)))
			{
				count++;
			}
		}
		if(str.charAt(0)==' ')
			return count;
		return ++count;
	}
	
	/*现有一个英文句子
	*单词中只有小写字母
	*求句子中单词个数
	*/
	public static int getWordCount(String str)
	{
		char temp;
		int count=0;
		boolean isLetter=false;//标记上个字符是否为字母
		for(int i=0;i<str.length();i++)
		{
			temp=str.charAt(i);
			if(!Character.isLetter(temp))
			{
				isLetter=false;
			}
			else if(!isLetter)
			{
				count++;
				isLetter=true;
			}
		}
		return count;
	}
}
