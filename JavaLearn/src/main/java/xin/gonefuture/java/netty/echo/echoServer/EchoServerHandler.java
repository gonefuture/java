package xin.gonefuture.java.netty.echo.echoServer;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/5/13 16:48.
 *  说明：
 */

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.CharsetUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre> </pre>
 */
@ChannelHandler.Sharable    // 标志一个ChannelHandler可以被多个Channel安全地共享
public class EchoServerHandler extends ChannelHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf in = (ByteBuf) msg;
        // 将消息打印到控制台
        System.out.println("Server received: "+ in.toString(CharsetUtil.UTF_8));
        // 将收到的消息写给发送者,而不冲刷出站消息
        ctx.write(in);
        Map map = new HashMap();
    }




}
