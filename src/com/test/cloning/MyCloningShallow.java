package com.test.cloning;

class Contained {
    int j;
    Contained(int j)
    {
        this.j=j;
    }
}

class Major implements Cloneable
{
        int i;
        Contained contained;

        Major(int i, Contained contained)
        {
        this.i=i;
        this.contained=contained;
        }

        public Object clone() throws CloneNotSupportedException {
        return super.clone();
        }
}

public class MyCloningShallow {
    public static void main(String[] args) throws CloneNotSupportedException {

        Contained contained = new Contained(10);
        Major major = new Major(20,contained);
        System.out.println("j: "+major.contained.j+" .... i="+major.i);

        Major majorCloned = (Major) major.clone();
        majorCloned.i=88;
        majorCloned.contained.j=99;

        System.out.println("j: "+major.contained.j+" .... i="+major.i);
        System.out.println("j: "+majorCloned.contained.j+" .... i="+majorCloned.i);

    }




}
