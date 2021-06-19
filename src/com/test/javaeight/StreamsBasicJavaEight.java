package com.test.javaeight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsBasicJavaEight {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(0); myList.add(5); myList.add(10);
        myList.add(15); myList.add(20); myList.add(25);

        myList.forEach(element -> System.out.print(" "+element));
        System.out.println();

        //NOTE the 'return' type below:
        //List<Integer> alist = myList.stream().filter(element -> element%2==0).collect(Collectors.toList());
        //System.out.println(alist);

        System.out.println("****** Print even numbers *******");
        myList.stream().filter(e1 -> e1%2==0).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println();

        System.out.println("****** Print (array)x(2) *******");
        myList.stream().map(e1 -> e1*2).collect(Collectors.toList()).forEach(e->System.out.print(" "+e));
        System.out.println();

        System.out.println("****** Print MIN value *******");
        Integer min = myList.stream().min((a,b) -> a.compareTo(b)).get();
        System.out.println(min);

        System.out.println("****** Print MAX value *******");
        Integer max = myList.stream().max((a,b) -> a.compareTo(b)).get();
        System.out.println(max);

        List<String> myListStr = new ArrayList<String>();
        myListStr.add("hello");
        myListStr.add("helloBye");
        myListStr.add("hi");
        //myListStr.add(null);
        ///Test for null using Optional?
        System.out.println("****** Print number of Strings less than length 5 *******");
        long l = myListStr.stream().filter(str->str.length()<5).count();
        System.out.println("No. of strings: "+l);

    }
}
