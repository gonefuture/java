package 补码;
import java.math.*;

public class Main
{
	public static void main(String[] args)
	{
		BigInteger a=new BigInteger("11111011",2);
		System.out.println(new String(Integer.toBinaryString(a.not().intValue())).length());
	}
}
