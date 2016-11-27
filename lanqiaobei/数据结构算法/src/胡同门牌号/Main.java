package 胡同门牌号;

public class Main {

//	标题：胡同门牌号
//
//	小明家住在一条胡同里。胡同里的门牌号都是连续的正整数，由于历史原因，最小的号码并不是从1开始排的。
//	有一天小明突然发现了有趣的事情：
//	如果除去小明家不算，胡同里的其它门牌号加起来，刚好是100！
//	并且，小明家的门牌号刚好等于胡同里其它住户的个数！
//	....还有,小明家并不靠边，左右都有邻居。
//
//	请你根据这些信息，推算小明家的门牌号是多少？
	public static void main(String[] args) {
		// TODO Auto-generated method stub、
		addA2B(2);
	}
	
	private static void addA2B(int a) {
		int sum=0;
		for(int i=a;i<=50;i++)
		{
			sum+=i;
			if((sum-(i-a))==100)
			{
				System.out.println(sum);
				System.out.println(i-a);
				return;
			}
		}
		addA2B(a+1);

			
	}
}