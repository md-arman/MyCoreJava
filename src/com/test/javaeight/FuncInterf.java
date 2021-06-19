package com.test.javaeight;

@FunctionalInterface
interface InterfaceSquareIt { public int m1(int x); }

@FunctionalInterface
interface InterfaceSum  { public void add(int x, int y); }


public class JavaEightFuncInterf {
    public static void main(String[] args) {

        InterfaceSquareIt i = z -> z*z;
        System.out.println(i.m1(5));

        InterfaceSum j = (a,b) -> {
            System.out.println(a+b);
            System.out.println(a+b);
        };
        j.add(4,15);

        //InterfaceSum k = str -> str.length();
    }

}
