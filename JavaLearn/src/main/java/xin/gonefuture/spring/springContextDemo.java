package xin.gonefuture.spring;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/15 21:33.
 *  说明：
 */


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.SynchronousQueue;

/**
 * <pre> </pre>
 */
public class springContextDemo {
    public static void main(String[] args) {
        // 创建应用上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        // 通过xml配置. 注入InjectedObject对象
        InjectedObject o  = (InjectedObject) context.getBean("injectedObject");

        User user = (User) context.getBean("user");

        System.out.println(o);
        System.out.println("================");
        System.out.println(user);




    }
}
