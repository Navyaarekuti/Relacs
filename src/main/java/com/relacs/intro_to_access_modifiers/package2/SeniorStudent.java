package com.relacs.intro_to_access_modifiers.package2;

import com.relacs.intro_to_access_modifiers.package1.Student;

public class SeniorStudent extends Student {
    public void printEmail(){
        System.out.println(email);
        System.out.println(name);
//        System.out.println(age);
//        System.out.println(psp);
    }
}
