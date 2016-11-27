package Excel地址转换;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	private static char[] table=new char[27];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convert("R100C255");
	}

	/**
	 * 
	 * @param RCtext
	 */
	@SuppressWarnings("unused")
	private static void convert(String RCtext)
	{
		String R="";
		Pattern p=Pattern.compile("R(\\d+)C(\\d+)");
		Matcher matcher=p.matcher(RCtext);
		
		LinkedList<Integer> stack=new LinkedList<Integer>();
		int num=0;
		//先调用find方法
		if(matcher.find())
		 num=Integer.parseInt(matcher.group(2));
		table[0]=(char)'A';
		for(int i=1;i<=26;i++)
		{
			table[i]=(char)('A'-1+i);
		}
		int wei=0;
		int yu=0;
		for (;num>26;) {
			wei++;
			yu=num%26;
			num/=26;
			stack.push(yu);
		}

		stack.push(num);
		System.out.println(stack);
		for (;!stack.isEmpty(); ) {
			
			R+=(table[(stack.pop())]);
		}
		System.out.println(R+matcher.group(1));
	}
}

//Excel是最常用的办公软件。每个单元格都有唯一的地址表示。比如：第12行第4列表示为：“D12”，第5行第255列表示为“IU5”。
//事实上，Excel提供了两种地址表示方法，还有一种表示法叫做RC格式地址。
//第12行第4列表示为：“R12C4”，第5行第255列表示为“R5C255”。
//你的任务是：编写程序，实现从RC地址格式到常规地址格式的转换。
//【输入、输出格式要求】
//用户先输入一个整数n（n<100），表示接下来有n行输入数据。
//接着输入的n行数据是RC格式的Excel单元格地址表示法。
//程序则输出n行数据，每行是转换后的常规地址表示法。
//例如：用户输入：
//2
//R12C4
//R5C255
//则程序应该输出：
//D12
//IU5
