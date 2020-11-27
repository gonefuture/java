package top.gonefuture.netty.games;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import top.gonefuture.netty.games.client.GameClient;
import top.gonefuture.netty.games.server.GameServer;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.regex.PatternSyntaxException;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/9/13 14:56
 * @version 1.00
 * Description: 启动类
 */

@Slf4j
@Component
public class Main {


    public static void main(String[] args)  {


        ApplicationContext context = new ClassPathXmlApplicationContext("server.xml");



        log.info("关闭");



    }

}

