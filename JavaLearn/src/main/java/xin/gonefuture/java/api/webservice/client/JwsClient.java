package xin.gonefuture.java.api.webservice.client;

import xin.gonefuture.java.api.webservice.HelloJws;
import xin.gonefuture.java.api.webservice.HelloJwsService;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2018/2/27 17:00.
 * 说明：
 */
public class JwsClient {
    public void run() {
        //  获取服务器端连接,此处"HelloJws"为客户端生成的接口
     HelloJws helloJws = new HelloJwsService().getHelloJwsPort();
     System.out.println(helloJws.sayHello("sam wang"));
     System.out.println(helloJws.getBornDesc("Sam Wang","北京"));

    }

    public static void main(String[] args) {
        JwsClient jc = new JwsClient();
        jc.run();
    }
}
