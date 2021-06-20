package com.test.immutable;

public class DemoImmutable {

    public static void main(String[] args) throws CloneNotSupportedException {
        Age age = new Age();
        age.setDay(25);
        age.setMonth("JAN");
        MyImmutable myImmutable = new MyImmutable(1, "TestName", age);
        System.out.println(myImmutable.getAge().getDay());

        //following won't be set as we have done deep cloning in constructor as well as the getter
        age.setMonth("FEB");
        myImmutable.getAge().setDay(30);
        System.out.println(myImmutable.getAge().getDay());


    }
}
