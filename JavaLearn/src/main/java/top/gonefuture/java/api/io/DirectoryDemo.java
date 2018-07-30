package top.gonefuture.java.api.io;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/7/1 17:08.
 *  说明：
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Arrays;

/**
 * <pre> </pre>
 */
public class DirectoryDemo {

    static Logger logger = LoggerFactory.getLogger(DirectoryDemo.class);




    public static boolean find(File file) {
        File[] files = file.listFiles();
        if (files == null || files.length == 0)
            throw new RuntimeException("输入的目录不存在或者为空");
        Arrays.stream(files)
                .parallel()
                .forEach(
            f -> {
                if (f.isDirectory()) {
                    logger.info("目录: "+f.getAbsolutePath());
                    find(f);
                } else {
                    logger.info("文件"+f.getName());
                }
            }
       );
        return false;
    }
}
