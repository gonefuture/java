package top.gonefuture.java.dynamicProxyDemo;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/1 10:43.
 *  说明：
 */

/**
 * <pre> </pre>
 */
public class RealHello implements IHello {
    @Override
    public void sayHello(String s) {
        System.out.println("hello "+ s);
    }
}
