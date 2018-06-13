package xin.gonefuture.niuke;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/5 16:45.
 *  说明：
 */

import java.util.concurrent.atomic.AtomicInteger;

/**
 * <pre> </pre>
 */
public  class Test {
        static AtomicInteger i = new AtomicInteger(10);

        public static void main(String[] args) {
            i.compareAndSet(1,2);
        }

}