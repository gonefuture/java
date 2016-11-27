package 括号匹配2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] strings = new String[n];
		for (int i = 0; i < n; i++) {
			strings[i] = scanner.nextLine();
		}
		for (int i = 0; i < n; i++) {
			sIsMatch(strings[i]);
		}
	}

	/**
	 * 看左右括号是否匹配
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean aIsMatch(char a, char b) {
		if ((a == '(' && b == ')') || (a == '[' && b == ']'))
			return true;
		return false;
	}

	/**
	 * 获取右括号对应的左括号
	 * @param a
	 * @return
	 */
	public static char getOther(char a) {
		char b='\0';
		switch (a) {
		case ')':
			b='(';
			break;
		case ']':
			b='[';
			break;
		}
		return b;
	}
	/**
	 * 判断表达式
	 * @param str
	 */
	public static void sIsMatch(String str) {
		int count = 0;
		LinkedList<Character> stack = new LinkedList<Character>();
		if (str.length() == 0) {
			return;
		}
		int i = 0;
		while (i < str.length()) {
			char ch = str.charAt(i++);
			//如果是左括号
			if (ch == '[' || ch == '(') {
				stack.add(ch);
				//如果是右括号
			} else {
				//如果左括号在栈中
				if(stack.contains(getOther(ch))){
					//看与最近的括号是否匹配
					if (aIsMatch(stack.getLast(), ch)) {
						stack.removeLast();
						continue;
					} else 
					//如果与最近括号不匹配
					{
						//剔除前面不匹配的括号
						while(!aIsMatch(stack.removeLast(), ch)){
							count++;
						}
						
					}
				}
				else {
					count++;
					continue;
				}
			}
		}
			System.out.println(count+stack.size());
	}
}
