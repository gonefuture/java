package xin.gonefuture.java.netty.bootstrap;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;


public class UDPServer {
    public static void main(String[] args) {

        //以 "字节数组" 的形式开辟一块内存用于缓存接收到的UDP数据包
        byte[] buffer = new byte[1024];

        //虽然开辟的缓冲内存大小为1024字节，但也可以设置一个小于该值的缓存空间接收数据包
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length);

        DatagramSocket ds = null;
        try {
            //监听在UDP 9999 端口
            ds = new DatagramSocket(9999);
        } catch (SocketException e) {
            e.printStackTrace();
        }
        System.out.println("server listen on 9999");
        while(true) {
            try {
                //receive() 方法是一个阻塞性方法！
                ds.receive(dp);
            } catch (IOException e) {
                e.printStackTrace();
            }
            //从下一行代码中可以学习到一种用字节数组构造字符串对象的方法
            System.out.println(new String(buffer, 0, dp.getLength()));
            String response = "udp receied back."+new String(buffer, 0, dp.getLength());
            DatagramPacket dsp = new DatagramPacket(response.getBytes(),response.length(), new InetSocketAddress("127.0.0.1", 9998)) ; // 所有的信息使用buf保存
            try {
                ds.send(dsp);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
