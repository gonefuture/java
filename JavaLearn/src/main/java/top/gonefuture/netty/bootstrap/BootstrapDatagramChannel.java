package top.gonefuture.netty.bootstrap;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.oio.OioEventLoopGroup;
import io.netty.channel.socket.DatagramPacket;
import io.netty.channel.socket.oio.OioDatagramChannel;


import java.net.InetSocketAddress;

public class BootstrapDatagramChannel {

    public static void main(String ... args) {
        // 设置
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(new OioEventLoopGroup())
                .channel(OioDatagramChannel.class)
        .handler(
                new SimpleChannelInboundHandler<DatagramPacket>() {
                    @Override
                    protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket msg) throws Exception {
                        // 记录信息已经被接受
                        System.out.println(
                                "Client received: " + msg);
                    }
                }
        );

        ChannelFuture future = bootstrap.bind(new InetSocketAddress(9998));
        future.addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture future) throws Exception {
                if (future.isSuccess()) {
                    System.out.println("Channel bound");
                } else {
                    System.out.println("Bind attempt failed");
                    future.cause().printStackTrace();
                }
            }
        });

    }

}
