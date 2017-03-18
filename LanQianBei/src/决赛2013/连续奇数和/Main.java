package 决赛2013.连续奇数和;

import java.util.Scanner;

public class Main {  
	  
    public static void main(String[] args) {  
        Scanner input=new Scanner(System.in);  
        int n=input.nextInt();  
        input.close();  
        int begin=1;  
        int end=-1;  
        int sum=0;  
        while(sum!=Math.pow(n, 3)){  
            if(sum<Math.pow(n, 3)){  
                end+=2;  
                sum+=end;     
            }else{  
                sum-=begin;  
                begin+=2;  //这一步很关键，每一次孙<111^3的时候，说明需要更大起始数
            }  
        }  
        System.out.println(begin+" "+end);  
    }  
  
}  
	/**
标题：连续奇数和

    小明看到一本书上写着：任何数字的立方都可以表示为连续奇数的和。

    比如：
 
2^3 = 8 = 3 + 5
3^3 = 27 = 7 + 9 + 11
4^3 = 64 = 1 + 3 + ... + 15
    虽然他没有想出怎么证明，但他想通过计算机进行验证。

    请你帮助小明写出 111 的立方之连续奇数和表示法的起始数字。如果有多个表示方案，选择起始数字小的方案。      
	***/