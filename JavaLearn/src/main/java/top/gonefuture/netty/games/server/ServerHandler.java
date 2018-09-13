package top.gonefuture.netty.games.server;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.CharsetUtil;
import io.netty.util.concurrent.GlobalEventExecutor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.gonefuture.netty.games.cache.manager.CacheManager;
import top.gonefuture.netty.games.service.RoleLoginService;
import top.gonefuture.netty.games.service.RoleMoveService;


/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/9/10 12:12
 * @version 1.00
 * Description: 游戏连接处理类
 */

@Slf4j
class ServerHandler extends SimpleChannelInboundHandler<ByteBuf> {


    /**
     * 所有的活动用户
     */
    public static final ChannelGroup group = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    //  当客户端连上服务器的时候触发此函数
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        CacheManager cacheManager = CacheManager.getInstance();

        cacheManager.put("hero", RoleLoginService.createRole());
        log.info("客户端: " + ctx.channel().id() + " 加入连接",CharsetUtil.UTF_8);

    }

    // 当客户端断开连接的时候触发函数
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        log.info("客户端: " + ctx.channel().id() + " 已经离线");
    }

    // 当客户端发送数据到服务器会触发此函数

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf byteBuf) throws Exception {
        Channel channel = ctx.channel();
        //当有用户发送消息的时候，对其他的用户发送消息


        log.info("服务端接收到信息： "+byteBuf.toString(CharsetUtil.UTF_8));
        // 将收到的消息写给发送者,而不冲刷出站消息

        // 角色移动
        RoleMoveService service = new RoleMoveService();
        ctx.writeAndFlush(Unpooled.copiedBuffer(Unpooled.copiedBuffer(service.currentLocation(), CharsetUtil.UTF_8)));

        ctx.writeAndFlush(Unpooled.copiedBuffer(Unpooled.copiedBuffer("向"+ byteBuf.toString(CharsetUtil.UTF_8)+
                        "移动了\n", CharsetUtil.UTF_8)));
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        log.error("服务器内部发生错误");
    }
}

