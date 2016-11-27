/**
 * 
 */
package 分数字;

/**
 * @author zyw
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(p(6, 6));
	}

	/**
	 * @param n 哪个数
	 * @param m 分为几个数
	 * @return
	 */
	private static int p(int n,int m) {
		if(n==1||m==1) 
			return 1;
		else if(m==n)
			return 1+p(n, n-1);
		else if(m>n)
			return p(n, n);
		else {
			return p(n, m-1)+p(n-m, m);
		}
		
	}
}
