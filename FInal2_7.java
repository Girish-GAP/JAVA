// Final Method 

/*
    - If method of class is final then we can't override that method.
    - Final methd can not overide but it gets inhereted in the derived class.
*/

import java.util.*;

class Base
{
    public void fun()
    {
        System.out.println("Base fun");
    }
    
    public final void gun()
    {
        System.out.println("Base gun");
    }
}

class Derived extends Base
{
    public void fun()       // Overiding
    {
        System.out.println("Derived fun");
    }

    // public void gun()   // Not Allowed
    // {
    //     System.out.println("Derived gun");
    // }

};


class Final2_7
{
    public static void main(String args[])
    {
       Derived obj = new Derived();
       obj.fun();
       obj.gun(); 
    }
}