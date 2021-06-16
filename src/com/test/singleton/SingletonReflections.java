package com.test.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonReflections {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        SingletonEager firstInstance = SingletonEager.getInstance();
        SingletonEager secondInstance = null;

        Constructor [] constructors = SingletonEager.class.getDeclaredConstructors();
        for(Constructor con: constructors){
            con.setAccessible(true);
            secondInstance = (SingletonEager) con.newInstance();
            break;
        }

        System.out.println(firstInstance.hashCode());
        System.out.println(secondInstance.hashCode());
    }
}
