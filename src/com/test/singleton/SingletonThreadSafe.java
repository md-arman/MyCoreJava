package com.test.singleton;

public class SingletonThreadSafe {
    private static SingletonThreadSafe instance;

    private SingletonThreadSafe(){}

    public static synchronized SingletonThreadSafe getInstance(){
        if(null==instance)
            instance=new SingletonThreadSafe();
        return instance;
    }


}
