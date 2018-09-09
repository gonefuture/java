package top.gonefuture.offer._11;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/8/30 15:32
 * @version 1.00
 * Description: 求一个整数的次方
 */
public class Main {

    public static void main(String[] args) {

    }

    double powerWithUnsignedExponent(double base, int exponent) {
        if (exponent == 0)
            return 1;
        if (exponent == 1)
            return base;
        double result = powerWithUnsignedExponent(base,exponent >> 1);
        result *= result;
//        if (exponent & 0x1 == 1)
//            result *= base;
        return result;
    }





}
