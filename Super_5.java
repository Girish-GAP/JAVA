// Super Keyword

/*
    - This concept is only applicable in java.
    -  By using a super keyword we can access everything which is non-private of a base
       class from the derived class
    - We can use super keyword to :
        1) To access the characteristics of a base class.
        2) To call the behaviours of a base class.
        3) To call the constructor of a base class explicitly.
*/


import java.lang.*;


class Base
{
    public int a;
    public int b;

    public Base(int a)      // 1
    {
        System.out.println("Base Constructor a : " + a);
    }

    public void fun()
    {
        System.out.println("Inside fun");
    }
}



class Derived extends Base
{
    public int k;
    public int b;   // if not use super keyword then derived class access this variable.
    
    public Derived()        // 2
    {
        super(5);      // This will call to the Base constructor explicitly
        System.out.println("Derived constructor");
    }

    // We can access the base members by using super keyword.
    public void SuperAccess()
    {
        super.a = 5;
        super.fun();
    }
}

 
class super_5
{
    public static void main(String args[]) 
    {
        Base obj = new Derived();
        // obj.SuperAccess();

        // Base obj = new Base(5);
        // Derived obj = new Derived();

        
    }  
}


/* 
    Output :
        Base Constructor a : 5
        Derived constructor
        Inside fun
    
    1) After creating the object of derived class Control will go the Derived constructor but it's not called.
    2) Then it will check if derived inherited from some class or not ?
    3) If derived then it will check for super keyword at first line of derived constructor.
    4) Then control will go the Base class constructor and it's being called.
    5) Finally after base derived constructor will call.
*/