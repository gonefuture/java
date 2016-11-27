package 递归.分数字;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(6);
		System.out.println(sum);
	}

	static int sum=0;
	public static void fun(int n) {
		if(n==0)
			sum+=1;
			if(n<0) return;
			//
			fun(n-2);
			fun(n-1);
		}
}
