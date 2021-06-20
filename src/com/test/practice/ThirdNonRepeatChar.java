package com.test.practice;

import java.util.*;

public class ThirdNonRepeatChar {

    //Method 1: nested loops
    public static void main(String[] args) {
        String str = "hherrrruvwwvqa";
        char [] ch = str.toCharArray();

        int counter = 0;
        boolean absentFlag= false;
        //O(n^2)
        for(int i=0; i<ch.length; i++)
        {
            char c1 = ch[i];
            boolean flag= false;
            for(int j=0; j<ch.length; j++)
            {
                if(i!=j && c1==ch[j]){
                    flag=true;
                    break;
                }
            }
            if(!flag)
                counter++;
            if(counter==3)
            {
                System.out.println(c1);
                absentFlag=true;
                break;
            }
        }
        if(!absentFlag)
            System.out.println("No third repeated char exists");
    }

    //ALTER Method ---- using one loop
    //mapping char and freq in one iteration and
    //putting in LinkedHashMap
    //Iterate linked hash map to get 3rd char with freq=1
    static
    {
        //String str = "hherrrruvwwvqa";
        String str="12ab";
        //check for empty/null str can be placed
        char [] ch = str.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        //assuming array is not empty or put following code inside previous check
        map.put(ch[0],1);

        for (int i=1; i<ch.length; i++)
        {
            if(null!=map.get(ch[i]))
            {
                int val = map.get(ch[i]);
                map.put(ch[i],++val);
            }
            else
            {
                map.put(ch[i],1);
            }
        }

        Set<Character> keys = map.keySet();
        int counter=0;
        for (Character key : keys)
        {
            if(map.get(key)==1)
                counter++;
            if(counter==3)
            {
                System.out.println("Third non rep char: "+key);
                break;
            }
        }
        if(counter!=3)
            System.out.println("No third repeat char present");
    }
}
