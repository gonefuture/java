package 初赛2013.马虎的算式;

/**
 * 深度优先搜索的方法
 */

public class Method_dfs {
	static int kinds =0;
	static int a[]  = new int[6];
	static boolean visit[] = new boolean[10];
	
	static void check(int a[]){
		int num1 = a[1]*10 + a[2];
		int num2 = a[3]*100 + a[4]*10 + a[5];
		int num3 = a[1]*100 + a[4]*10 + a[2];
		int num4 = a[3]*10 + a[5];
		if(num1 * num2 == num3 * num4)
			kinds++;
	}
	
	static void dfs(int start, int n){
		if(start == 6){
			check(a);
		} else {
			for(int i = 1; i < n; i++) {
				if(visit[i])
					continue;
				a[start] = i;
				visit[i] = true;
				dfs(start + 1,n );
				visit[i]  = false;
			}
		}
	}
	
	public static void main(String[] args){
		dfs(1,10);
		System.out.println(kinds);
	} 
}
