package com.test.singleton;

public enum SingletonEnum {
    // java ensures internally that enum value is instantiated only once.
    //  java Enums are globally accessible
    // drawback: not flexible i.e. does not allow lazy initialization.
    // JVM handles the creation and invocation of enum constructors internally
    INSTANCE;

    public void someMethod(){
        System.out.println("inside some Enum method...!!");
    }
}
