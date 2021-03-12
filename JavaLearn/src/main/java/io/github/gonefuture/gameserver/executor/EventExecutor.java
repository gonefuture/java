package io.github.gonefuture.gameserver.executor;

import io.netty.util.concurrent.EventExecutorGroup;
import io.netty.util.concurrent.SingleThreadEventExecutor;

import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class EventExecutor extends SingleThreadEventExecutor {

    /**
     *  执行器的序号
     */
    private int index;

    /**
     *
     * @param index 传入的标记序号
     */
    protected EventExecutor(int index, EventExecutorGroup parent, ThreadFactory threadFactory, boolean addTaskWakesUp) {
        super(parent, threadFactory, addTaskWakesUp);
        this.index = index;
    }

    @Override
    protected void run() {
        do {
            Runnable task = takeTask();
            if (task != null) {
                task.run();
                updateLastExecutionTime();
            }
        } while (!confirmShutdown());
    }


    public Future<?> addTask(AbstractDispatcherHashCodeRunnable task) {
        return submit(task);
    }


    public int getIndex() {
        return index;
    }

    public Future<?> addScheduleTak(AbstractDispatcherHashCodeRunnable task, int delay, TimeUnit timeUnit) {
        return schedule(task, delay, timeUnit);
    }
}
