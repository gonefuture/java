/**  
 * 
 * @Title:  PlainNIOServer.java   
 * @Package top.gonefuture.netty.transmission
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: qianweijian gonefuture@qq.com   
 * @date:   2018年7月9日 下午2:20:10   
 * @version V1.0 
 */
package top.gonefuture.netty.transmission;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;





/**
 * @author gonefuture
 *
 */
public class PlainNIOServer {
	Logger logger = LoggerFactory.getLogger(PlainNIOServer.class);
	public void service(int port) throws IOException{
		ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
		serverSocketChannel.configureBlocking(false);
		ServerSocket serverSocket = serverSocketChannel.socket();
		serverSocket.bind(new InetSocketAddress(port));
		// 打开selector处理Channel
		Selector selector = Selector.open();
		// 将ServerSocket注册到Selector以接受连接
		serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
		// 往缓冲区写入消息
		final ByteBuffer msg = ByteBuffer.wrap("Hi ! \r\n".getBytes());
		logger.debug("开始循环");
		for(;;) {
			// 等待需要处理的新事物；阻塞将一直持续到下一个传入事件
			try {
				selector.select();
			} catch (IOException e) {
				// 跳出循环
				break;
			}
			
			// 获取所有接受事件的SelectionKey实例
			Set<SelectionKey> readKeys = selector.selectedKeys();
			Iterator<SelectionKey> iterator = readKeys.iterator();
			while (iterator.hasNext()) {
				SelectionKey key = iterator.next();
				iterator.remove();
				// 检查事件是否是一个新的已经就绪可以被接收的连接
				try {
					if (key.isAcceptable()) {
						logger.debug("从事件的SelectionKey中获取channel");
						ServerSocketChannel server = (ServerSocketChannel) key.channel();
						// 接受客户端，并把他注册到选择器
						SocketChannel client = server.accept();
						client.configureBlocking(false);
						client.register(selector, SelectionKey.OP_WRITE | SelectionKey.OP_READ, msg.duplicate());
						System.out.println("Accepted connection  from " + client);
					}
					// 检查套接字是否已经准备好写数据
					if(key.isWritable()) {
						SocketChannel client = (SocketChannel) key.channel();
						ByteBuffer buffer = (ByteBuffer) key.attachment();
						// 将数据写入已连接的客户端
						while (buffer.hasRemaining()) {
							if (client.write(buffer) == 0) {
								break;
							}
						}
						// 太早关闭channel可能导致消息不能读取
						//client.close();
					}	
				} catch (IOException ex) {
					// 关闭IO句柄
					key.channel();
					try {
						key.channel().close();
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				}
				
				
			}
			
			
		}
		
	}
}
