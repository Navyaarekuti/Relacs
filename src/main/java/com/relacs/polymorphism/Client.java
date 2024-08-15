package com.relacs.polymorphism;

public class Client {
    public static void main(String[] args) {
        User u = new User();
        User inst = new Instructor();
        u.email = "nvya@j";
        inst.username = "Navya";
//        Instructor i = new User();  <- Not allowed
        System.out.println(u.email);
        System.out.println(u.username);


        System.out.println(inst.email);
        System.out.println(inst.username);
    }
}

class User{
    String username;
    String email;
}

class Instructor extends User {
    String batchName;

}
