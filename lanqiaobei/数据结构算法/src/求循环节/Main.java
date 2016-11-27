package 求循环节;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(f(11, 36));
	}
	public static int f(int n, int m)
	{
		n = n % m;	
		Vector v = new Vector();
		
		for(;;){
			v.add(n);
			n *= 10;
			n = n % m;
			if(n==0) return 0;
			if(v.indexOf(n)>=0) return v.size();  //填空
		}
	}
}
