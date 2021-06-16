package com.test.singleton;

import java.io.*;

public class SingletonSerialized implements Serializable {
    private static SingletonSerialized instance = new SingletonSerialized();

    private SingletonSerialized(){}

    public static SingletonSerialized getInstance(){ return instance;}

    //Overcome Break of Singleton due to Serial/Deserialization
    protected Object readResolve(){
        return instance;
    }

}

class BreakSerialSingleton {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonSerialized instance1 = SingletonSerialized.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file123.txt"));
        out.writeObject(instance1);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("file123.txt"));
        SingletonSerialized instance2 = (SingletonSerialized) in.readObject();
        in.close();

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

    }

}

