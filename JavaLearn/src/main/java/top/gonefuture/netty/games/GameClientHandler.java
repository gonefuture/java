package top.gonefuture.netty.games;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/13 11:26.
 *  说明：
 */

import io.netty.buffer.ByteBuf;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;


/**
 * <pre> </pre>
 */

// 标记该类的实例可以被多个Channel共享
@ChannelHandler.Sharable
public class GameClientHandler extends SimpleChannelInboundHandler<ByteBuf> {

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        // 当被通知Channel是活跃的时候,发送一条信息
        //ctx.writeAndFlush(Unpooled.copiedBuffer("Netty rocks!",CharsetUtil.UTF_8));
    }



    /*
        在发生异常时,记录错误并关闭Channel
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {
        // 记录信息已经被接受
        System.out.println(
                "客户端接受的信息: " + byteBuf.toString(CharsetUtil.UTF_8)
        );
    }
}
