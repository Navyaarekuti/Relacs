package com.relacs.thread.basic;

public class Client {
    public static void main(String[] args) {
        BasicThread basicthread = new BasicThread();
        Thread t = new Thread(basicthread);
        t.start();
        System.out.println(Thread.currentThread().getName());
    }
}
