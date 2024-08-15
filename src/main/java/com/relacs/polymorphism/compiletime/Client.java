package com.relacs.polymorphism.compiletime;

public class Client {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print();
        p.print("Navya");
    }
}
