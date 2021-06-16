package com.test.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        System.out.println(SingletonEnum.INSTANCE);
        SingletonEnum.INSTANCE.someMethod();
    }
}
