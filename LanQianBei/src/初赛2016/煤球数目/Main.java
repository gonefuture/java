package 初赛2016.煤球数目;

/**煤球数目

有一堆煤球，堆成三角棱锥形。具体：
第一层放1个，
第二层3个（排列成三角形），    4
第三层6个（排列成三角形），
第四层10个（排列成三角形），
....
如果一共有100层，共有多少个煤球？*/

public class Main {
	static int sum = 0;
	static int num = 0;
	public static void main(String[] args) {
		System.out.println(f(100));
	} 
	public static int f(int n) {
		for(int i=1; i<=n;i++) {
			num+=i;//每一层的个数  
		     sum+=num;
		}
		return sum;
	}
}
