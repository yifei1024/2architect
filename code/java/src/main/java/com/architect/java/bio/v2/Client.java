package com.architect.java.bio.v2;

/**
 * @author yifei
 */
public class Client {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new ClientHandler(i)).start();
        }
    }
}
