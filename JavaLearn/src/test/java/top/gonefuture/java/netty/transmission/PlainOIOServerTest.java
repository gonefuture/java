/**  
 * 
 * @Title:  PlainOIOServerTest.java   
 * @Package top.gonefuture.java.netty.transmission
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: qianweijian gonefuture@qq.com   
 * @date:   2018年7月9日 下午12:26:42   
 * @version V1.0 
 */
package top.gonefuture.java.netty.transmission;

import java.io.IOException;

import org.junit.Test;

/**
 * @author gonefuture
 *
 */
public class PlainOIOServerTest {
	
	@Test
	public void testOIO() {
		PlainOIOServer plainOIOServer = new PlainOIOServer();
		try {
			plainOIOServer.server(9999);
		} catch (IOException e) {
			throw new  RuntimeException(e);
		}
	}

}
