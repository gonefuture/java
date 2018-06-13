package xin.gonefuture.java.dynamicProxyDemo;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/1 10:47.
 *  说明：
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <pre> 动态代理 增强类 </pre>
 */
public class HelloDelegate implements InvocationHandler {

    private IHello target;  // 原始对象

    HelloDelegate(IHello target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before print");
        method.invoke(target,args);
        System.out.println("after print");
        return null;
    }
}
