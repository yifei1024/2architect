package com.architect.java.bio.v1;

import java.net.Socket;

import static com.architect.java.bio.Constant.Server.HOST;
import static com.architect.java.bio.Constant.Server.PORT;


/**
 * @author yifei
 */
public class Client {

    public static void main(String[] args) throws Exception {
        Client client = new Client();

        client.start();
    }

    public void start() throws Exception {
        Socket client = new Socket(HOST, PORT);

        client.getOutputStream().write(("Hello,i am client").getBytes());

        client.getOutputStream().flush();

        client.close();
    }
}
