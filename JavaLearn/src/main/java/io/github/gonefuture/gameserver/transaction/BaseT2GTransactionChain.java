package io.github.gonefuture.gameserver.transaction;

/**
 * 跨服事务链，需要多事务执行同步时使用
 *
 * @author gonefuture
 * @version 2021/03/29 16:09
 */
public abstract class BaseT2GTransactionChain<ReturnMsg> extends BaseT2GTransaction<ReturnMsg> {
}
