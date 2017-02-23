package 初赛2013.马虎的算式;
/**
 *暴力猜数的方法，注意：在方法里定义a,b,c,d,e时不能赋值，要在for循环里赋值。
 */

public class Main {
	public static void main(String[] args) {
		int a , b , c, d, e ;
		int n = 0;
		for ( a = 1; a <= 9; a++) {
			for ( b = 1; b <= 9; b++) {
				if (a == b) {
					continue;
				}
				for (c = 1; c <= 9; c++) {
					if (c == a || c == b) {
						continue;
					}
					for (d = 1; d <= 9; d++) {
						if(d == c || d == b || d == a) {
							continue;
						}
						for (e = 1; e <= 9; e++) {
							for(e = 1; e < 10; e++) {
								if(e == d || e == c || e == b || e == a) {
									continue;
								}
								if((a * 10 + b) * (c * 100 + d * 10 + e) == (a * 100 + d * 10 + b) * (c * 10 + e)) {
									n++;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(n);
	}
}
