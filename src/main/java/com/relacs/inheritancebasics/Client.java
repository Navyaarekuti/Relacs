package com.relacs.inheritancebasics;

public class Client {
    public static void main(String[] args) {
        Instructor i = new Instructor();
        i.batchName = "Learning Java";
        i.login();
        i.username = "Navya";
        System.out.println(i.username);
        i.scheduleClass();
    }
}
