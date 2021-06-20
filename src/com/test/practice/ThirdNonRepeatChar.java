package com.test.practice;

public class ThirdNonRepeatChar {

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
}
