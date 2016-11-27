package 递归.十进制转成二进制;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d2b(100);
	}

	private static void d2b(int n) {
		// TODO Auto-generated method stub
		if(n==1||n==0){
			System.out.print(1);
			return;
		}
		d2b(n/2);
		System.out.print(n%2);

	}
}
