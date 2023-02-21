// Inheritance 

/*
    - In case of java inheretance is only applicable according to the architecture.
    - In java there is no such concept as public, private, protected inheritance.
    - In java according to the architecture the inheritance are classified into 3 parts.
    1) Single level
    2) Multi level
    3) Hirarchial
    - To avoid the ambiguti problem the multiple inheritance is removed from java.
*/

// Single level inheritance


import java.lang.*;


class Base
{
    public int a;
    public int b;

    public Base()
    {
        System.out.println("Base constructor");
    }

    public void fun()
    {
        System.out.println("Inside fun");
    }
}

class Derived extends Base      // class Derived : public Base1
{
    public int k;
    // public int a;
    // public int b;
    // public void fun();

    public Derived()
    {
        System.out.println("Derived constructor");
    }
}


class Inheritance1_4
{
    public static void main(String args[])
    {
        Derived obj = new Derived();
    }
}
