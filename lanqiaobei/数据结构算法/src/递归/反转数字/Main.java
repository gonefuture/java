package 递归.反转数字;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reserve(123456);
	}

	private static void reserve(int num) {
		int yu;
		if(num<10){
			yu=num;
			System.out.print(yu);
			return;
			
		}

		 yu= num%10;
		 System.out.print(yu);
		 reserve(num/10);

	}
}
