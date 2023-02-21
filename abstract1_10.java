// Abstract

/*
    - Abstract is considerd as a keyword in java.
    - Abstract class is such a class which contains zero or more abstract method in it.
    - Abstract method is such method which is only declare as a prototype but there is no body for that method.
    - If a class is abstract then we can-not create object of that class because that object is incomplete(same like cpp)
    - We can inherit that class, it is responsibility of a derived class to provide the defination for the abstract method.
    - If the derived class is unable to provide the defination then the compiler will generate error.
*/

// Abstract class and mehtod

abstract class Base
{
    public int a;

    Base(){a = 5;}       // abstrct class have a constructor

    public void fun()   // Concrete defination
    {
        System.out.println("Base fun");
    }

    public abstract void gun();     // Abstract method          // virtual void gun() = 0;
}


class Derived extends Base
{
    public int b;

    public void gun()   // Concrete defination for abstract class
    {
        System.out.println("Derived gun");
    }
}


class abstract1_10
{
    public static void main(String args[])
    {
        Derived obj = new Derived();
        obj.fun();
        obj.gun();

        // Base obj1 = new Base();      // Not allowed
    }
}