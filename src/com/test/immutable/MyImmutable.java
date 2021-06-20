package com.test.immutable;

public final class MyImmutable{

    private final int id;
    private final String name;
    private final Age age;


    public MyImmutable(int id, String name, Age age) throws CloneNotSupportedException {
        this.id = id;
        this.name = name;
        Age clonedObj = (Age) age.clone();
        /*Age clonedObj = new Age();*/
        clonedObj.setDay(age.getDay());
        clonedObj.setMonth(age.getMonth());
        this.age = clonedObj;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Age getAge() throws CloneNotSupportedException {
        Age clonedObj = (Age) age.clone();
        /*Age clonedObj = new Age();*/
        clonedObj.setDay(this.age.getDay());
        clonedObj.setMonth(this.age.getMonth());
        return clonedObj;
    }
}
