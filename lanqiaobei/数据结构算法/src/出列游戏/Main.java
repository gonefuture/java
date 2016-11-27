package 出列游戏;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			String str=scan.next();
			matchKH(str);
		}

	}
	public static void matchKH(String str)
	{
		Stack<Character> stack=new Stack<Character>();

		for (int i=0;i < str.length();i++)
		{
			char temp=str.charAt(i);
			switch (temp)
			{
				case '<':
				case '(':
				case '[':
				case '{':
					stack.push(temp);
					continue;


				case '>':
				case ')':
				case ']':
				case '}':
					char before=stack.peek();
					if (match(before, temp))
					{
						stack.pop();
					}
					else
					{
						System.out.println("No");
						return;
					}
					break;
			}
		}
		if (stack.empty())
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	public static boolean match(char a, char b)
	{
		if ((a == '(' && b == ')')
			|| (a == '[' && b == ']')
			|| (a == '{' && b == '}')
			|| (a == '<' && b == '>'))
		{
			return true;
		}
		return false;
	}
}
