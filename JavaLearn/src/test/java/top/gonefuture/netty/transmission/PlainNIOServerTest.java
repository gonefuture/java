/**  
 * 
 * @Title:  PlainNIOServerTest.java   
 * @Package top.gonefuture.netty.transmission
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: qianweijian gonefuture@qq.com   
 * @date:   2018年7月10日 上午10:37:08   
 * @version V1.0 
 */
package top.gonefuture.netty.transmission;

import java.io.IOException;

import org.junit.Test;

/**
 * @author gonefuture
 *
 */
public class PlainNIOServerTest {
	@Test
	public void testNIO() {
		PlainNIOServer plainNIOServer  = new PlainNIOServer();
		try {
			plainNIOServer.service(9999);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
