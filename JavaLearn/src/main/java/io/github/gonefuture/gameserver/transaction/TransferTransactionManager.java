package io.github.gonefuture.gameserver.transaction;

import io.github.gonefuture.gameserver.object.TransferPlayer;

/**
 * 跨服事务管理器
 *
 * @author gonefuture
 * @version 2021/04/02 18:14
 */
public class TransferTransactionManager {

    private static TransferTransactionManager instance;

    public TransferTransactionManager() {
        instance = this;
    }

    public static TransferTransactionManager self() {
        return instance;
    }

    public void beginTransaction(TransferPlayer transferPlayer, BaseT2GTransactionChain transaction) {




    }

    /**
     *  获得在线玩家
     * @param playerId 玩家id
     * @return 跨服id
     */
    public TransferPlayer getOnlinePlayer(long playerId) {
        return null;
    }
}
