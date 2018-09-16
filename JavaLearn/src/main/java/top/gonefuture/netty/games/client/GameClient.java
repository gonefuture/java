package top.gonefuture.netty.games.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.channel.Channel;
import io.netty.util.CharsetUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/9/11 16:38
 * @version 1.00
 * Description: JavaLearn
 */


public class GameClient {

    private String ip;

    private int port;

    // 停止标志位
    private boolean stop = false;

    private static Logger LOG = LoggerFactory.getLogger(GameClient.class);

    public GameClient(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    public void run() throws IOException {
        //设置一个多线程循环器
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        //启动附注类
        Bootstrap bootstrap = new Bootstrap();
        //指定所使用的NIO传输channel
        bootstrap.group(workerGroup).channel(NioSocketChannel.class);

        //指定客户端初始化处理
        bootstrap.handler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel ch) throws Exception {
                ch.pipeline().addLast(new GameClientHandler());
            }
        });
        try {
            //连接服务
            Channel channel = bootstrap.connect(ip, port).sync().channel();
            while (true) {
                //向服务端发送内容
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String content = reader.readLine();
                if (StringUtils.isNotEmpty(content)) {
                    if (StringUtils.equalsIgnoreCase(content, "q")) {
                        System.exit(1);
                    }
                    LOG.debug("客户端发送的信息： "+content);
                    channel.writeAndFlush(Unpooled.copiedBuffer(content,CharsetUtil.UTF_8));
                }
            }
            //指定所使用的NIO传输channel
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.exit(1);
        } finally {
            workerGroup.shutdownGracefully();
            LOG.info("释放所有的资源");
        }
    }

    public static void main(String[] args) throws Exception {
        new GameClient("127.0.0.1", 8000).run();
    }
}