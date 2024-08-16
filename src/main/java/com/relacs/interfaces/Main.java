package com.relacs.interfaces;

public class Main {
    public static void main(String[] args) {
     //   Animal a = new Animal() //This is wrong
        Animal a = new Dog();
        a.run();
        a.walk();
        a.eat();

    }
}
 interface Animal{
     void run();
     void walk();
     void eat();
 }

 class Dog implements Animal{
     @Override
     public void run() {
         System.out.println("Dog is running");
     }

     @Override
     public void walk() {
         System.out.println("Dog is walking");

     }

     @Override
     public void eat() {
         System.out.println("Dog is eating");
     }
 }