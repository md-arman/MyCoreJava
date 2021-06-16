package com.test.immutable;

public class DemoImmutable {

    public static void main(String[] args) {
        Age age = new Age();
        age.setDay(25);
        age.setMonth("JAN");
        MyImmutable myImmutable = new MyImmutable(1, "TestName", age);
        System.out.println(myImmutable.getAge().getDay());

        myImmutable.getAge().setDay(30);
        System.out.println(myImmutable.getAge().getDay());


    }
}
