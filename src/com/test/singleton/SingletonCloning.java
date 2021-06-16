package com.test.singleton;

class A implements Cloneable{
    int i=10;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

//Singleton
class MySingleton extends A {
    private static MySingleton instance = new MySingleton();

    private MySingleton(){}

    public static MySingleton getInstance(){
        return instance;
    }

    //Overcome Break of Singleton due to Cloning:::::: override clone() method:
    // 1. just throw exception, OR
    // 2. return same instance

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //throw new CloneNotSupportedException();
        return instance;
    }
}


public class SingletonCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        MySingleton instance1 = MySingleton.getInstance();
        MySingleton instance2 = (MySingleton) instance1.clone();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }


}
