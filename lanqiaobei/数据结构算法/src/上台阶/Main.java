package 上台阶;

public class Main {

	/*
	 * 39级台阶，
	 * 1. 每步1或2阶
	 * 2. 必须是偶数步 
	 * 求上台阶的方案数。
	 * 1 2 3 4
	 * 0 1 2 3
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(print(39));
	}

	private static int print(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		return print(n-1)+print(n-2);
	}

}
