package com.architect.java.bio.v2;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import static com.architect.java.bio.Constant.Server.PORT;

/**
 * @author yifei
 *
 * 服务器如果没有开一个线程单独去处理客户端的请求，就会阻塞在主线程的读请求中。
 */
public class Server {

    public static void main(String[] args) throws Exception {
        start();
    }

    public static void start() throws Exception {
        ServerSocket server = new ServerSocket(PORT);
        Socket socket;
        while (true) {
            socket = server.accept();
            System.out.println("Accept a client");

            InputStream ins = socket.getInputStream();

            byte[] bytes = new byte[1024];

            while ((ins.read(bytes)) != -1) { // 主线程会阻塞住，等待客户端输入数据。
                System.out.println(new String(bytes));
            }
        }
    }
}
