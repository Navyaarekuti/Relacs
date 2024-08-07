package com.relacs.intro_to_access_modifiers.package1;

public class JuniorStudent extends Student {
    public void printEmail(){
        System.out.println(email); // Accessible because email is protected
        // System.out.println(age); ERROR: age is private, cannot access
        System.out.println(psp);
        System.out.println(name);
    }
}
