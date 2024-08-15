package com.relacs.polymorphism.runtime;

public class Example1 {
    public static void main(String[] args) {
        A obj = new C();
        obj.print();
        System.out.println("--------------");
        obj = new B();
        obj.print();
        System.out.println("--------------");
        obj = new A();
        obj.print();

    }
}


class A{
    void print(){
        System.out.println("A");
    }
}

class B extends A{
    void print(){
        super.print();
        System.out.println("B");
    }
}
class C extends B{
    void print(){
        System.out.println("C");
    }
}