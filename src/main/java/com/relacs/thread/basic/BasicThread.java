package com.relacs.thread.basic;

public class BasicThread implements Runnable{
    @Override
    public void run()
    {
        System.out.println("I running on thread:" + Thread.currentThread().getName());
    }
}
