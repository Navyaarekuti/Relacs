package com.relacs.polymorphism.runtime;

public class Example2 {
    public static void main(String[] args) {
        AA obj1 = new CC();
        obj1.print();
        System.out.println("--------------");
        obj1 = new BB();
        obj1.print();
        System.out.println("--------------");
        obj1 = new AA();
        obj1.print();

    }
}


class AA{
    void print(){
        System.out.println("AA");
    }
}

class BB extends AA{
    void print(){
        System.out.println("BB");
    }
    }

class CC extends BB{
    void print(){
        System.out.println("CC");
    }
}
