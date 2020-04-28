package com.architect.java.bio.v4;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

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

        Executor executor = Executors.newFixedThreadPool(10);

        while (true) {
            socket = server.accept();
            System.out.println("Accept a client");

            executor.execute(new ServerHandler(socket));
        }
    }
}
