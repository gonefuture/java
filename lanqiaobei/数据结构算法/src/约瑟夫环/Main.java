package 约瑟夫环;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		System.out.println(circle(10, 4, i));
	}

	
	/**
	 * @param m 环的数字个数
	 * @param k 数到退出的数
	 * @param i
	 * @return 
	 */
	private static int circle(int m,int k,int i) {
		
		if(i==1)
			return (m+k-1)%m;
		else
			return (circle(m-1, k, i-1)+k)%m;
	}
}
