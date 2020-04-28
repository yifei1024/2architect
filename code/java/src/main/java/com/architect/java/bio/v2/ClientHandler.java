package com.architect.java.bio.v2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

import static com.architect.java.bio.Constant.Server.HOST;
import static com.architect.java.bio.Constant.Server.PORT;

/**
 * @author yifei1024
 */
public class ClientHandler implements Runnable {

    private int no;

    public ClientHandler(int no) {
        this.no = no;
    }

    public void run() {
        Socket client = null;
        try {
            client = new Socket(HOST, PORT);
            OutputStream os = client.getOutputStream();
            os.write(("Hello,i am client " + no).getBytes());

            client.getOutputStream().flush();

            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
