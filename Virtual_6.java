// Runtime method dispacth

/*
 - Runtime method dispacth is exactly same as the concept of runtime ploymorphisam in cpp.
 - In java there is no such keywordlike virtual because every function in java is by default virtual in nature.
 - To achive runtime polymorphisam we need atleast :
   1) Atleast single level Inheritance
   2) Function redefination
   3) The concept of upcasting

*/

import java.lang.*;

class Base
{
    public int a;

    public void gun()       // concrete defination
    {
        System.out.println("Base gun");
    }

    public void sun()       // concrete defination
    {
        System.out.println("Base sun");
    }

}

class Derived extends Base
{
    public int b;

    public void gun()   // Overriding
    {
        System.out.println("Derived gun");
    }

    public void run()   // Concrete defination
    {
        System.out.println("Derived run");
    }

    
}

class Virtual_6
{
    public static void main(String args[])
    {
        // Base bobj = new Base();         // No casting
        // Derived dobj = new Derived();   // No casting

        // To make runtime polymorphisam we need to do upcasting
        // Base * bobj = new Derived(); // CPP
        Base bobj = new Derived();
        bobj.gun();     // Derived
        bobj.sun();     // Base

 
        
    }
}