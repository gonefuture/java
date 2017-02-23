package 初赛2014.矩阵翻硬币;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args){
		
	}
	
	public static void FangFaTwo(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			//因为开方涉及小数，所以采用BiDecimal,Big小数
			BigDecimal x = sc.nextBigDecimal();
			BigDecimal y = sc.nextBigDecimal();
			BigDecimal dealX = deal(x);
			BigDecimal dealY = deal(y);
			System.out.println(dealX.multiply(dealY));
		}
	}

	private static BigDecimal deal(BigDecimal x) {
		//+1操作 
		x = x.add(BigDecimal.valueOf(1));
		//开方操作，太大需要重新定义大数的格式
		MathContext mc = new MathContext(1000,RoundingMode.HALF_DOWN);
		x = new BigDecimal(Math.sqrt(x.doubleValue()),mc);
		//-1操作
		//x = x.add(augend)
		return x;
	}

}
