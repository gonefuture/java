package xin.gonefuture.java.netty.UsingUDPBroadcastEvent;

import java.net.InetSocketAddress;

/**
 * @author gonefuture  gonefuture@qq.com
 * @version 1.00
 * Description: JavaLearn
 * time 2018/7/25 15:56
 */
/*
  * 日志POJO
 */
public final class LogEvent {
    // 分隔符
    public static final byte SEPARATOR = (byte) ':';
    // 源地址
    private  final InetSocketAddress source;
    // 文件名
    private final String logfile;
    // 日志消息
    private final String msg;
    // 接受的时间戳
    private final long received;

    /*
        用于传出消息的构造函数
     */
    public LogEvent(String logfile, String msg) {
        this(null, -1, logfile, msg);
    }

    public LogEvent(InetSocketAddress source, long received, String logfile, String msg) {
        this.source = source;
        this.logfile = logfile;
        this.msg = msg;
        this.received = received;

    }

    public static byte getSEPARATOR() {
        return SEPARATOR;
    }

    public InetSocketAddress getSource() {
        return source;
    }

    public String getLogfile() {
        return logfile;
    }

    public String getMsg() {
        return msg;
    }

    /*
    返回接受LogEvent的时间
     */
    public long getReceivedTimestamp() {
        return received;
    }
}
