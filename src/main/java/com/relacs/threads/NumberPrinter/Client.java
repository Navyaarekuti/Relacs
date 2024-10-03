package com.relacs.threads.NumberPrinter;

public class Client {

    public static void main(String[] args) {
        Number_Printer np = new Number_Printer();
        Thread t = new Thread(np);
        t.start();
        System.out.println("I am in main thread");

    }
}
