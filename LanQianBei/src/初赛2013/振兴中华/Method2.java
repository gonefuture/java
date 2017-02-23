package 初赛2013.振兴中华;
/**
 * 使用回溯依次遍历
 * @author gonefuture
 *
 */

public class Method2 {
	static char[][] s = { { '从', '我', '做', '起', '振' }, { '我', '做', '起', '振', '兴' }, { '做', '起', '振', '兴', '中' },
			{ '起', '振', '兴', '中', '华' } };

	static int count = 0;

	public static void main(String[] args) {
		char[] a = new char[8];
		f(0,0,0,a);
		System.out.println(count);;

	}
	
	public static void f(int jump,int x, int y,char[] a ){
		if(jump > 7)
			return;
		if(x>3)
			return;
		if(y>4)
			return;
		a[jump] = s[x][y];
		if(jump == 7){
		if("从我做起振兴中华".equals(String.valueOf(a)))
		count++;
		}
		
		f(jump+1,x+1,y,a);
		f(jump+1,x,y+1,a);
			
	}

}
