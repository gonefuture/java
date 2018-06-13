package xin.gonefuture.java.dynamicProxyDemo;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/1 10:52.
 *  说明：
 */

import java.lang.reflect.Proxy;

/**
 * <pre> </pre>
 */
public class DynamicProxy {

    public static void main(String[] args) {
        IHello hello = enhanceHello(new RealHello()); // 增强原始方法
        hello.sayHello("hello");
    }

    public static IHello enhanceHello(IHello target) {
        return (IHello) Proxy.newProxyInstance(DynamicProxy.class.getClassLoader(), new Class<?>[] {IHello.class},
                new HelloDelegate(target));
    }
}
