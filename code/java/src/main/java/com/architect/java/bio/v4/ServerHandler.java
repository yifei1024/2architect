package com.architect.java.bio.v4;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * @author yifei
 */
public class ServerHandler implements Runnable{
    private Socket socket;

    public ServerHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        InputStream ins = null;
        try {
            ins = socket.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] bytes = new byte[1024];

        while (true) {
            try {
                if ((ins.read(bytes)) == -1) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(new String(bytes));
        }
    }
}
