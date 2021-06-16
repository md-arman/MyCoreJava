package com.test.singleton;

public class SingletonThreadSafeHighPerf {
    private static SingletonThreadSafeHighPerf instance;

    private SingletonThreadSafeHighPerf(){}

    public static SingletonThreadSafeHighPerf getInstance(){
        if(null==instance){
            synchronized (SingletonThreadSafeHighPerf.class){
                if(null==instance)
                    instance=new SingletonThreadSafeHighPerf();
            }
        }
        return instance;
    }

}
