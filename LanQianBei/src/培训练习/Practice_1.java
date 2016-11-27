package 培训练习;

import java.util.Scanner;

public class Practice_1 {
	public static void main(String[] args) {
		int[] num;
		num=new int[5];
		System.out.println("请输入");
		for(int i=1;i<5;i++){
            Scanner sc=new Scanner(System.in);
            num[i]=(int)sc.nextInt();  
		}
		for(int j:num){
			System.out.print(j+"\t");
		}
	}
}
