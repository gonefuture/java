/**  
 * 
 * @Title:  NettyOIOServer.java   
 * @Package xin.gonefuture.java.netty.transmission   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: qianweijian gonefuture@qq.com   
 * @date:   2018年7月10日 上午11:16:55   
 * @version V1.0 
 */
package xin.gonefuture.java.netty.transmission;

import java.net.InetSocketAddress;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

import io.netty.channel.ChannelInitializer;

import io.netty.channel.EventLoopGroup;
import io.netty.channel.oio.OioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.oio.OioServerSocketChannel;


/**
 * @author gonefuture
 *
 */
public class NettyOIOServer {
	
	private Logger log = LoggerFactory.getLogger(NettyOIOServer.class);
	public void server(int port) throws Exception{
		final ByteBuf buf  = Unpooled.unreleasableBuffer(
				Unpooled.copiedBuffer("阻塞IO \r\n".getBytes()));
		EventLoopGroup group = new OioEventLoopGroup();
		try {
			// 创建启动器
			ServerBootstrap bootstrap = new ServerBootstrap();
			bootstrap.group(group)
			// 使用OioServerSocketChannel以允许阻塞模式（旧的I/O）
			.channel(OioServerSocketChannel.class)
			// 
			.localAddress(new InetSocketAddress(port))
			// 指定ChannelInitializer，对于每个已经接受的连接都调用它
			.childHandler(new ChannelInitializer<SocketChannel>() { 
				// 
				@Override
				public void initChannel(SocketChannel ch) throws Exception {
					ch.pipeline()
					.addLast(
							// 添加一个ChannelHandlerAdapter以拦截和处理事件
							new ChannelHandlerAdapter () {
								@Override
								public void channelActive(ChannelHandlerContext ctx)  throws Exception{
									// 将消息写到客户端，并台南佳ChannelFutureListener以便消息已被写完就关闭连接
									ctx.writeAndFlush(buf.duplicate())
									.addListener(ChannelFutureListener.CLOSE);
						}
					});
				}
			});
			// 绑定服务器以接受连接
			ChannelFuture  future = bootstrap.bind().sync();
			future.channel().closeFuture().sync();
		} finally {
			// 释放所有资源
			group.shutdownGracefully().sync();
		}
		
	}

}
