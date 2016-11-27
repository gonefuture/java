package 递归.求阶乘;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getN(4));
	}

	private static int getN(int n) {
		if(n==1)
			return 1;
		else
			return getN(n-1)*n;
	}
}
