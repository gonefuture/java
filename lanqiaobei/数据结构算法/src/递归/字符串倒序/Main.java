package 递归.字符串倒序;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse("1234567890", 0);
	}

	private static void reverse(String str,int idx) {
		char ch=str.charAt(idx);
		if(idx==str.length()-1)
		{
			System.out.print(ch);
			return ;
		}
		else{
			reverse(str, idx+1);
			System.out.print(ch);
		}
	}
}
