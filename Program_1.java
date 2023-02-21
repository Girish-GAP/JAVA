import java.lang.*;


class Program_1
{   
    public static void fun()
    {
        System.out.println("Hi");
    }

    // main is function with return type void and its an public static takes string args as a arguments.
    public static void main(String args[])
    {
        // Demo obj;    it's not an object it's just an referance.

        System.out.println("args[0]"  + args[1]);     // java Program_1 arrayOfInput

        // Dynamic object creation
        Demo obj1 = new Demo();
        Demo obj2 = new Demo(10,20);

        // Access class members
        obj1.fun();
        obj1.a = 5;

        // Program_1  obj =  new Program_1();
        fun();

    }
}


class Demo
{
    // characterisitcs
    public int a;
    public int b;

    // Behaviours
    public Demo()   // Default constructor
    {
        System.out.println("Inside default constructor");
    }

    public Demo(int a, int b)   // paramterized constructor
    {
        System.out.println("Inside paramterized constructor");
    }

    public void fun()
    {
        System.out.println("Inside fun");
    }

    public void gun()
    {
        System.out.println("Inside gun");
    }

}

