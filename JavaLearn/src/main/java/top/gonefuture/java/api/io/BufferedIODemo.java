package top.gonefuture.java.api.io;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/28 15:19.
 *  说明：
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.HashMap;

/**
 * <pre> </pre>
 */
public class BufferedIODemo {
    private static Logger logger = LoggerFactory.getLogger(BufferedIODemo.class);


    public static void main(String[] args) throws IOException {
        BufferedReader br;


//        br = new BufferedReader(new FileReader(new File("hello.txt")));
        InputStream is = BufferedIODemo.class.getClassLoader().getResourceAsStream("hello.txt");
        br = new BufferedReader(new InputStreamReader(is));
        System.out.println("继续执行");
        String tempString;
        int line =1;
        try {
            while ((tempString = br.readLine()) != null) {
                // 显示行号

                logger.debug("line " + line + ": " + tempString);
                line++;
            }
        }finally {
            br.close();
        }


    }
}