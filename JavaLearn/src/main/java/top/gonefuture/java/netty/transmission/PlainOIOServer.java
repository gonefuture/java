/**  
 * 
 * @Title:  PlainOIOServer.java   
 * @Package top.gonefuture.java.netty.transmission
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: qianweijian gonefuture@qq.com   
 * @date:   2018年7月9日 上午11:39:46   
 * @version V1.0 
 */
package top.gonefuture.java.netty.transmission;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;


/**
 * @author gonefuture
 *
 */
public class PlainOIOServer {
	public void server(int port) throws IOException {
		// 将服务绑定到指定端口
		final ServerSocket socket = new ServerSocket(port);
		try {
			// 接受连接
			for(;;) {
				final Socket clientSocket = socket.accept();
				System.out.println(
						"Accepted connection from " + clientSocket);
				// 创建一个新的线程来处理连接
				new Thread(() ->  {
					OutputStream outputStream;
					try {
						outputStream = clientSocket.getOutputStream();
						// 将消息写给已经连接的客户端
						outputStream.write("Hi ! \r\n".getBytes(
								Charset.forName("UTF-8")));
					} catch (IOException e) {
						throw new RuntimeException(e);
					} finally {
						try {
							// 关闭连接
							clientSocket.close();
						} catch (IOException ex) {
							throw new RuntimeException(ex);
						}
						
					}
				}).start();;	// 启动线程
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
