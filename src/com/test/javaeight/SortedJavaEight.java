package com.test.javaeight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedJavaEight {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<Integer>();
        Collections.addAll(myList, 0,10,25,5,20,15);

        System.out.println("****** ASC -- DNSO *******");
        List <Integer> dnsoList = myList.stream().sorted().collect(Collectors.toList());
        System.out.println(dnsoList);

        System.out.println("****** DESC -- Customised *******");
        List<Integer> cnsoList = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(cnsoList);

        System.out.println("****** DESC -- compareTo*******");
        List<Integer> cnsoList2 = myList.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
        System.out.println(cnsoList2);

        System.out.println("****** ASC -- compareTo*******");
        List<Integer> dnsoList2 = myList.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
        System.out.println(dnsoList2);

    }
}
