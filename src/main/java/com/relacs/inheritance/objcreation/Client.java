package com.relacs.inheritance.objcreation;

public class Client {
    public static void main(String[] args) {
        C c =new C();
    }

}
 class A{
    public A()
    {
        System.out.println("A");
    }
 }
  class B extends A {
      public B() {
          System.out.println("B");
      }
      public B(String s)
      {
          System.out.println("B:" +s);
      }
  }
    class C extends B{
//        public C(){
//            System.out.println("C");
//        }
        public C(){
            super("Hello");
            System.out.println("C");
        }
    }
