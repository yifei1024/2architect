package com.architect.java.error;

import java.util.concurrent.CountDownLatch;

/**
 * 线程数量超出限制
 */
public class NativeOutOfMemoryError {

    public static void main(String[] args) {

        for (int i = 0; ; i++) {
            System.out.println("i = " + i);
            new Thread(new HoldThread()).start();
        }
    }
}

class HoldThread extends Thread {
    CountDownLatch cd = new CountDownLatch(1);

    public HoldThread() {
        this.setDaemon(true);
    }

    public void run() {
        try {
            cd.await();
        } catch (InterruptedException e) {
        }
    }
}