package top.gonefuture.java.api.concurrent.blockingQueue;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/8/10 16:57
 * @version 1.00
 * Description: JavaLearn
 */

/*
    桌面搜索应用程序中的生产者和消费者任务
 */
public class FileCrawler implements Runnable {
    private final BlockingQueue<File> fileQueue;
    private final FileFilter fileFilter;
    private final File root;

    public FileCrawler(BlockingQueue<File> fileQueue, FileFilter fileFilter, File root) {
        this.fileQueue = fileQueue;
        this.fileFilter = fileFilter;
        this.root = root;
    }


    private void crawl(File root) throws InterruptedException {
        // 过滤文件
        File[] entries = root.listFiles(fileFilter);
        if (entries != null) {
            for (File entry :entries) {
                if (entry.isDirectory())
                    crawl(entry);
                else
                    fileQueue.put(entry);
            }
        }
    }

    @Override
    public void run() {
        try {
            crawl(root);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }



}
