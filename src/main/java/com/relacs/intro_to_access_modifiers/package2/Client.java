package com.relacs.intro_to_access_modifiers.package2;

import com.relacs.intro_to_access_modifiers.package1.Student;

public class Client {
    public static void main(String[] args) {
        Student st = new Student();
        st.name= "Anvesh";
        System.out.println(st.name);

        // System.out.println(st.age); <- ERROR age is private
        // System.out.println(st.email); <-- ERROR different
        // package and not a child class

        // System.out.println(st.psp); <- ERROR: default has
        // package level access
    }
}
