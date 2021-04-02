package io.github.gonefuture.gameserver.object;

/**
 * 跨服玩家数据:提交跨服事件，发送消息，发奖、存放跨服中的临时数据等
 *
 * @author gonefuture
 * @version 2021/03/29 16:19
 */
public class TransferPlayer {

    /**
     *  玩家id
     */
    private long playerId;


    public long getPlayerId() {
        return playerId;
    }
}
