package com.relacs.intro_to_oops;

public class Client {
    public static void main(String[] args) {
        Student Navya = new Student();
        Navya.name = "Navya";
        Navya.age = 26;
        Navya.psp = 99.999999f;

        Student Anvesh = new Student();
        Anvesh.name = "Anvesh";
        Anvesh.age = 25;
        Anvesh.psp = 100;

        Navya.pauseCourse();
        Anvesh.printStudent();
    }
}
