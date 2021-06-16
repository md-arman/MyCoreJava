package com.test.singleton;

public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy(){}

    public static SingletonLazy getInstance(){
        if(null== instance){
            instance =new SingletonLazy();
        }
        return instance;
    }
}
