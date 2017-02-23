package 初赛2013.黄金连分数;

import java.math.BigDecimal;

/**
 * 
 *                1
    黄金数 = ---------------------
                        1
             1 + -----------------
                          1
                 1 + -------------
                            1
                     1 + ---------
                          1 + ...

                           

    这个连分数计算的“层数”越多，它的值越接近黄金分割数。

    请你利用这一特性，求出黄金分割数的足够精确值，要求四舍五入到小数点后100位。
 *
 */
public class Main {
	 
	public static void main(String[] args){
		BigDecimal a  = new BigDecimal(100);
		for(int i=0; i<500; i++)
			a =BigDecimal.ONE.add(BigDecimal.ONE.divide(a,100,BigDecimal.ROUND_UP));
            System.out.println(a.subtract(BigDecimal.ONE));		
		
	}
}
