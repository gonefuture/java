package Excel地址转换;

import java.util.Scanner;
import java.util.Stack;

public class Main_2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();  //必须加上的,不然会导致输入不准确!
		while (n>0) {
			String string=scanner.nextLine();
			String strings[]=string.split("C");
			strings[0]=strings[0].substring(1, strings[0].length());
			int hangshu=Integer.parseInt(strings[0]),lieshu=Integer.parseInt(strings[1]);//获取行数和列数
			/*
			 * 对列数进行变换
			 */
			Stack<Character>stack=new Stack<Character>();
			while(lieshu>0){
				if(lieshu%26==0){
					stack.push('Z');
					lieshu=lieshu/26-1;
				}else {
					stack.push((char)('A'-1+lieshu%26));
					lieshu=lieshu/26;
				}
			}
			while (!stack.empty()) {
				System.out.print(stack.pop());
			}
			System.out.println(hangshu);
			n--;
		}
	}
}
