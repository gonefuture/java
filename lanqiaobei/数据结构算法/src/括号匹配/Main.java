package 括号匹配;

import java.util.Scanner;
import java.util.Stack;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=Integer.parseInt(scanner.nextLine());
		String[] strings=new String[n];
		for (int i = 0; i < n; i++) {
			strings[i]=scanner.nextLine();
		}
		for (int i = 0; i < n; i++) {
			sIsMatch(strings[i]);
		}
	}

	public static boolean aIsMatch(char a,char b)
	{
		if((a=='('&&b==')')||(a=='['&&b==']')) return true;
		return false;
	}
	
	public static void sIsMatch(String str)
	{
		Stack<Character> stack=new Stack<Character>();
		if(str.length()==0)
		{
			System.out.println("No");
			return;
		}
		int i=0;
		while(i<str.length())
		{
			char ch=str.charAt(i++);
			if(ch=='['||ch=='(')
			{
				stack.push(ch);
				
			}
			else{
				if(stack.empty())
				{
					System.out.println("No1");
					return;
				}
				
				if(!aIsMatch(stack.pop(), ch))
				{
					System.out.println("No2");
					return;
				}
			}
		}
		if(!stack.empty())
			System.out.println("No");
		else
		System.out.println("Yes");
	}
}
