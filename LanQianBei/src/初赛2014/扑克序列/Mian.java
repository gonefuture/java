package 初赛2014.扑克序列;

import java.util.Arrays;

/*
 * 标题：扑克序列

    A A 2 2 3 3 4 4， 一共4对扑克牌。请你把它们排成一行。
    要求：两个A中间有1张牌，两个2之间有2张牌，两个3之间有3张牌，两个4之间有4张牌。

    请填写出所有符合要求的排列中，字典序最小的那个。

例如：22AA3344 比 A2A23344 字典序小。当然，它们都不是满足要求的答案。
 */
public class Mian {
	public static void main(String[] args){
		method();
	}
		
	public static void  method (){
		for(int a=1; a<=6; a++){
			for(int b=1; b<=5; b++ ){
				for(int c=1; c<=4; c++){
					for(int d=1; d<=3; d++){
						String str = ""+a+b+c+d+(a+2)+(b+3)+(c+4)+(d+5);
						String[] getStr = str.split("");
						boolean flag = true;
						Arrays.sort(getStr);
						for(int i=0; i<getStr.length-1;i++){
							if(getStr[i].equals(getStr[i+1])){
								flag = false;
								break;
							}
						}
						if(flag){
							System.out.println(str);
						}
					}
				}
			}
		}
	}
	
}
