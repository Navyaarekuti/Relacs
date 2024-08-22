package com.relacs.interfaces.multiple_implements;

public class Client {
    public static void main(String[] args) {
        A a = new C();
        a.a();
    }
}

interface  A{
    int a();
}

interface B{
    int a();
}

class C implements A,B{


    @Override
    public int a() {
        return 0;
    }
}

