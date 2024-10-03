package com.relacs.threads.basic;

import com.relacs.threads.basic.BasicThread;

public class Client {
    public static void main(String[] args) {
        BasicThread basicthread = new BasicThread();
        Thread t = new Thread(basicthread);
        t.start();
        System.out.println(Thread.currentThread().getName());
    }
}
