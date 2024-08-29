package com.relacs.staticexample;

public class Client {
    public static void main(String[] args) {
        System.out.println(Student.uniName);
        Student s1=  new Student();
        s1.id=1;
        s1.name = "Navya";
        Student s2=  new Student();
        s2.id=1;
        s1.name = "Jeevan";


    }
}
 class Student{
    public static String uniName = "LPU";
    public int id;
    public String name;

 }