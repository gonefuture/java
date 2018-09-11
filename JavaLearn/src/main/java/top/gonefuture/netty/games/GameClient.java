package top.gonefuture.netty.games;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.channel.Channel;
import org.apache.commons.lang3.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/9/11 16:38
 * @version 1.00
 * Description: JavaLearn
 */




/**
 * descripiton: 客户端
 *
 * @author: www.iknowba.cn
 * @date: 2018/3/23
 * @time: 16:40
 * @modifier:
 * @since:
 */
public class GameClient {

    private String ip;

    private int port;

    private boolean stop = false;

    public GameClient(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    public void run() throws IOException {
        //设置一个多线程循环器
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        //启动附注类
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(workerGroup);
        //指定所使用的NIO传输channel
        bootstrap.channel(NioSocketChannel.class);
        //指定客户端初始化处理
        bootstrap.handler(new GameClientHandler());
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
                    System.out.println("输入的信息： "+content);
                    channel.writeAndFlush(content);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.exit(1);
        } finally {
            workerGroup.shutdownGracefully();
        }
    }

    public static void main(String[] args) throws Exception {
        new GameClient("127.0.0.1", 8000).run();
    }
}