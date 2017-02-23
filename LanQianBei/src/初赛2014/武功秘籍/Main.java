package 初赛2014.武功秘籍;

import java.util.Scanner;

public class Main {
	/**
	 * 
	 * 小明到X山洞探险，捡到一本有破损的武功秘籍（2000多页！当然是伪造的）。
	 * 他注意到：书的第10页和第11页在同一张纸上，但第11页和第12页不在同一张纸上。

    小明只想练习该书的第81页到第92页的武功，又不想带着整本书。请问他至少要撕下多少张纸带走？
	 *
	 */
	public static void main(String[] args){
		int result ;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a%2 != 0 && b%2 ==0){
			result = (a-b)/2+2;
		}
		else {
			result = (a-b)/2+1;
		}
		System.out.println(result);
	}
}
