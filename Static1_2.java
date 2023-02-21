// Static concept of java is exactly same as cpp
// only static block is new

// static Characteristics

import java.util.*;


class Demo
{
    // non-static
    public int i;
    public int j;
    char l;  // by default public and default value

    // static
    public static int k;
    
    static      // Static block called before constructor  // call at load time
    {
        System.out.println("Static Block");
        k = 5;
    }

    public Demo()       // Called after object creation
    {
        System.out.println("Inside constructor");
    }


}




class Static1_2
{
    
    public static void main(String args[])
    {
        System.out.println("main ");
        System.out.println(Demo.k); // classname.varname
        Demo obj = new Demo();

        // class_name object_name = new class_name();

        System.out.println(obj.i);
        System.out.println(obj.k);

    }
}