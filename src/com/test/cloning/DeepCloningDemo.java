package com.test.cloning;

class Cat
{
    int j;
    Cat(int j){this.j=j;}
}

class Dog implements Cloneable
{
    Cat c;
    int i;
    Dog(Cat c, int i){this.c=c; this.i=i;}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Cat c1 = new Cat(c.j);
        Dog d1 = new Dog(c1,i);
        return d1;
    }
}

public class DeepCloningDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat c = new Cat(20);
        Dog d = new Dog(c, 10);
        System.out.println(d.i+"...."+d.c.j);

        Dog d1 = (Dog) d.clone();
        d1.i=88;
        d1.c.j=99;
        System.out.println(d.i+"...."+d.c.j);
        System.out.println(d1.i+"...."+d1.c.j);

    }
}
