/**  
 * 
 * @Title:  NettyOIOServer.java   
 * @Package top.gonefuture.java.netty.transmission
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: qianweijian gonefuture@qq.com   
 * @date:   2018年7月10日 下午12:11:36   
 * @version V1.0 
 */
package top.gonefuture.java.netty.transmission;



import org.junit.Test;

/**
 * @author gonefuture
 *
 */
public class NettyOIOServerTest {
	
	@Test
	public void testNettyOioServer() {
		NettyOIOServer nettyOIOServer = new NettyOIOServer();
		try {
			nettyOIOServer.server(9999);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
