package io.github.gonefuture.gameserver.transaction;

import java.util.LinkedList;

/**
 * 跨服事务队列：用于保证多个服的事务操作同步
 *
 * @author gonefuture
 * @version 2021/03/29 16:04
 */
public class TransferTransactionQueue {

    /**
     *  当前是否有事务正在执行中
     */
    private boolean running = false;



    /**
     *  事务节点
     */
    private class TransactionNode {
        private long playerId;

    }
}
