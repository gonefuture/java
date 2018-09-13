package top.gonefuture.netty.games;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;


/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/9/10 11:36
 * @version 1.00
 * Description: 游戏服务端
 */

public class GameServer {

    //绑定端口
    public void bind(int port) throws Exception {
        // 逻辑线程组
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        // 工作线程
        EventLoopGroup workGroup = new NioEventLoopGroup();

        ServerBootstrap bootstrap = new ServerBootstrap(); // 启动器
        bootstrap.group(bossGroup, workGroup)
                .channel(NioServerSocketChannel.class)
                .option(ChannelOption.SO_BACKLOG, 1024) // 最大客户端连接数为1024
        .childHandler(new ChannelInitializer<SocketChannel>() {

            @Override
            protected void initChannel(SocketChannel ch) throws Exception {
                // 这里添加业务处理handler
                ch.pipeline().addLast(new ServerHandler());
            }
        });

        try {
            ChannelFuture future = bootstrap.bind(port).sync();
            if (future.isSuccess()) {
                System.out.println("Server starts success at port:"+port);
            }
            future.channel().closeFuture().sync();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            bossGroup.shutdownGracefully();
            workGroup.shutdownGracefully();
        }
    }

    public static void main(String[] args) throws Exception {
        int port = 8000;
        new GameServer().bind(port);
    }

}
