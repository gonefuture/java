package 初赛2016.生日蜡烛;
/**
 * 生日蜡烛
某君从某年开始每年都举办一次生日party，并且每次都要吹熄与年龄相同根数的蜡烛。

现在算起来，他一共吹熄了236根蜡烛。

请问，他从多少岁开始过生日party的？***/
public class Main {
	
	static int start = 1;
	public static void main(String[] args) {
			for (;start<60;start++){
				int i=start;
				int a = 0;
				for(; i<=60;i++) {
					a+=i;
					if (a == 236) {
						
						System.out.println(start);
					}	
					
			}
			
	
		
		}
	}
}
