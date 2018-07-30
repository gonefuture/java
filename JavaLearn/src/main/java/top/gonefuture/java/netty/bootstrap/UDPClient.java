package top.gonefuture.java.netty.bootstrap;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDPClient {

    public static void main(String[] args) {

        //以 "字节数组" 的形式开辟一块内存用于缓存接收到的UDP数据包
        byte[] buffer = new byte[1024];
        //虽然开辟的缓冲内存大小为1024字节，但也可以设置一个小于该值的缓存空间接收数据包
        DatagramPacket rdp = new DatagramPacket(buffer, buffer.length);


        DatagramPacket dp = null;
        DatagramSocket ds = null;
        try {
            //new 一个DatagramSocket对象（即打开一个UDP端口准备从此处发出数据包）
            ds = new DatagramSocket(9998);
        }catch (SocketException e) {
            e.printStackTrace();
        }
        System.out.println("client listen on 9998");

        //将要发送的数据、要发送到什么地址设置好并打成一个 DatagramPacket 包
        dp = new DatagramPacket((new String("Hello!"+9)).getBytes(), (new String("Hello!"+9)).getBytes().length, new InetSocketAddress("10.253.8.233", 9999));

        try {
            ds.send(dp);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(dp.getData().toString());

        while(true) {
            try {
                //receive() 方法是一个阻塞性方法！
                ds.receive(rdp);
            } catch (IOException e) {
                e.printStackTrace();
            }
            //打印下接收到server返回数据
            System.out.println("client:"+new String(buffer, 0, rdp.getLength()));
        }
    }

}
