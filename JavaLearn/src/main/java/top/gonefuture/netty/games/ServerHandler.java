package top.gonefuture.netty.games;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/9/10 12:12
 * @version 1.00
 * Description: 游戏连接处理类
 */
class ServerHandler extends ChannelInboundHandlerAdapter {

    //  当客户端连上服务器的时候触发此函数
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("client: " + ctx.channel().id() + "  加入连接");
        ctx.write("client: " + ctx.channel().id() + " 加入连接");
        ctx.flush();
    }

    // 当客户端断开连接的时候触发函数
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("client: " + ctx.channel().id() + "  leave server");
    }

    // 当客户端发送数据到服务器会触发此函数
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        System.out.println(((ByteBuf) msg).toString(CharsetUtil.UTF_8));
        RoleMoveController roleMoveController = new RoleMoveController(msg);

        ByteBuf result = roleMoveController.result();

        System.out.println("========="+result.toString(CharsetUtil.UTF_8));
        // 将收到的消息写给发送者,而不冲刷出站消息
        ctx.writeAndFlush(result.toString(CharsetUtil.UTF_8));

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.out.println("exceptionCaught");
    }
}

