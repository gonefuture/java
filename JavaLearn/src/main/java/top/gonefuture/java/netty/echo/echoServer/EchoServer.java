package top.gonefuture.java.netty.echo.echoServer;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/13 11:12.
 *  说明：
 */

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoop;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.sctp.nio.NioSctpServerChannel;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.net.InetSocketAddress;
import java.sql.Date;


/**
 * <pre> </pre>
 */
public class EchoServer {
    private final int port;

    public EchoServer(int port) {
        this.port = port;
    }

    public static void main(String[] args) throws  Exception {
        if (args.length != 1) {
            System.err.println(
                    "Usage: "+EchoServer.class.getSimpleName() +
                            "<port>");
            return;
        }
        int port = Integer.parseInt(args[0]);

        // 调用服务器的start()方法
        new EchoServer(port).start();
    }

    public void start() throws Exception{
        final EchoServerHandler serverHandler = new EchoServerHandler();

        // 1.创建EventLoopGroup
        EventLoopGroup group = new NioEventLoopGroup();
        // 2.创建ServerBootstrap
        ServerBootstrap bootstrap = new ServerBootstrap();
        try {
            bootstrap.group(group)
                    // 3.指定所使用的NIO传输Channel
                    .channel(NioServerSocketChannel.class)
                    // 4.使用指定的端口设置套接字
                    .localAddress(new InetSocketAddress(port))
                    // 5.添加一个EchoServerHandler到子Channel的ChannelPipeline
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            socketChannel.pipeline().addLast(serverHandler);
                        }
                    });
            // 异步绑定服务器;调用sync()方法阻塞等待直到绑定完成
            ChannelFuture f = bootstrap.bind().sync();
            // 获取Channel的CloseFuture,并且阻塞当前线程知道它完成
            f.channel().closeFuture().sync();
        }finally {
            // 关闭EventLoopGroup释放所有的资源
            group.shutdownGracefully().sync();
        }









        // EchoServerHandler被标注为@Shareable,所以我们可以总是使用同样的实例

        //


    }
}
