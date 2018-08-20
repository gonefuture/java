package top.gonefuture.java.api.concurrent.blockingQueue;

import java.io.File;
import java.util.concurrent.BlockingQueue;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/8/10 17:24
 * @version 1.00
 * Description: JavaLearn
 */
public class Indexer implements Runnable {
    private final BlockingQueue<File> queue;

    public Indexer(BlockingQueue<File> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                indexFile(queue.take());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }


    private void indexFile(File file) {
        System.out.println(file);
    }
}
