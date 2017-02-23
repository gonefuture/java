package 初赛2014.矩阵翻硬币;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	private static BigInteger sqrt(BigInteger n){
		BigInteger two = BigInteger.valueOf(2);
		BigInteger prv = n.divide(two);
		BigInteger now = prv.add(n.divide(prv)).divide(two);
		while (prv.compareTo(now) > 0){
			prv = now ;             
			now = prv.add(n.divide(prv)).divide(two);
		}
	return now;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigInteger n = sqrt(sc.nextBigInteger());
		BigInteger m = sqrt(sc.nextBigInteger());
		System.out.println(n.multiply(m));
	}
}
