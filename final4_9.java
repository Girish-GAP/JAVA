// Final class

/*  
    - We can't inherit that class but we can create object of that class
      as a characteristics of another class.
    - Composite class : in following program characterisitcs of derived class 
      consider as a composite class.
*/

import java.lang.*;

final class Base
{
    public int a;
    public void fun()
    {
        System.out.println("Base fun");
    }
}


class Derived
{
    Base bobj = new Base();  // Composition

    public void gun()
    {
        System.out.println("Derived gun");
    }
}


class final4_9
{
    public static void main(String args[])
    {
        Derived dobj = new Derived();
        dobj.bobj.a = 5;
        dobj.bobj.fun();
        dobj.gun();
    }   
}