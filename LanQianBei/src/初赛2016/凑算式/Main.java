package 初赛2016.凑算式;
/***

     B      DEF
A + --- + ------- = 10
     C      GHI    
（如果显示有问题，可以参见【图1.jpg】）	 
这个算式中A~I代表1~9的数字，不同的字母代表不同的数字。
比如：
6+8/3+952/714 就是一种解法，
5+3/1+972/486 是另一种解法。
这个算式一共有多少种解法？
 */

public class Main {
	static int count;
	public static void main(String[] args) {
		for(int a=1;a<=9;a++){
			for(int b=1;b<=9;b++) {
				if(a==b) continue;
				for(int c=1;c<=9;c++) {
					if(a==c || c==b) continue;
					for(int d=1;d<=9;d++) {
						if(a==d || b==d || c==d) continue;
						for(int e=1;e<=9;e++) {
							if(a==e || b==e || c==e ||d==e) continue;
							for(int f=1;f<=9;f++) {
								if(a==f || b==f || c==f || d==f || e==f ) continue;
									for(int g=1;g<=9;g++) {
										if(a==g || b==g || c==g || d==g || e==g || f==g) continue; 
											for(int h=1;h<=9;h++) {
												if(a==h || b==h || c==h || d==h || e==h ||f==h || g==h) continue; 
													for(int i=1;i<=9;i++) {
														if(a==i || b==i || c==i || d==i ||e==i || f==i ||g==i || h==i) continue;
														if(( a + b*1.0/c + (100*d+10*e+f)*1.0/(100*g+10*h+i)-10 )== 0) {
															count++;
															System.out.println(a + "+" +b+"/"+c);
															System.out.println(count);
														}
													}
											}
									}
							}
							
						}
						
					}
				}
			}
		}
	}
	
}
