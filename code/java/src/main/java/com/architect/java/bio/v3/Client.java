package com.architect.java.bio.v3;

/**
 * @author yifei
 */
public class Client {

    public static void main(String[] args) throws Exception {
        for (int i = 0; ; i++) {
            System.out.println("Client "+i);
            new Thread(new ClientHandler(i)).start();
        }
    }
}
