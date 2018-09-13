package top.gonefuture.netty.echo.echoServer;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/5/13 16:48.
 *  说明：
 */

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.util.CharsetUtil;


/**
 * <pre> </pre>
 */
@ChannelHandler.Sharable    // 标志一个ChannelHandler可以被多个Channel安全地共享
public class EchoServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf in = (ByteBuf) msg;
        // 将消息打印到控制台
        System.out.println("Server received: "+ in.toString(CharsetUtil.UTF_8));
        // 将收到的消息写给发送者,而不冲刷出站消息
        ctx.write(Unpooled.copiedBuffer("收到,这是回复",CharsetUtil.UTF_8));
    }

    /*
    *   处理异常
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }

    /*
    *   将未决信息冲刷到远程节点,并且关闭Channel
     */
    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {

        ctx.writeAndFlush(Unpooled.EMPTY_BUFFER)
                .addListener(ChannelFutureListener.CLOSE);
    }
}
