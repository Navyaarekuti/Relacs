package com.relacs.wrapper_object_class;

public class WrapperClass {
    public static void main(String[] args) {
        int i= 17;
        Integer wrappedNum = new Integer(17);
        System.out.println(wrappedNum.intValue());
        System.out.println("DEBUG");


        //Auto Boxing

        int num1= 35;
        Integer wrappednum = num1;
        System.out.println(wrappednum.intValue());
        int num2 = wrappednum; //Unboxing

        Integer i1= new Integer(19);
        int n = Integer.parseInt("8");
        Boolean b = new Boolean(true);
        Character c= new Character('c');
        c.getClass();
        c.notify();
        c.toString();

    }
}
