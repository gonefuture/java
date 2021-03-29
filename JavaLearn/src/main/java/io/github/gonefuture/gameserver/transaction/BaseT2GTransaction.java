package io.github.gonefuture.gameserver.transaction;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * 跨服事务基类， 战斗服
 *
 * @author gonefuture
 * @version 2021/03/29 16:12
 */
public class BaseT2GTransaction<ReturnMsg> {
    /**
     *  事务所属玩家
     */
    private long playerId;

    /**
     *  事务开始时间
     */
    private long beginTime;

    /**
     *  事务已经被执行标记，用于解决超时检测与事务返回并发问题
     */
    private AtomicBoolean run = new AtomicBoolean(false);

    /**
     *  是否执行事务
     */


}
