package com.relacs.threads.number_printer;

import com.relacs.threads.NumberPrinter.Number_Printer;

public class Client {
    public static void main(String[] args) {
        com.relacs.threads.NumberPrinter.Number_Printer np = new Number_Printer();
        Thread t = new Thread(np);
        t.start();
        System.out.println("I am in main thread");

    }
}
