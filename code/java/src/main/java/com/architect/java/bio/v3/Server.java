package com.architect.java.bio.v3;

import java.net.ServerSocket;
import java.net.Socket;

import static com.architect.java.bio.Constant.Server.PORT;

/**
 * @author yifei
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

            new Thread(new ServerHandler(socket)).start();
        }
    }
}
